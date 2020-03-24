
public class rectangleTest {
    public static void main(String[] args) {
        Rectangle obj=new Rectangle();
       obj.setlength(2.3);
       obj.setwidth(4.8);
       System.out.println("length=  " + obj.getlength()+ "  "+ "width= " + obj.getwidth());
       System.out.println("perimeter of rectangle= "+obj.perimeter());
       System.out.println("Area of rectangle= " +obj.area());
        
    }
    
}
