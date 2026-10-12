import java.util.Scanner;

public class Test_1_2_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int h = n / 3600 % 24;
        int m = n % 3600 / 60;
        int s = n % 60;

        String mm = m / 10 + "" + m % 10;
        String ss = s / 10 + "" + s % 10;
        System.out.println(h + ":" + mm + ":" + ss);
    }
}
//Так как мы можем опять использовать конкатенацию: m/10 - первая цифра (дестяок) а m % 10 2 - ая (единица)
//Получается,даже если при m/10 получится 0,то мы все равно сложим их как строки с методом конкатенации
//И получим запись вида h:mm:ss

//Тест из 5 вопросов 1.2 Задача 5