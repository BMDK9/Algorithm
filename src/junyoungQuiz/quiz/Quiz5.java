package junyoungQuiz.quiz;

import java.util.Scanner;

public class Quiz5 {
    public static void main(String[] args) {
        System.out.println("1~10까지의 수를 5번 입력 받아서 가장 많이 입력된 수를 구하세요!");
        int[] arr = new int[11];       // 담을 배열 생성

        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print((i + 1) + "번째 수: ");
            int j = sc.nextInt();
            arr[j] += 1;
        }                                       // 숫자별 입력 횟수 배열로 카운트

        int max = 0;                             // 가장 많이 입력된 숫자의 좌표를 확인
        int result = 0;                          // 가장 많이 입력된 숫자의 좌표를 추출
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                result = i;
            }
        }
        System.out.println("가장 많이 입력된 수는 "+result);
    }
}