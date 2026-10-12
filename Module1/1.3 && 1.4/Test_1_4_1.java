import java.util.Scanner;

public class Test_1_4_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int i = in.nextInt();

        int mask = ~0 << i;
        System.out.println(a & mask);
    }
}
//Так как для обнуления последних i бит числа
// нужно побитовое И там где некоторые i бит будут 0 а все остальные 1
//Поэтому нам нужна маска где все биты равны 1, кроме поселдних i бит.

//Тест из 6 вопросов 1.4 Задача 1