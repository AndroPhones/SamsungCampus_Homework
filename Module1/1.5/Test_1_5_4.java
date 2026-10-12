import java.util.Scanner;

public class Test_1_5_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(((100 <= a && a <= 999) && a % 5== 0 && a > 0) ? "true":"false");
    }
}
//Так как через && мы проверям 3 условия
//Число положительное, делиться на 5 нацело, является трехзначным (от 100 до 999 включительно)

//Тест из 6 вопросов 1.5 Задача 4