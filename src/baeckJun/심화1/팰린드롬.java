package baeckJun.ㅂ심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 팰린드롬 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int size = s.length();

        for (int i = 0; i < size / 2; i++) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(size - 1 - i);

            if (c1 != c2) {
                System.out.println(0);
                return;
            }
        }
        System.out.println(1);
    }
}
