package baeckJun.ㅁ문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자와문자열 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int i = Integer.parseInt(br.readLine());

        char c = S.charAt(i - 1);

        System.out.println(c);
    }
}
