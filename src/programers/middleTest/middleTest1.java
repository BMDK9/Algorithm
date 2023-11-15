package programers.middleTest;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

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
    }

    public void four() {
        char [] answer = {'X', 'X', 'O', 'X' };
        for (int i = 1; i <= 4; i++) {
            System.out.println(i + "번은 " + answer[i-1]);
        }
    }

    public static void five(int input) {
        for (int i = 1; i <= input; i++) {

            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
