
public class Date {
     private int day;
    private int month;
    private int year;
    private String date;

    public Date(int day, int month, int year) {
        if((month<0 || month>=13)&&(day<0 || day>32)&& (year<0 || year>=1000000))
        {
            throw new IllegalArgumentException("invalid date" );
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }


    public void setday(int day) {
        this.day = day;
    }

    public int getday() {
        return day;
    }


    public void setmonth(int month) {
        this.month = month;
    }

    public int getmonth() {
        return month;
    }

    public void setyear(int year) {
        this.year = year;
    }


    public int getyear() {
        return year;
    }

    public String displayDate()
    {
        return month+"/"+day+"/"+year;
    }
    
       
    
    
}
