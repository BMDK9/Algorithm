package baeckJun.ㅇ일반수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 벌집 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        int answer = 0;
        int home = 1;

        for (int i = 1; home < input; i++) {
            home += 6 * i;
            answer++;
        }

        System.out.println(answer + 1);
    }
}
