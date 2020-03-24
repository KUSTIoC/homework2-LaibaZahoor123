

public class InvoiceTest {
    public static void main(String[] args) {
        
        Invoice obj1= new Invoice("C101","os",5,200.0);
        obj1.setpartNum("C100");
        obj1.setpartDisc("Database");
        obj1.setpricePerItem(30.0);
        obj1.setquantity(3);
        
        System.out.println("        INVOICE dETAIL               ");
        System.out.println("PART NUMBER= "+obj1.getpartNum());
        System.out.println("PART DISCRIPTION= "+obj1.getpartDisc());
        System.out.println("Price per item= "+obj1.getpricePerItem());
        System.out.println("Invoice Amount= "+obj1.getinvoiceAmount());
                
        
    }
    
}
