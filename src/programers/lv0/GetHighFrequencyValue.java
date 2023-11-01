package programers.lv0;

import java.util.ArrayList;

public class GetHighFrequencyValue {
    public int solution(int[] array) {
        int answer = 0;

        int[] inputNumber = new int[1001];              // 0~1000까지의 숫자
        for (int i = 0; i < array.length; i++) {         //100번 입력
            if (array[i] >= 0 && array[i] <= 1000) {
                inputNumber[array[i]] += 1;                    // 0~1000까지 카운트
            }
        }
        int max = 0;
        int manyNumber = 0;
        for (int i = 0; i < inputNumber.length; i++) {
            if (max < inputNumber[i]) {
                max = inputNumber[i];
                manyNumber = i;
            } else if (max == inputNumber[i]) {
                manyNumber = -1;
            }
        }
        answer = manyNumber;
        return answer;
    }
}
