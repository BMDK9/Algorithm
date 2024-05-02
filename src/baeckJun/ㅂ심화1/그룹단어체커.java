package baeckJun.ㅂ심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 그룹단어체커 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int rep = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 0; i < rep; i++) {
            boolean[] alphabet = new boolean[26];
            String s = br.readLine();
            int size = s.length();

            for (int j = 0; j < size; j++) {
                char c = s.charAt(j);

                if (alphabet[c - 'a']) {
                    answer--;
                    break;
                }

                if (j < size - 1 && s.charAt(j + 1) == c && !alphabet[c - 'a']) {
                    while (j < size - 1 && s.charAt(j + 1) == c) {
                        j++;
                    }
                    alphabet[c - 'a'] = true;
                    continue;
                }
                alphabet[c - 'a'] = true;
            }
            answer++;
        }
        System.out.println(answer);
    }
}
