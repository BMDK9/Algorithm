package programers.lv0_P1;

public class 나이출력 {
    public static void main(String[] args) {
        System.out.println(solution(40));
    }

    public static int solution(int age) {
        int currentYear = 2022;
        int answer = 0;
        if (age > 0 && age <= 120) {
            for (int i = 1; i <= age; i++) {
                answer = currentYear - i + 1;
            }
        }
        return answer;
    }
}
