package baeckJun.ㅅ2차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최댓값 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] table = new int[9][9];
        int Max = Integer.MIN_VALUE;
        int X = 0;
        int Y = 0;

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 9; j++) {
                int a = Integer.parseInt(st.nextToken());
                table[i][j] = a;

                if (a > Max) {
                    Max = a;
                    X = i + 1;
                    Y = j + 1;
                }
            }
        }
        System.out.println(Max);
        System.out.print(X + " " + Y);
    }
}
