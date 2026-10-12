import java.util.Scanner;

public class Test_1_4_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int i = in.nextInt();

        System.out.println(a ^ (1 << i));
    }
}
//Так как инвертировать I бит, означает переворот i бита
//То есть если в i - бите был 1, то станет 0
//Используя побитовое исключающее ИЛИ мы певорачиваем 1 позицию бита не тронув остальные.

//Тест из 6 вопросов 1.4 Задача 4