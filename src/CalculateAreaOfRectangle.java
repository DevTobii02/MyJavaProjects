import java.util.Scanner;

public class CalculateAreaOfRectangle {
    public  static  void main(String[] args) {
        // Calculate Area Of Rectangle
        double Width = 0;
        double Height = 0;
        double Area = 0;

        Scanner EnterWidth = new Scanner(System.in);
        System.out.print("Enter Your Width : ");
        Width = EnterWidth.nextDouble();

        Scanner EnterHeight = new Scanner(System.in);
        System.out.print("Enter Your Height : ");
        Height = EnterHeight.nextDouble();


        Area = Width * Height;
        System.out.println("Your Area Is : " + Area + "cm");

        EnterWidth.close();
        EnterWidth.close();
        //EnterArea.close();
    }
}