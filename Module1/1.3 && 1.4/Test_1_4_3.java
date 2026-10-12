import java.util.Scanner;

public class Test_1_4_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int i = in.nextInt();

        System.out.println(a | (1 << i));
    }
}
//Так как нам надо поставить 1 в какую то позицию
//Поэтому нам надо применить побитовое ИЛИ
//Потому что если бит в маске 1 - резульат 1, а где 0, там бит результата равен исходному числу
//Из этого следует что нам нужен сдвиг 1 в одну позицию, не тронув при этом остальные биты

//Тест из 6 вопросов 1.4 Задача 3