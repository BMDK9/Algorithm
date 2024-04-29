package baeckJun.ㅁ문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자열 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {
            String s = br.readLine();
            char c1 = s.charAt(0);
            char c2 = s.charAt(s.length() - 1);

            System.out.print(c1);
            System.out.print(c2);
            System.out.println();
        }
    }
}
