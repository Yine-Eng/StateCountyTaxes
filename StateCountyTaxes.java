import java.util.Scanner; // Needed for the Scanner class

public class StateCountyTaxes
{
   public static void main(String[] args)
   {
      // Constants


      /* Variables
     double purchaseamount = sc.nextDouble();

     double statesalestax = 0.05 * purchaseamount;

     double countysalestax = 0.03 * purchaseamount;

     double totalsalestax = statesalestax + countysalestax;

     double totalpurchase = purchaseamount + totalsalestax;*/

      // Create a Scanner object for keyboard input.
     Scanner sc = new Scanner(System.in);


      // Get the amount of the purchase.
     System.out.println("Enter the amount of your purchase $");
     double initialpurchaseamount = sc.nextDouble();
     System.out.println("The amount of purchase you entered is $" + initialpurchaseamount);


     // Let's confirm user input.
     System.out.println("Please confirm your input");
       double confirmedpurchaseamount = sc.nextDouble();
     System.out.println("The cost of your item(s) without taxes is $" + confirmedpurchaseamount);


      // Calculate the state sales tax.
     double statesalestax = 0.05 * confirmedpurchaseamount;
       System.out.println("Your state sales tax is $" + statesalestax);

      // Calculate county sales tax.
     double countysalestax = 0.03 * confirmedpurchaseamount;
     System.out.println("Your county sales tax is $" + countysalestax);

      // Calculate the total sales tax
     double totalsalestax = statesalestax + countysalestax;
     System.out.println("Your total sales tax is $" + totalsalestax);

      // Calculate the total purchase cost.
     double totalpurchase = confirmedpurchaseamount + totalsalestax;
     System.out.println("Your total purchase cost when taxes are applied is $" + totalpurchase);

      // Display the results.
   }
}
