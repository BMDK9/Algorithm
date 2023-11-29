package programers.lv1_21_40;

import java.util.Arrays;

public class 과일장수 {
    public int solution(int k, int m, int[] score) {
//        사과 1 ~ k점, 상자 가격 = 최저 사과 점수 * m
//        제일 많은 점수를 받을 수 있는 방법은?
        int answer = 0; // 박스 가격 총합
        Arrays.sort(score); // 사과 점수 오름차순 정렬

        int a = 1;  // 사과 박스 개수
        for (int i = score.length -1; i >= 0; i--) {
//            if (i - m < 0) {     // 문제의 원인이었다.
//                break;            // 이미 밑에서 박스 내의
//            }                     // 가장 작은 점수를 구하고 있다.
//            m이 3일 때 i가 3이면 2-3 < 0 때 브레이크를 건다.
//            즉 길이가 m인 배열이 오면 0번째 배열에 도달할 수 없다.
//            그래서 박스 하나를 덜 구한다.
            if (i == score.length - m * a) {
                answer += score[i] * m;
                a++;
            }
        }
        return answer;
    }
}
