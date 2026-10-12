import java.util.Scanner;

public class Test_1_2_2 {
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
// //Тест из 5 вопросов 1.2 Задача 2