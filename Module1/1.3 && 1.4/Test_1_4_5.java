import java.util.Scanner;

public class Test_1_4_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int i = in.nextInt();

        int mask = (1 << i) - 1;
        System.out.println(a & mask);
    }
}
//Так как нам нужно оставить i младших (правых) бит, а остальные обнулить, то
//Нам нужно применить сдвиг и выходит 1 на позиции i, справа i 0
//После вычитания 1, получаем нужный результат

//Тест из 6 вопросов 1.4 Задача 5