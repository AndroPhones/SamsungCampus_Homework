import java.util.Scanner;

public class TestDop_1_2_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        int hund = a / 100 ;
        int tens = (a / 10) % 10 ;
        int ones = a % 10 ;
        int b = hund + tens + ones ;

        System.out.println(b) ;
    }
}
//Дополнительный Тест из 4 вопросов 1.2 Задача 3