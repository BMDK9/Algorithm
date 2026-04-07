package baeckJun.ㅈ약수배수소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소인수분해 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if (N == 1) {
            return;
        }

        for (int i = 2; i <= Math.sqrt(N); i++) {
            while (N % i == 0) {
                N /= i;
                System.out.println(i);
            }
        }
        if (N != 1) {
            System.out.println(N);
        }
    }
}
