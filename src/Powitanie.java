
import java.util.Scanner;

public class Powitanie {
    public static void main(String[] args) {
        String[] imiona = new String[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 5 imion");
        imiona[0] = scanner.nextLine();
        imiona[1] = scanner.nextLine();
        imiona[2] = scanner.nextLine();
        imiona[3] = scanner.nextLine();
        imiona[4] = scanner.nextLine();
        for (int i=imiona.length -1; i>=0; i--){
            System.out.println("Cześć " + imiona[i]);

        }
    }
}