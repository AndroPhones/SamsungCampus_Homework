import java.util.Scanner;

public class Test_1_5_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        boolean result =
                a == -b || a == -c || a == -d || b == -c || b == -d || c == -d;

        System.out.println(result);
    }
}
//Так как мы назначили boolean тип переменной, то
//Мы проверям,перебираем все варианты,когда число равно себе только по минусу
//Потому что x = -(-x) => x = x

//Тест из 6 вопросов 1.5 Задача 5