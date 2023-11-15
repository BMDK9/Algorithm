package programers.middleTest;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;
import java.util.Stack;

public class middleTest1 {
    public static void main(String[] args) {

    }


    public void one(int number) {
        int answer = 1;
        for (int i = 1; i <= number; i++) {
            answer *= i;
        }
        System.out.println(answer);
    }

    public void two(int input) {
        char alpabet = 'A';

        if (input > 0 && input < 27) {
            for (int i = 1; i < input; i++) {
                alpabet++;
            }
            System.out.println(alpabet);
        } else {
            System.out.println("1부터 26 사이 숫자를 입력하시오.");
        }
    }

    public void three(int[] input) {
        int min = input[0];
        int max = 0;
        for (int i : input) {
            if (min > i) {
                min = i;
            }
            if (max < i) {
                max = i;
            }
        }
        System.out.println("최소값 : " + min);
        System.out.println("최댓값 : " + max);

//        Scanner sc = new Scanner(System.in);
//        System.out.print("숫자 입력: ");
//        String sinput = sc.nextLine();
//        String [] input = sinput.split(" ");
//
//        int min = Integer.parseInt(input[0]);
//        int max = 0;
//        for (int i = 0; i < input.length; i++) {
//            int a = Integer.parseInt(input[i]);
//            if (min > a) {
//                min = a;
//            }
//            if (max < a) {
//                max = a;
//            }
//        }
//        System.out.println("최소값 : " + min);
//        System.out.println("최댓값 : " + max);
    }

    public void four() {
        char[] answer = {'X', 'X', 'O', 'X'};
        for (int i = 1; i <= 4; i++) {
            System.out.println(i + "번은 " + answer[i - 1]);
        }
    }

    public void five(int input) {
        for (int i = 1; i <= input; i++) {

            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }

    public void six() {
        Scanner sc = new Scanner(System.in);
        System.out.println("다섯 개의 수를 입력하시오");
        Stack<Integer> answer = new Stack<>();
        for (int i = 0; i < 5; i++) {
            answer.push(sc.nextInt());
        }
        while (!answer.isEmpty()) {
            System.out.print("역순: " + answer.pop() + " ");
        }
    }

    public void seven() {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하시오.");
        int input = sc.nextInt();

        if (input % 3 == 0) {
            input = 1;
        } else {
            input = 2;
        }
        while (true) {
            switch (input) {
                case 1:
                    System.out.println("3의 배수");
                    break;
                case 2:
                    System.out.println("3의 배수 아님");
                    break;
            }
        }
    }
}
