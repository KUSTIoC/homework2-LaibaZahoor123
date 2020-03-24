

public class Rectangle {
    private double length=1;
    private double width=1;
    private double perimeter;
    private double area;
    


    public void setlength(double length) {
        if((length>0.0) && (length<20.0))
                {
        this.length = length;}
    }

    public double getlength() {
        return length;
    }


    public double getwidth() {
        return width;
    }

    public void setwidth(double width) {
        if((width>0.0) && (width<20.0)){
        
        this.width = width;}
    }
    public double perimeter()
    {
         return perimeter=2*(length+width);
    }
    public double area()
    {
      return  area=length*width;
    }
    
}
