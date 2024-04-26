package baeckJun.ㄷ반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A더하기B8 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int time = Integer.parseInt(br.readLine());

        for (int i = 0; i < time; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            System.out.println("Case #" + (i + 1) + ": " + a + " + " + b + " = " + (a + b));
        }
    }
}
