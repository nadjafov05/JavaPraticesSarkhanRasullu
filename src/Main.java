import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueInput;

        do {
            int sum = 0;
            int number;

            do {
                System.out.print("Sayı daxil edin (və ya cəmi görmək üçün 0 daxil edin): ");
                number = scanner.nextInt();
                if (number != 0) {
                    for (int i=1;i<=number;i++){
                        sum+=i;
                    }
                }
            } while (number != 0);

            System.out.println("Cəm: " + sum);

            System.out.print("Davam etmək istəyirsinizmi? (hə/hayır): ");
            continueInput = scanner.next();

        } while (continueInput.equalsIgnoreCase("he"));

        scanner.close();
    }
}
