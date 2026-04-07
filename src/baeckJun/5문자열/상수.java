package baeckJun.ㅁ문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 상수 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] answer = new int[2];

        for (int i = 0; i < 2; i++) {
            StringBuilder sb = new StringBuilder();
            String s = st.nextToken();
            sb.append(s.charAt(2)).append(s.charAt(1)).append(s.charAt(0));

            answer[i] = Integer.parseInt(String.valueOf(sb));
        }
        System.out.println(Math.max(answer[0], answer[1]));
    }
}
