
public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;
    private double yearlySalary;
    private double finalYearlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }


    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getfirstName() {
        return firstName;
    }


    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public String getlastName() {
        return lastName;
    }

    public void setmonthlySalary(double monthlySalary) {
        if(monthlySalary>=0)
        this.monthlySalary = monthlySalary;
    }

    public double getmonthlySalary() {
        return monthlySalary;
    }

    public  double yearlySalary(double monthlySalary)
    {
       return yearlySalary=monthlySalary*12;
    }
    public double finalYearlySalary(double monthlySalary )
    {
       return finalYearlySalary=(monthlySalary+(10*monthlySalary)/100)*12;
    }
    
    
    
    
    
    
}
