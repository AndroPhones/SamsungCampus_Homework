import java.util.Scanner;
import java.util.Locale;

public class Test_1_5_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();

        System.out.println(((-3 <= x && x <= 5) || (9 <= x && x <= 15)) ? "true":"false");
    }
}
//Так как через -3 <= x && x <= 5 и 9 <= x && x <= 15, мы проверяем входит ли x в тот или другой диапазон

//Тест из 6 вопросов 1.5 Задача 2