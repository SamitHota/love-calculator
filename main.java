// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String Yname = sc.nextLine();
        System.out.println("Enter Your Partner's Name:");
        String Pname = sc.nextLine();
        System.out.print("Hii, " + Yname + ". Your partner " + Pname + " loves you " + (int)(Math.random() * 100) + "%");


    }
}



