package programers.lv0_20;

public class 머쓱이보다큰사람 {

    public int solution(int[] array, int height) {

        int answer = 0;

        for (int a : array) {
            if (a > height) {
                answer++;
            }
        }
        return answer;
    }
}

