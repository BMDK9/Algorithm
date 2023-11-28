package programers.lv1_21_40;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 명예의전당 {

    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> singer = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            singer.add(score[i]);
            Collections.sort(singer);
            Collections.reverse(singer);

            if (i < k) {
                answer[i] = singer.get(i);
                continue;
            }

            answer[i] = singer.get(k - 1);
        }
        return answer;
    }
}
