public class Fraction 
{
    private int numberator;
    private int denominator;
    
    public Fraction()
    {
        numberator = 0;
        denominator = 1;
    }
    
    public Fraction(int num, int den)
    {
        numberator = num;
        denominator = den;
        reducer();
    }
    
    public Fraction add(Fraction f)
    {
        int num = this.numberator*f.denominator + this.denominator*f.numberator;
        int den = this.denominator*f.denominator;
        return new Fraction(num, den);
    }
    
    public Fraction sub(Fraction f)
    {
        int num = this.numberator*f.denominator - this.denominator*f.numberator;
        int den = this.denominator*f.denominator;
        return new Fraction(num, den);
    }
    
    public Fraction mul(Fraction f)
    {
        int num = this.numberator*f.numberator;
        int den = this.denominator*f.denominator;
        return new Fraction(num, den);
    }
    
    public Fraction div(Fraction f)
    {
        int num = this.numberator*f.denominator;
        int den = this.denominator*f.numberator;
        return new Fraction(num, den);
    }
    
    public void reducer()
    {
        if(numberator == 0)
        {
            denominator = 1;
            return;
        }
        int gcd = gcd(Math.abs(numberator), Math.abs(denominator));
        
        numberator /= gcd;
        denominator /= gcd;
        if(denominator < 0)
        {
            numberator = -numberator;
            denominator = -denominator;
        }
    }
    
    public int gcd(int a, int b)
    {
        return (b == 0) ? a : gcd(b, a % b);
    }
    
    public String toString()
    {
        return "Fraction["+numberator+", " +denominator+"]";
    }
}