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
        
       
        
    }
    
}
