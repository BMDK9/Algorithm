package baeckJun.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 미로탐색 {

    private static class Node {

        int x;
        int y;

        private Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static final int[] dx = {-1, 1, 0, 0};
    private static final int[] dy = {0, 0, -1, 1};
    private static int step = 0;
    private static int[][] maze;
    private static Queue<Node> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        init();
        bfs();
        System.out.println(maze[maze.length-1][maze[0].length-1]);
    }

    private static void bfs() {
        while (!q.isEmpty()) {
            Node start = q.poll();

            int x = start.x;
            int y = start.y;

            if (maze[x][y] > step) {
                step = maze[x][y];
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= maze.length || ny < 0 || ny >= maze[0].length) {
                    continue;
                }

                if (maze[nx][ny] == 1) {
                    Node next = new Node(nx, ny);
                    maze[nx][ny] = step + 1;
                    q.offer(next);
                }
            }
        }
    }

    private static void init() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        maze = new int[x][y];

        for (int i = 0; i < x; i++) {
            String inputLine = bf.readLine();
            for (int j = 0; j < y; j++) {
                int input = Character.getNumericValue(inputLine.charAt(j));
                maze[i][j] = input;
            }
        }

        Node node = new Node(0, 0);
        q.offer(node);
    }
}
