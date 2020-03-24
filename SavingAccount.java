

public class SavingAccount {
    private static  double annualInterestRate;
    private double savingBalance;
    private double monthlyInterest;

    public SavingAccount(double savingBalance) {
        this.savingBalance = savingBalance;
    }
    public static void setannualInterestRate(double annualInterestRate)
    {
    SavingAccount.annualInterestRate=annualInterestRate;
    }
    
    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }


    public double getsavingBalance() {
        return savingBalance;
    }

    public static double getannualInterestRate()
    {
        return annualInterestRate;
    }
    public double monthlyInterestRate()
    {
        monthlyInterest=(savingBalance*annualInterestRate)/12;
        return monthlyInterest+savingBalance;
    }
    public static double modifyInterestRate()
    {
        return annualInterestRate=0.05;
    }
    
}
