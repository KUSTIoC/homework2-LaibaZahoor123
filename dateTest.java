

public class dateTest {
    public static void main(String[] args) {
       Date obj=new Date(3,24,2020);
       obj.setday(15);
       obj.setmonth(3);
       obj.setyear(2019);
       
       System.out.printf("Date =   "+obj.displayDate());

    }
    
}
