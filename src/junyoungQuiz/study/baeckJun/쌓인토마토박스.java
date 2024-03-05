package junyoungQuiz.study.baeckJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 쌓인토마토박스 {

    static Map<Integer, int[][]> boxes;
    static Map<Integer, boolean[][]> dailyChecks;
    static int[][] box;
    static boolean[][] dailyCheck;

    public static void main(String[] args) throws IOException {

        init();

    }

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken()); // 열
        int n = Integer.parseInt(st.nextToken()); // 오
        int h = Integer.parseInt(st.nextToken()); // 층
        boxes = new HashMap<>();
        dailyChecks = new HashMap<>();

        box = new int[n][m];
        dailyCheck = new boolean[n][m];

        for (int j = 0; j < n; j++) {
            st = new StringTokenizer(br.readLine());
            for (int k = 0; k < m; k++) {
                box[j][k] = Integer.parseInt(st.nextToken());
            }
        }
    }
}
