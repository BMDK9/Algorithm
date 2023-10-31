package junyoungQuiz;

import java.util.Scanner;
import java.util.Stack;

public class Quiz7_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputTime = sc.nextInt();
        System.out.println("=========================");

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < inputTime; i++) {
            int inputNumber = sc.nextInt();
            if (inputNumber == 0 ) {
                stack.pop();
            } else {
                stack.push(inputNumber);
            }
        }
        System.out.println(stack.peek());
    }
}
