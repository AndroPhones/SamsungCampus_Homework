import java.util.Scanner;

public class Test_1_5_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        boolean result =
                (a % 2 == 0 && b % 2 == 0) || (a % 2 == 0 && c % 2 == 0) || (b % 2 == 0 && c % 2 == 0);

        System.out.println(result);
    }
}
//Так как мы назначили boolean тип переменной, то
//Мы проверям что хотя бы 2 числа четны, перебирая комбнации (их 3 всего)

//Тест из 6 вопросов 1.5 Задача 6