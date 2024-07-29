import java.util.Scanner;

public class doWhilePratices {
//    Sayıların Cəmi:
//    İstifadəçidən sayılar alaraq bu sayıların cəmini hesablayın. İstifadəçi cəmi görmək
//    istədikdə dövr dayansın və cəmi göstərsin. İstifadəçi davam
//    etmək istəyirsə, dövr yenidən başlasın.

    public static void doWhilePraticesMethod(){
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
