package junyoungQuiz;

import java.util.Scanner;

public class Quiz1 {


    public static void main(String[] args) {
        System.out.println("우승 상금 게임!!!!");

        Scanner sc = new Scanner(System.in); // 숫자 받기

        System.out.print("첫번째 숫자 : "); // 첫번째 숫자
        int firstNumber = sc.nextInt();

        System.out.print("\n두번째 숫자 : "); // 두번째 숫자
        int secondNumber = sc.nextInt();

        int price;                                         // 상금 로직
        int max = Math.max(firstNumber, secondNumber);

        if (firstNumber == secondNumber) {
            price = (firstNumber+secondNumber)*1000;
        } else {
            price = max*1000;
        }

        System.out.println("우승 상금 : " + price);         // 상금 출력
        System.out.println("-------------------------------");
    }
}
