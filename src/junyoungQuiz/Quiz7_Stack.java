package junyoungQuiz;

import java.util.Scanner;
import java.util.Stack;

public class Quiz7_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputTime = sc.nextInt();                           // 숫자를 몇 번 받을지 설정
        System.out.println("=========================");

        Stack<Integer> stack = new Stack<>();                   // Stack을 생성

        for(int i = 0; i < inputTime; i++) {                    // 설정한 횟수만큼
            int inputNumber = sc.nextInt();                     // 스캐너로 입력 받는데!
            if (inputNumber == 0 ) {                            //조건 1
                stack.pop();
            } else {                                            // 조건2
                stack.push(inputNumber);
            }
        }
        System.out.println(stack.peek());                       // 제일 위에 있는 Stack 확인
    }
}
