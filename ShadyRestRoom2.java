import java.util.Scanner;

public class ShadyRestRoom2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your bed selection, 1 for queen bed, 2 for a king, or 3 for a king and a pullout couch:");
        String bedSelection = scanner.nextLine();

        int price = 0;
        int lakeViewFee = 15;
        boolean validBedType = false;

        switch(bedSelection)
        {
            case "1":
                price = 125;
                validBedType = true;
                System.out.println("Queen bed selected at $" + price);
                break;
            case "2":
                price = 139;
                validBedType = true;
                System.out.println("King bed selected at $" + price);
                break;
            case "3":
                price = 165;
                validBedType = true;
                System.out.println("King bed and pullout couch selected at $" + price);
                break;
        }
        if (validBedType) {
            System.out.println("Enter your view selection, 1 for lake, 2 for park view:");
            String viewSelection = scanner.nextLine();
            System.out.println(viewSelection);
            if (viewSelection.equals("1")) {
                System.out.println("Your total bill is: $" + (price + lakeViewFee));
            } else if (viewSelection.equals("2")) {
                System.out.println("Your total bill is: $" + price);
            } else {
                System.out.println("Please enter a valid view, we've defaulted it to lake since we like money.");
                System.out.println("Your total bill is: $" + (price + lakeViewFee));
            }
        }
    }
}
