
public class EmployeeTest {
    public static void main(String[] args) {
        Employee obj1=new Employee("abdul","Ibrahim",25000);
        Employee obj2=new Employee("abdul","Mahad",20000);
        System.out.println( obj1.getfirstName() +"  "+obj1.getlastName()+"  " + " yearly salary of obj1= "+obj1.yearlySalary(25000.0)+"  "+"yearly salary of obj1 after including 10% of salary= "+obj1.finalYearlySalary(25000.0));
        System.out.println( obj2.getfirstName()+"   "+obj2.getlastName()+"  " + "yearly salary of obj2= "+obj2.yearlySalary(20000.0)+"  "+"yearly salary of obj1 after including 10% of salary= "+obj2.finalYearlySalary(25000.0));
       
    }
    
}
