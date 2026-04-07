package baeckJun.ㄹ1차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 과제안내신분 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] student = new boolean[30];

        for (int i = 0; i < 28; i++) {
            int input = Integer.parseInt(br.readLine());
            student[input - 1] = true;
        }

        for (int i = 0; i < 30; i++) {
            if (!student[i]) {
                System.out.println(i + 1);
            }
        }
    }
}
