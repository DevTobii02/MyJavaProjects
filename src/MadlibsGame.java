import java.util.Scanner;

public class MadlibsGame {
    public static  void main (String [] args) {
        //Creating  A Mad libs Game
        Scanner MadLib = new Scanner(System.in);
        String Adjective1;
        String Noun1;
        String Adjective2;
        String Verb1;
        String Adjective3;

        System.out.print("Enter An Adjective (A Description): ");
        Adjective1 = MadLib.nextLine();
        System.out.print("Enter A Noun  (A Person, An Animal or A Thing):  ");
        Noun1 = MadLib.nextLine();
        System.out.print("Enter An Adjective (A Description) : ");
        Adjective2 = MadLib.nextLine();
        System.out.print("Enter A Verb  (Word Ending with An ing): ");
        Verb1 = MadLib.nextLine();
        System.out.print("Enter An Adjective (A Description) : ");
        Adjective3 = MadLib.nextLine();

        System.out.println("\n Today I went to a  " +  Adjective1 + " Zoo. In the exhibit, i saw a  " + Noun1 + ", " + Noun1 + " was "  +  Adjective2 + " and " + Verb1 + " ! " + " I was " + Adjective3 + " ! " );
        MadLib.close();
    }
}