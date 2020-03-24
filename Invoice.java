

public class Invoice {
    private String partNum;
    private String partDisc;
    private int quantity;
    private double pricePerItem;
    private double invoice;

    public Invoice(String partNum, String partDisc, int quantity, double pricePerItem) {
        this.partNum = partNum;
        this.partDisc = partDisc;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public void setpartNum(String partNum) {
        this.partNum = partNum;
    }

    public String getpartNum() {
        return partNum;
    }


    public void setpartDisc(String partDisc) {
        this.partDisc = partDisc;
    }

    public String getpartDisc() {
        return partDisc;
    }


    public void setquantity(int quantity) {
        if(quantity<0)
        {
            this.quantity=0;
        }
        this.quantity = quantity;
    }

    public void setpricePerItem(double pricePerItem) {
        if(pricePerItem<0)
        {
            this.pricePerItem=0;
        }
        this.pricePerItem = pricePerItem;
    }



    public int getItemPurchased() {
        return quantity;
    }

    public double getpricePerItem() {
        return pricePerItem;
    }
    public double getinvoiceAmount(){
        invoice=quantity*pricePerItem;
        return invoice;
    }
    
}
