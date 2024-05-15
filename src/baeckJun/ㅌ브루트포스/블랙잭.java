package baeckJun.ㅌ브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 블랙잭 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cardCount = Integer.parseInt(st.nextToken());
        int targetNum = Integer.parseInt(st.nextToken());

        int[] cards = new int[cardCount];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < cards.length; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        int answer = blackJack(targetNum, cards);

        System.out.println(answer);
    }
    private static int blackJack(int targetNum, int[] cards) {
        int sum = 0;

        for (int i = 0; i < cards.length - 2; i++) {
            if (cards[i] >= targetNum) {
                continue;
            }

            for (int j = i + 1; j < cards.length - 1; j++) {
                if (cards[i] + cards[j] >= targetNum) {
                    continue;
                }

                for (int k = j + 1; k < cards.length; k++) {
                    int temp = cards[i] + cards[j] + cards[k];

                    if (temp == targetNum) {
                        return temp;
                    }

                    if (sum < temp && temp < targetNum) {
                        sum = temp;
                    }
                }
            }
        }
        return sum;
    }
}
