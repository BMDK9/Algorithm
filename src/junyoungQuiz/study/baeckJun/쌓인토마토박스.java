package junyoungQuiz.study.baeckJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 쌓인토마토박스 {

    static class Node {

        int x;
        int y;
        int z;

        public Node(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int day;
    static int[][][] box;
    static boolean[][][] dailyCheck;

    public static void main(String[] args) throws IOException {

        init();

        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < box[i].length; j++) {
                for (int k = 0; k < box[i][j].length; k++) {
                    if (box[i][j][k] == -1) {
                        continue;
                    }
                    bfs(i, j, k);
                }
            }
        }

    }
    private static void bfs(int x, int y, int z) {
        Node node = new Node(x, y, z);
    }

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken()); // x축
        int n = Integer.parseInt(st.nextToken()); // y축
        int h = Integer.parseInt(st.nextToken()); // z축

        box = new int[n][m][h];
        dailyCheck = new boolean[n][m][h];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < m; k++) {
                    box[j][k][i] = Integer.parseInt(st.nextToken());
                }
            }
        }
    }


}
