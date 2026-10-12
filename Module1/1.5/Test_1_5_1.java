import java.util.Scanner;
import java.util.Locale;

public class Test_1_5_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();

        System.out.println(3 <= x && x <= 8 ? "true":"false");
    }
}
//Так как через 3 <= x && x <= 8 мы проверяем входит ли x в заданный диапазон [3;8]

//Тест из 6 вопросов 1.5 Задача 1