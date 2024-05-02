package baeckJun.ㅂ심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 크로아티아알파벳 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int size = s.length();
        int answer = 0;

        for (int i = 0; i < size; i++) {
            char c = s.charAt(i);

            if (c == 'c' && i < size - 1) {
                if (s.charAt(i + 1) == '=' || s.charAt(i + 1) == '-') {
                    i++;
                    answer++;
                    continue;
                }
                answer++;
                continue;
            }

            if (c == 'd' && i < size - 1) {
                if (s.charAt(i + 1) == '-') {
                    i++;
                    answer++;
                    continue;
                }
                if (s.charAt(i + 1) == 'z' && i < size - 2) {
                    if (s.charAt(i + 2) == '=') {
                        i += 2;
                        answer++;
                        continue;
                    }
                    answer++;
                    continue;
                }
                answer++;
                continue;
            }

            if ((c == 'l' || c == 'n') && i < size - 1) {
                if (s.charAt(i + 1) == 'j') {
                    i++;
                    answer++;
                    continue;
                }
                answer++;
                continue;
            }

            if ((c == 's' || c == 'z') && i < size - 1) {
                if (s.charAt(i + 1) == '=') {
                    i++;
                    answer++;
                    continue;
                }
                answer++;
                continue;
            }
            answer++;
        }
        System.out.println(answer);
    }
}
