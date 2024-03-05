package junyoungQuiz.study.baeckJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 토마토 {

    static class Node {

        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int day;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] box;
    static boolean[][] checked;

    public static void main(String[] args) throws IOException {
        init();
//        while (true) {
            for (int i = 0; i < box.length; i++) {
                for (int j = 0; j < box[i].length; j++) {
                    if (box[i][j] == 1) {
                        bfs(i, j);
                    }
                }
                day++;
            }
//        }
//        for (int i = 0; i < box.length; i++) {
//            System.out.println();
//            for (int j = 0; j < box[i].length; j++) {
//                System.out.print(box[i][j] + " ");
//            }
//        }

        checkFalse();
        System.out.println(day);
    }

    private static void checkFalse() {
        for (int i = 0; i < checked.length; i++) {
            for (int j = 0; j < checked[i].length; j++) {
                if (!checked[i][j]) {
                    day = -1;
                    break;
                }
            }
        }
    }

    private static void bfs(int x, int y) {
        Node start = new Node(x, y);
        checked[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = start.x + dx[i];
            int ny = start.y + dy[i];

            if (nx < 0 || ny < 0 || nx >= box.length || ny >= box[x].length || checked[nx][ny]) {
                continue;
            }

            if (box[nx][ny] == 0) {
                box[nx][ny] = 1;
                checked[nx][ny] = true;
            }
        }
    }

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        box = new int[b][a];
        checked = new boolean[b][a];

        for (int i = 0; i < b; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < a; j++) {
                box[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }
}