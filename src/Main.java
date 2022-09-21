import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int start, plus, end, thousand = 1000;
        System.out.println("Введите сумму баланса счета до пополнения");
        Scanner scanner = new Scanner(System.in);
        start = scanner.nextInt();
        System.out.println("Введите сумму, на которую хотите пополнить счёт");
        Scanner scan = new Scanner(System.in);
        plus = scanner.nextInt();
        if (plus < thousand) {
            end = start + plus;
            System.out.println("Баланс счета будет составлять " + end);
        } else {
            end = (plus / 100) + start + plus;
            System.out.println("Баланс счета будет составлять " + end);
            System.out.println("Бонус составил " + plus / 100);
        }

    }
}