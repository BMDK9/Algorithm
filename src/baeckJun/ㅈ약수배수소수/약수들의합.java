package baeckJun.ㅈ약수배수소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 약수들의합 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            List<Integer> numbers = new ArrayList<>();
            int answer = 0;

            if (n == -1) {
                break;
            }

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    numbers.add(i);
                    numbers.add(n / i);
                    answer += i;
                    answer += (n / i);
                }
            }

            if (n == answer + 1) {
                Collections.sort(numbers);
                System.out.print(n + " = 1");

                for (Integer i : numbers) {
                    System.out.print(" + " + i);
                }
                System.out.println();
                continue;
            }
            System.out.println(n + " is NOT perfect.");
        }
    }
}
