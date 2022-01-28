import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Panther ID: ");
        String PantherID = scn.nextLine();
        ILoveDataStructure(PantherID);
    }

    public static void ILoveDataStructure(String PantherID) {
        int evenNumCount = 0, oddNumCount = 0;

        for (int i = 0; i < PantherID.length(); i++) {
            if (Integer.parseInt(String.valueOf(PantherID.charAt(i))) % 2 == 0) {
                evenNumCount++;
            } else {
                oddNumCount++;
            }
        }

        if (evenNumCount > oddNumCount) {
            System.out.println("Now I am an expert using Data Structure!");
        } else {
            System.out.println("I will get an A+ in the final exam");
        }
    }
}