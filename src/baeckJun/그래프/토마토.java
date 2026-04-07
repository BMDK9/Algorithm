package baeckJun.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
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

    static int day = 0;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] box;
    //    static boolean[][] checked;   // 과거 3
    static Queue<Node> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        init();

//        for (int i = 0; i < box.length; i++) {    // 과거 1
//            for (int j = 0; j < box[0].length; j++) {
//                if (box[i][j] == 1) {
//                    q.offer(new Node(i, j));
//                }
//            }
//        }

        bfs(q);

//        for (int i = 0; i < box.length; i++) {    // 출력테스트
//            for (int j = 0; j < box[0].length; j++) {
//                System.out.print(checked[i][j] + " ");
//            }
//            System.out.println();
//        }

//        for (int i = 0; i < box.length; i++) {    // 과거 2
//            for (int j = 0; j < box[0].length; j++) {
//                if (day < box[i][j]) {
//                    day = box[i][j];
//                }
//            }
//        }
        checkZero();
        System.out.println(day - 1);
    }

    private static void checkZero() {
        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < box[0].length; j++) {
                if (box[i][j] == 0) {
                    day = 0;
                    return;
                }
            }
        }
    }

    private static void bfs(Queue<Node> q) {

        while (!q.isEmpty()) {
            Node start = q.poll();
            int x = start.x;
            int y = start.y;
//            checked[x][y] = true; // 과거 3
            if (box[x][y] > day) {  // 과거 2
                day = box[x][y];
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || ny < 0 || nx >= box.length || ny >= box[0].length) {
//                        || checked[nx][ny]) { // 과거 3
                    continue;
                }

//                if (box[nx][ny] == -1) {  // 과거 3
//                    checked[nx][ny] = true;
//                    continue;
//                }

                if (box[nx][ny] == 0) {
                    box[nx][ny] = day + 1; // 과거 2
//                    box[nx][ny] = box[x][y] + 1;  // 과거 2
//                    checked[nx][ny] = true;   // 과거 3
                    Node next = new Node(nx, ny);
                    q.offer(next);
                }
            }
        }
    }

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        box = new int[b][a];
//        checked = new boolean[b][a];  // 과거 3

        for (int i = 0; i < b; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < a; j++) {
                box[i][j] = Integer.parseInt(st.nextToken());
                if (box[i][j] == 1) {   // 과거 1
                    q.offer(new Node(i, j));
                }
            }
        }
    }
}