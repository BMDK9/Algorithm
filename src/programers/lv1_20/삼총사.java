package programers.lv1_20;

public class 삼총사 {
    public static void main(String[] args) {

    }

    public int solution(int[] number) {
        int answer = 0;
        int students = number.length;
        for (int i = 0; i < students - 2; i++) {
            for (int j = i + 1; j < students - 1; j++) {
                for (int k = j + 1; k < students; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
