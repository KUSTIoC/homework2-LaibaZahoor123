
public class SavingAccountTest {
    public static void main(String[] args) {
        SavingAccount saver1=new SavingAccount(2000);
        SavingAccount saver2=new SavingAccount(3000);
        System.out.println("balance of saver1= "+saver1.getsavingBalance());
        System.out.println("balance of saver2= "+saver2.getsavingBalance());
        System.out.println("New balance of saver1= "+saver1.monthlyInterestRate());
        System.out.println("New balance of saver2= "+saver2.monthlyInterestRate());
        saver1.modifyInterestRate();
        saver2.modifyInterestRate();
        System.out.println("New balance of saver1 after modification= "+saver1.monthlyInterestRate());
        System.out.println("New balance of saver2 after modification= "+saver2.monthlyInterestRate());
        
        

    }
    
}
