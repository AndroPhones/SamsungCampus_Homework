import java.util.Scanner;

public class Test_1_4_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(1 << n);
    }
}
//Так как выражение 2 ^ n в двоичной системе представляется как 1 на позиции n, а остальные биты равны 0
// n = 0  0001
// n = 1  0010
// n = 2  0100
// n = 3  1000
// и так далее до 2 ^ 31....
// Получается, 2 ^ n можно получить путем свдига 1 на n позиций

//Тест из 6 вопросов 1.4 Задача 2