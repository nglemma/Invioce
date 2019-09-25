
package invoice;

public class Invoice 
{

    private String partNumber;
    private String partDescription;
    private int quantity;
    private double price;
    
    public Invoice(String Pnumber,String Pdescription,int quanti,double price)
    {
     Pnumber=partNumber;
     Pdescription = partDescription;
     quanti = quantity;
     this.price=price;
    }

    public String getPartNumber() 
    {
        return partNumber;
    }

    public void setPartNumber(String partNumber) 
    {
        this.partNumber = partNumber;
    }

    public String getPartDescription() 
    {
        return partDescription;
    }

    public void setPartDescription(String partDescription) 
    {
        this.partDescription = partDescription;
    }

    public int getQuantity() 
    {
        return quantity;
    }

    public void setQuantity(int quantity) 
    {
        this.quantity = quantity;
    }

    public double getPrice() 
    {
        return price;
    }

    public void setPrice(double price) 
    {
        this.price = price;
    }
    double amount;
    public double getInvoiceAmount()
    {
        if(quantity <= 0 )
        {
            quantity=0;
            System.out.println("Please enter a figure greater than zero(0)");
        }
        else if(price<=0.0)
        {
            price = 0;
            System.out.println("Please enter a price greater than zero(0)");
        }
        else
        {
            amount = quantity * price;
            System.out.printf("Total amount for goods purchased is\n%.2f\n ",amount);
            
        }
      return amount;
    }
   
}
