package baeckJun.ㅁ문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 알파벳찾기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1);
        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int a = c - 97;

            if (alphabet[a] == -1) {
                alphabet[a] = i;
            }
        }

        for (int i : alphabet) {
            System.out.print(i + " ");
        }
    }
}
