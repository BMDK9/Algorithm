package programers.lv0;

public class GetAge {
    public static void main(String[] args) {
        System.out.println(solution(41));
    }
    public static int solution(int age) {
        int answer = 0;
        int year = 2022;
        if (0 < age && age <= 120) {
            answer = year - age + 1;
        }
        return answer;
    }
}
