import java.util.Scanner;

public class Test_1_2_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n + 2 - n % 2);
    }
}

//Так как если n - четное число (n % 2 = 0) то получается n + 2 что дает четное число
//А если n - нечетное число (n % 2 = 1) то получается n + 2 - 1 => n + 1 что тоже дает четное число

//Тест из 5 вопросов 1.2 Задача 3