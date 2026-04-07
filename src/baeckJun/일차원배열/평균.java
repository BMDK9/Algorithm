package baeckJun.ㄹ1차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 평균 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int subject = Integer.parseInt(br.readLine());
        int[] trueScore = new int[subject];
        int max = Integer.MIN_VALUE;
        double answer = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < trueScore.length; i++) {
            int score = Integer.parseInt(st.nextToken());
            trueScore[i] = score;

            if (max < score) {
                max = score;
            }
        }

        for (int i : trueScore) {
            answer += (double) i / max * 100;
        }

        System.out.println(answer / subject);
    }
}
