package programers.lv0;

public class Protractor {
    public static void main(String[] args) {
        System.out.println(solution(120));
    }

    public static int solution(int angle) {
        int answer = 0;
        if (angle < 90) {
            answer = 1;
        } else if (angle == 90) {
            answer = 2;
        } else if (angle < 180) {
            answer = 3;
        } else if (angle == 180) {
            answer = 4;
        }
        return answer;
    }
}