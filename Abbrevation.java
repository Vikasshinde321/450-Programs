import java.util.Scanner;
import java.io.*;
public class Abbrevation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your First name: ");
        char firstname = br.readLine().charAt(0);

        System.out.print("Enter middle Name: ");
        char midname = br.readLine().charAt(0);

        System.out.print("Enter your last name: ");
        String lastname = br.readLine();

        System.out.println("\nAbbreviated Name: " + firstname + "." + midname + "." + lastname);
    }
}


