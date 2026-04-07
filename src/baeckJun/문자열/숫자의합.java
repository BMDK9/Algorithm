package baeckJun.ㅁ문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자의합 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int answer = 0;

        for (int i = 0; i < N; i++) {
            answer += Character.getNumericValue(s.charAt(i));
        }

        System.out.println(answer);
    }
}
