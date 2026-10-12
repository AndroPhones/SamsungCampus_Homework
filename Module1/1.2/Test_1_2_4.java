import java.util.Scanner;

public class Test_1_2_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();

        int total_cost = (a * 100 + b) * n;
        System.out.println(total_cost / 100 + " " + total_cost % 100);
    }

}
//Так как стоимость 1 пирожка можно представить как a * 100 + n, то
//стомость всех n пирожков будет (a * 100 + b) * n
//Также я почитал про System.out.println, он не принимает 2 аргумента и требует конкатенацию + " " +

//Тест из 5 вопросов 1.2 Задача 4