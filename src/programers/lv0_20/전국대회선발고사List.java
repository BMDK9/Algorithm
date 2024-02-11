package programers.lv0_20;

import java.util.*;

public class 전국대회선발고사List {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        // 전국 대회에 선발된 학생 번호들을 등수가 높은 순서대로 각각 a, b, c번
        List<Integer> grade = new ArrayList<>();
        for (int i = 0; i < attendance.length; i++) {   // i = 등록 번호
            if (attendance[i]) {                // 참석 가능한 사람의
                grade.add(rank[i]);           // 랭크
            }
        }                                       // grade = 참석 가능한 사람의 랭크

        Collections.sort(grade);             // 등수 오름차순 정렬

        int sum = 0;
        for (int i = 0; i < grade.size(); i++) {      // 참석자들의 등수를 기준으로
            for (int j = 0; j < rank.length; j++) {     // 등록 번호를 찾는다.
                if (grade.get(i) == rank[j]) {                  // grade.get(i) = 랭크 = rank[j]
                    sum = j * 10000 / ((int) Math.pow(100, i)); // i = 랭크 순서 , j = 등록 순서
                    answer += sum;
                }
            }
        }
        return answer;
    }
}
