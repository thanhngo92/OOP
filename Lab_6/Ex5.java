class Employee
{
    protected String ID;
    protected String fullName;
    protected int yearJoined;
    protected double coefficientsSalary;
    protected int numDaysOff;

    public Employee()
    {
        ID = "";
        fullName = "";
        yearJoined = 2020;
        coefficientsSalary = 1.0;
        numDaysOff = 0;
    }

    public Employee(String ID, String fullName, double coefficientsSalary)
    {
        this.ID = ID;
        this.fullName = fullName;
        this.coefficientsSalary = coefficientsSalary;
        yearJoined = 2020;
        numDaysOff = 0;
    }

    
    public Employee(String ID, String fullName, double coefficientsSalary, int yearJoined, int numDaysOff)
    {
        this.ID = ID;
        this.fullName = fullName;
        this.coefficientsSalary = coefficientsSalary;
        this.yearJoined = yearJoined;
        this.numDaysOff = numDaysOff;
    }

    public double getSenioritySalary() { return ((yearJoined > 4) ? yearJoined - 4 : 1) * coefficientsSalary/100.0; }
    public String considerEmulation()
    {
        if(numDaysOff <= 1) return "A";
        if(numDaysOff >= 2 && numDaysOff <= 3) return "B";
        return "C";
    }

    public double getSalary()
    {
        double emulation_Coeffient = (considerEmulation().equals("A") ? 1.0 : (considerEmulation().equals("B") ? 0.75 : 0.5));
        return 1150.0 + 1150.0*(coefficientsSalary + emulation_Coeffient) + getSenioritySalary(); 
    }
}

class Manager extends Employee
{
    private String position;
    private String department;
    private double salaryCoeffientPosition;

    public Manager()
    {
        super();
        position = "Leader";
        department = "Building";
        salaryCoeffientPosition = 5.0;
    }

    public Manager(String ID, String fullName, double coefficientsSalary, String position, double salaryCoeffientPosition)
    {
        super(ID, fullName, coefficientsSalary);
        this.position = position;
        this.salaryCoeffientPosition = salaryCoeffientPosition;
        yearJoined = 2024;
        numDaysOff = 0;
    }

    public Manager(String ID, String fullName, double coefficientsSalary, int yearJoined, int numDaysOff, String position, double salaryCoeffientPosition, String department)
    {
        super(ID, fullName, coefficientsSalary, yearJoined, numDaysOff);
        this.position = position;
        this.salaryCoeffientPosition = salaryCoeffientPosition;
        this.department = department;
    }

    @Override
    public String considerEmulation() { return "A"; }
    public double bonusByPosition() { return 1150.0*salaryCoeffientPosition; }
    @Override
    public double getSalary()
    {
        return 1150.0 + 1150.0*(coefficientsSalary + 1.0) + getSenioritySalary() + bonusByPosition();
    }
}

public class Ex5 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new Employee("E001", "Nguyen Van A", 2.5);
        employees[1] = new Employee("E002", "Tran Thi B", 3.0, 2019, 2);
        employees[2] = new Manager("M001", "Le Van C", 4.0, "Director", 6.0);
        employees[3] = new Manager("M002", "Pham Thi D", 3.5, 2018, 1, "Leader", 5.0, "IT");

        for (Employee e : employees) {
            System.out.println("-------------------------");
            System.out.println("ID: " + e.ID);
            System.out.println("Name: " + e.fullName);
            System.out.println("Year Joined: " + e.yearJoined);
            System.out.println("Salary: " + e.getSalary());
            System.out.println("Emulation Type: " + e.considerEmulation());
        }
    }
}
