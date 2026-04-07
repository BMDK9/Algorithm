package baeckJun.ㅅ2차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 세로읽기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] table = new String[5];
        int size = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            table[i] = br.readLine();

            if (table[i].length() > size) {
                size = table[i].length();
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 5; j++) {

                if (table[j].length() - 1 < i) {
                    continue;
                }
                System.out.print(table[j].charAt(i));
            }
        }
    }
}
