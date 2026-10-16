import java.util.Scanner;

public class Test_1_6_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        if (0 <= x && x <= 9) {
            System.out.println("DIGIT");
        } else if (10 <= x && x <= 99) {
            System.out.println("NUM");
        } else {
            System.out.println("OTHER");
        }
    }
}
//Так как при DIGIT проверяем с помощью && нужные нам условия, аналогично с NUM
// А с помощью else, пишем то, что не входит в DIGIT и NUM

//Тест из 4 вопросов 1.6 Задача 1
