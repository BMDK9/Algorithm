package programers.lv1_17_20;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class 나누어떨어지는숫자배열 {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> divNum = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                divNum.add(arr[i]);
            }
        }

        int[] answer = new int[divNum.size()];

        if (divNum.isEmpty()) {
            return new int[]{-1};
        } else {
            for (int i = 0; i < divNum.size(); i++) {
                answer[i] = divNum.get(i);
            }
            Arrays.sort(answer);
        }
        return answer;
    }
}
