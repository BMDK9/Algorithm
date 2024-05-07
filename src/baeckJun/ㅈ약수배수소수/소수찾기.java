package baeckJun.ㅈ약수배수소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 소수찾기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int answer = N;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(st.nextToken());

            for (int j = 1; j <= Math.sqrt(a); j++) {
                if (a == 1 || (a % j == 0 && j != 1)) {
                    answer--;
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
