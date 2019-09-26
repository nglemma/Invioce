import invoice.Invoice;
import java.util.Scanner;
public class invoicetest 
{
    public static void main(String[] args)
    {
        Invoice shop = new Invoice("Nill","Nill",0,0.0);
        
        System.out.println("Please enter the Part Number");
        Scanner input1 = new Scanner(System.in);
        String partholder= input1.next();
        shop.setPartNumber(partholder);
        
        System.out.println("Please enter the part Description");
        Scanner input2 = new Scanner(System.in);
        String description = input2.next();
        shop.setPartDescription(description);
        
        System.out.println("Please enter the number of items you purchased");
        Scanner input3 = new Scanner(System.in);
        int items = input3.nextInt();
        shop.setQuantity(items);
        
        System.out.println("Please enter the price of item you purchased");
        Scanner input4 = new Scanner(System.in);
        int price = input4.nextInt();
        shop.setPrice(price);
        
        shop.getInvoiceAmount();
        
    }
    
}
