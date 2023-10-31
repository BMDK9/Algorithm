package junyoungQuiz;

import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {
        System.out.println("환영합니다." +
                "\n입력 받은 수 까지 2의 배수인지 3의 배수인지 체크합니다!!");

        System.out.print("입력:  ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();                   // 입력 값 범위 받음

        int j = 2;        int k = 3;                // 알고자 하는 배수의 기준? 수포자 ㅠ

        for (int i = 1; i <= input ; i++) {
            if (i % k == 0 && i % j == 0) {
                System.out.println(i + " -> " + j + " 와 " + k + "의 배수입니다.");    // 공통 배수 노티
            } else if (i % j == 0) {
                System.out.println(i + " -> " + j + "의 배수입니다.");                // j 배수 노티
            } else if (i % k == 0) {
                System.out.println(i + " -> " + k + "의 배수입니다.");                // k 배수 노티
            } else {
                System.out.println(i);                                              // 나머지는 그냥 출력.
            }
        }
    }
}
