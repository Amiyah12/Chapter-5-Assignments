import java.util.Scanner;

public class ShadyRestRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your bed selection, 1 for queen bed, 2 for a king, or 3 for a king and a pullout couch:");

        String bedSelection = scanner.nextLine();

        switch(bedSelection)
        {
            case "1":
                System.out.println("Queen bed selected at $125");
                break;
            case "2":
                System.out.println("King bed selected at $139");
                break;
            case "3":
                System.out.println("King bed and pullout couch selected at $165");
                break;
        }
    }
}
