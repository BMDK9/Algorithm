package baeckJun.ㄹ1차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 최댓값 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[9];
        int max = Integer.MIN_VALUE;
        int th = 0;

        for (int i = 0; i < numbers.length; i++) {
            int input = Integer.parseInt(br.readLine());
            numbers[i] = input;

            if (max < numbers[i]) {
                max = numbers[i];
                th = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(th);
    }
}
