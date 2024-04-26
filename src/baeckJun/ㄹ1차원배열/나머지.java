package baeckJun.ㄹ1차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 나머지 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] answer = new int[42];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            int a = Integer.parseInt(br.readLine());
            int remain = a % 42;
            answer[remain]++;
        }

        for (int i = 0; i < answer.length; i++) {
            if (answer[i] != 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
