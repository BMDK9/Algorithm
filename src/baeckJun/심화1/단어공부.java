package baeckJun.ㅂ심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어공부 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alphabet = new int[26];
        int temp = Integer.MIN_VALUE;
        char answer = 0;

        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int a = c;

            if (a >= 97 && a <= 122) {
                alphabet[a - 97]++;
                continue;
            }
            if (a >= 65 && a <= 90) {
                alphabet[a - 65]++;
            }
        }
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] > temp) {
                temp = alphabet[i];
                answer = (char) (i + 65);
                continue;
            }
            if (alphabet[i] == temp) {
                answer = '?';
            }
        }

        System.out.println(answer);
    }
}
