package baeckJun.ㅌ브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 분해합 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;

        for(int i = 0; i < N; i++) {
            int number = i;
            int sum = i;

            while(number != 0) {
                sum += number % 10;
                number /= 10;
            }

            if(sum == N) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }
}
