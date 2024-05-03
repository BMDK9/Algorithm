package baeckJun.ㅅ2차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 행렬덧셈 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int [][] answer = new int[N][M];

        for (int i = 0; i <2; i++) {
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());

                for (int k = 0; k < M; k++) {
                    int a = Integer.parseInt(st.nextToken());
                    answer[j][k] += a;

                    if (i == 1) {
                        System.out.print(answer[j][k] + " ");
                    }
                }
                if (i == 1) {
                    System.out.println();
                }
            }
        }
    }
}
