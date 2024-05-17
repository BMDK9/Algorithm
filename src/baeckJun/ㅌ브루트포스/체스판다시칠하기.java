package baeckJun.ㅌ브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 체스판다시칠하기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        boolean[][] chessBoard = new boolean[y][x];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < y; i++) {
            String color = br.readLine();

            for (int j = 0; j < x; j++) {
                if (color.charAt(j) == 'W') {
                    chessBoard[i][j] = true;
                }
            }
        }

        for (int i = 0; i < y - 7; i++) { // 전체 크기 x * y
            for (int j = 0; j < x - 7; j++) { // 전체 크기가 8 * 8 일 때 한 번은 돌아야함
                int temp = 0;
                boolean check = chessBoard[i][j];

                for (int k = i; k < i + 8; k++) { // 체스판 크기 8 * 8
                    for (int l = j; l < j + 8; l++) {
                        if (chessBoard[k][l] != check) {
                            temp++;
                        }
                        check = !check;
                    }
                    check = !check;
                }

                temp = Math.min(temp, 64 - temp);
                if (temp < min) {
                    min = temp;
                }
            }
        }

        System.out.println(min);
    }
}
