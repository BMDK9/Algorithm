package programers.lv1_33_40;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 명예의전당 {

    public int[] solution(int k, int[] score) {
//      하루에 한명씩 노래를 부른다. 7일 = 7명, 구할 것은 k 순위의 점수
        int[] answer = new int[score.length];   // k 순위 점수를 입력할 배열
        List<Integer> singer = new ArrayList<>();   //  점수를 핸들링할 배열

        for (int i = 0; i < score.length; i++) {
            singer.add(score[i]);   // 핸들링 배열에 점수 입력
            Collections.sort(singer);   // 점수를 오름차순으로 정렬
            Collections.reverse(singer);    // 정렬한 배열을 뒤집음 = 내림차순

            if (i < k) {    //  노래 부른 가수가 순위를 매길 k보다 작을 때
                answer[i] = singer.get(i);  //  i = 제일 낮은 점수를 순위 정렬 배열에 넣는다.
                continue;
            }

            answer[i] = singer.get(k - 1);  //  핸들링 배열에 입력된 k 순위의 점수를 입력한다.
        }
        return answer;
    }
}
