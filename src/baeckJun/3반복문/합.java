package baeckJun.ㄷ반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 합 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;

        int a = Integer.parseInt(br.readLine());

        for (int i = 1; i <= a; i++) {
            answer += i;
        }
        System.out.println(answer);
    }
}
