package baeckJun.ㅁ문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 다이얼 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            switch (c) {
                case 'A', 'B', 'C' -> answer += 3;
                case 'D', 'E', 'F' -> answer += 4;
                case 'G', 'H', 'I' -> answer += 5;
                case 'J', 'K', 'L' -> answer += 6;
                case 'M', 'N', 'O' -> answer += 7;
                case 'P', 'Q', 'R', 'S' -> answer += 8;
                case 'T', 'U', 'V' -> answer += 9;
                case 'W', 'X', 'Y', 'Z' -> answer += 10;
            }
        }

        System.out.println(answer);
    }
}
