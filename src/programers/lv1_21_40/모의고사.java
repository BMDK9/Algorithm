package programers.lv1_21_40;

import java.util.ArrayList;

public class 모의고사 {
    public int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] count = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == a[i % a.length]) {
                count[0]++;
            }
            if (answers[i] == b[i % b.length]) {
                count[1]++;
            }
            if (answers[i] == c[i % c.length]) {
                count[2]++;
            }
        }

        // 최다 정답자 찾기
        int maxCount = Math.max(count[0], Math.max(count[1], count[2]));

        // 최다 정답자 리스트
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < count.length; i++) {
            if (count[i] == maxCount) {
                resultList.add(i + 1); // 배열 인덱스는 0부터 시작하므로 +1
            }
        }

        // 리스트 -> 배열
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }
        return resultArray;
    }
}
