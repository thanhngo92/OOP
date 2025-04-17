abstract class PaymentMethod
{
    protected double balance;
    public PaymentMethod (double balance) { this.balance = balance; }

    public abstract boolean processPayment(double amount);
    public abstract String getPaymentDetails();

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }
}

interface Refundable { public boolean refund(double amount); }
class CreditCardPayment extends PaymentMethod implements Refundable
{
    private String cardNumber;
    private String cardHolder;
    public static final double OVERDRAFT_LIMIT = 5000.0;

    public CreditCardPayment(String cardNumber, String cardHolder, double balance)
    {
        super(balance);
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public boolean processPayment(double amount)
    {
        if(getBalance() >= amount && amount <= OVERDRAFT_LIMIT)
        {
            setBalance(getBalance() - amount);
            return true;
        }
        return false;
    }

    @Override
    public boolean refund(double amount)
    {
        setBalance(getBalance() + amount);
        return true;
    }

    @Override
    public String getPaymentDetails()
    {
        return String.format("cardNumber: %s - cardHolder: %s - Balance: %.1f",cardNumber,cardHolder,getBalance());
    }
}

class PayPalPayment extends PaymentMethod
{
    private String email;

    public PayPalPayment(String email, double balance)
    {
        super(balance);
        this.email = email;
    }



    public String getEmail() { return this.email; }
    public void setEmail(String email) { this.email = email; }
    @Override
    public boolean processPayment(double amount)
    {
        if(getBalance() >= amount)
        {
            setBalance(getBalance() - amount);
            return true;
        }
        return false;
    }
    @Override
    public String getPaymentDetails()
    {
        return String.format("Email: %s - Balance: %.1f",this.email,getBalance());
    }
}

class Transaction{
    private PaymentMethod paymentMethod;
    private double amount;

    public Transaction(PaymentMethod paymentMethod, double amount)
    {
        this.paymentMethod  = paymentMethod;
        this.amount = amount;
    }

    public boolean execute()
    {
        if(paymentMethod.processPayment(this.amount))
            return true;
        return false;
    }
    public boolean issueRefund()
    {
        if(this.paymentMethod instanceof Refundable)
        {
            Refundable r = (Refundable) paymentMethod;
            return r.refund(amount);
        }
        return false;
    }
    public String getPaymentDetails()
    {
        return paymentMethod.getPaymentDetails() + " - execute: " + execute() + " - issueRefund: " + issueRefund() + " - balance: " + getBalance();
    }
    public double getBalance()
    {
        return paymentMethod.getBalance();
    }
}

public class PaymentProcessor
{
    public static void main(String[] args) {
        PaymentMethod p = new CreditCardPayment("102E","003", 4000);
        System.out.println(p.getPaymentDetails());
        System.out.println(p.getBalance());
        PaymentMethod q = new PayPalPayment("882SLE", 7500.0);
        System.out.println(q.getPaymentDetails());
        Transaction tst = new Transaction(p, 4300);
        System.out.println(tst.getPaymentDetails());

    }
}