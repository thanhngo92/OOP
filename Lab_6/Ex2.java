class Person 
{
    protected String name;
    protected String address;
    
    public Person(String name, String address)
    {
        this.name = name;
        this.address = address;
    }
    
    public String getName() { return name; }
    public String getAdress() { return address; }
    
    public void setAddress(String address) { this.address = address; }
    
    @Override 
    public String toString()
    {
        return String.format("name: %s - address: %s", name, address);
    }
    
}

class Student extends Person 
{
    private String program;
    private int year;
    private double fee;
    
    public Student(String name, String address, String program, int year, double fee)
    {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }
    
    public String getProgram() { return program; }
    public void setProgram() { this.program = program; }
    public int getYear() { return year; }
    public void setYear() { this.year = year; }
    public double getFee() { return fee; }
    public void setFee() { this.fee = fee; }
    
    @Override
    public String toString()
    {
        return String.format("name: %s - address: %s - program: %s - year: %d - fee: %.1f", name,address,program,year,fee);
    }
}

class Staff extends Person 
{
    private String school;
    private double pay;
    
    public Staff(String name, String address, String school, double pay)
    {
        super(name,address);
        this.school = school;
        this.pay = pay;
    }
    
    public String getSchool() { return school; }
    public double getPay() { return pay; }
    public void setSchool(String school) { this.school = school; }
    public void setPay(double pay) { this.pay = pay; }
    
    @Override
    public String toString()
    {
        return String.format("name: %s - address: %s - school: %s - pay: %.1f",name,address,school,pay);
    }
    
}

public class Ex2 
{
    public static void main(String[] args)
    {
        Person ps = new Person("Hai","Tan phong - 1");
        System.out.println(ps);
        Student st = new Student("Sieu", "Hai Phong", "CLC", 2024, 56000);
        System.out.println(st);
        Staff sf = new Staff("Nhan", "Binh Duong", "Nguyen Dinh Chieu", 50002);
        System.out.println(sf);
    }
}







