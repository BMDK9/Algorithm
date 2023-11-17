package programers.lv1_15_20;

public class 콜라츠추측 {
    public int solution(int num) {
        int answer = 0;
        long lnum = num;
        while (lnum != 1) {
            if (answer == 500) {
                answer = -1;
                break;
            } else if (lnum % 2 == 0) {
                lnum /= 2;
                answer++;
            } else {
                lnum = lnum * 3 + 1;
                answer++;
            }
        }
        return answer;
    }
}
