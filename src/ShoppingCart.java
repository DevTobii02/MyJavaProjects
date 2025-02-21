import java.util.Scanner;

public class ShoppingCart {
    public  static  void main(String [] args) {
        // Creating A Shopping Cart
        Scanner ShoppingCart = new Scanner(System.in);
        String ItemName;
        double Price;
        int Quantity;
        char Currency = '$';
        double Total;

        System.out.print("What Item Would Like To Buy :  ");
        ItemName = ShoppingCart.nextLine();
        //System.out.println(ItemName);  // Prints Item Back To The Terminal or User

        System.out.print("What The Price Per Unit : ");
        Price = ShoppingCart.nextDouble();
        //System.out.println(Price);

        System.out.print("How Many Quantity Are You Getting? : ");
        Quantity = ShoppingCart.nextInt();
        //System.out.println(Quantity);

        Total = Price * Quantity;
        System.out.println(Total);
        System.out.println("You Have Bought The Following Items : "  +  Quantity  +  " "  + ItemName +  's' );
        System.out.print("Your Total Is : " + Currency + Total);

        ShoppingCart.close();
    }
}