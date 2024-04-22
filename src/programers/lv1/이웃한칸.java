package programers.lv1;

public class 이웃한칸 {

    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int[] move = {-1, 1};
        String color = board[h][w];

        for (int i = 0; i < 2; i++) {
            int nh = h + move[i];
            int nw = w + move[i];

            if (nh >= 0 && nh < board.length) {
                if (board[nh][w].equals(color)) {
                    answer += 1;
                }
            }
            if (nw >= 0 && nw < board.length) {
                if (board[h][nw].equals(color)) {
                    answer += 1;
                }
            }
        }
        return answer;
    }
}