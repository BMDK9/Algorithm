package junyoungQuiz.study.baeckJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 단지번호붙이기 {

    static class Node {

        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static boolean[][] visited;
    static int[][] map;
    static List<Integer> count = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        setting();
        int answer = 0;
        int countDanJi = 0;

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    bfs(i, j, countDanJi);
                    answer++;
                }
            }
        }
        Collections.sort(count);
        System.out.println(answer);
        for (int i = 0; i < answer; i++) {
            System.out.println(count.get(i));
        }
    }

    static void bfs(int row, int col, int countDanJi) {
        Queue<Node> q = new LinkedList<>();
        visited[row][col] = true;
        countDanJi++;
        Node start = new Node(row, col);
        q.offer(start);

        while (!q.isEmpty()) {
            Node now = q.poll();

            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if (nx < 0 || ny < 0 || nx >= map.length || ny >= map.length) {
                    continue;
                }
                if (map[nx][ny] != 0 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    countDanJi++;
                    q.offer(new Node(nx, ny));
                }
            }
        }
        count.add(countDanJi);
    }

    private static void setting() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < map.length; i++) {
            String line = br.readLine();
            for (int j = 0; j < map.length; j++) {
                map[i][j] = Character.getNumericValue(line.charAt(j));
            }
        }
    }
}