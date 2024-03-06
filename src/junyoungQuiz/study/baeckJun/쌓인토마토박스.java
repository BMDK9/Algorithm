package junyoungQuiz.study.baeckJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
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

    static int[] dx = {-1, 1, 0, 0, 0, 0};
    static int[] dy = {0, 0, -1, 1, 0, 0};
    static int[] dz = {0, 0, 0, 0, -1, 1};
    static int day = 0;
    static int[][][] box;
    static Queue<Node> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        init();
        bfs(q);
//        for (int i = 0; i < box[0][0].length; i++) {
//            System.out.println(i + 1 + "층");
//            for (int j = 0; j < box.length; j++) {
//                for (int k = 0; k < box[0].length; k++) {
//                    System.out.print(box[j][k][i] + " ");
//                }
//                System.out.println();
//            }
//        }
        checkZero();
        System.out.println(day - 1);
    }

    private static void checkZero() {
        for (int i = 0; i < box[0][0].length; i++) {
            for (int j = 0; j < box.length; j++) {
                for (int k = 0; k < box[0].length; k++) {
                    if (box[j][k][i] == 0) {
                        day = 0;
                        return;
                    }
                }
            }
        }
    }

    private static void bfs(Queue<Node> q) {
        while (!q.isEmpty()) {
            Node start = q.poll();
            int x = start.x;
            int y = start.y;
            int z = start.z;

            if (box[x][y][z] > day) {
                day = box[x][y][z];
            }

            for (int i = 0; i < 6; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                int nz = z + dz[i];

                if (nx < 0 || nx >= box.length || ny < 0 || ny >= box[0].length ||
                        nz < 0 || nz >= box[0][0].length) {
                    continue;
                }

                if (box[nx][ny][nz] == 0) {
                    box[nx][ny][nz] = day + 1;
                    Node next = new Node(nx, ny, nz);
                    q.offer(next);
                }
            }
        }
    }

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken()); // x축
        int n = Integer.parseInt(st.nextToken()); // y축
        int h = Integer.parseInt(st.nextToken()); // z축

        box = new int[n][m][h];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < m; k++) {
                    box[j][k][i] = Integer.parseInt(st.nextToken());
                    if (box[j][k][i] == 1) {
                        q.offer(new Node(j, k, i));
                    }
                }
            }
        }
    }
}
