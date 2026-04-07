package baeckJun.ㅈ약수배수소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 배수와약수 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0) {
                break;
            }

            if (b % a == 0) {
                sb.append("factor").append("\n");
                continue;
            }

            if (a % b == 0) {
                sb.append("multiple").append("\n");
                continue;
            }

            sb.append("neither").append("\n");
        }

        System.out.println(sb);
    }
}
