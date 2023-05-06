import java.util.Scanner;
public class UserDialogs {
    public static String getUserName(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your name: ");
            String name = scanner.nextLine().trim();
            if (name.length() >= 2){
                return name;
            }
            System.out.println("Name is too short. Try again.");
        }
    }
    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select calculation (A-add, S-subtract, D-divide, M-multiply):");
            String calc = scanner.nextLine().trim().toUpperCase();
            switch (calc) {
                case "A": return "ADD";
                case "S": return "SUB";
                case "D": return "DIV";
                case "M": return "MUL";
                default:
                    System.out.println("Wrong calculation. Try again.");
            }
        }
    }
    public static int getValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int val = scanner.nextInt();
        return val;
    }

    public static char getChar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sign:");
        System.out.println("[W] for White");
        System.out.println("[B] for Blue");
        System.out.println("[Y] for Yellow");
        System.out.println("[G] for Green");
        String chosenLetter = scanner.nextLine();
        chosenLetter = chosenLetter.toUpperCase();

        return chosenLetter.charAt(0);
    }
}
