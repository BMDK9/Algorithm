package baeckJun.ㅈ약수배수소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소수_에라토스테네스의체 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = M; i <= N; i++) {
            boolean check = true;

            if (i == 1) {
                continue;
            }

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }

            if (check) {
                sum += i;
                if (i < min) {
                    min = i;
                }
            }
        }

        if (sum == 0 && min == Integer.MAX_VALUE) {
            System.out.println(-1);
            return;
        }

        System.out.println(sum);
        System.out.println(min);
    }
}
