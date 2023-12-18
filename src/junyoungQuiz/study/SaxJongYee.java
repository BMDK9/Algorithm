package junyoungQuiz.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SaxJongYee {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int colorPapers = Integer.parseInt(br.readLine());
        int area = 0;

        boolean[][] DoHwaGee = new boolean[101][101];

        while (colorPapers-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int coordA = Integer.parseInt(st.nextToken());
            int coordB = Integer.parseInt(st.nextToken());

            for (int i = coordA; i < coordA + 10; i++) {
                for (int j = coordB; j < coordB + 10; j++) {
                    if (!DoHwaGee[i][j]) {
                        DoHwaGee[i][j] = true;
                        area++;
                    }
                }
            }
        }
        System.out.println(area);
    }
}
