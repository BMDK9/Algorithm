package programers.lv0;

public class GetAge {

    public int solution(int age) {
        int answer = 0;
        int year = 2022;
        int brithYear = 0;
        if (0 < age && age <= 120) {
            brithYear = year - age;
        }
        answer = brithYear;
        return answer;
    }
}
