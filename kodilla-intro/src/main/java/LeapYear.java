import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nSprawdzanie lat przestępnych");
        System.out.println("Podaj rok do sprawdzenia: ");
        int year = Integer.parseInt(sc.nextLine());

        String timing;

        if (year<2023){
            timing = "był";
        } else if (year>2023){
            timing = "będzie";
        } else {
            timing = "jest";
        }

        String answer = (year%4==0 && year%100!=0) || year%400==0 ? timing + " przestępny." : " nie "+timing+" przestępny.";
        System.out.println("Rok " + year +" "+ answer);
    }
}
