import java.util.Scanner;

public class TestDop_1_2_4{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();

        int D = (A * A) + (B * B);
        System.out.println(D);

    }
}
//Так как диагональ квадрата вычисляется по формуле A^2 + B^2)

//Дополнительный Тест из 4 вопросов 1.2 Задача 4