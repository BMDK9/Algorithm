package programers.lv0;

public class SharePizza {
    public int solution(int n) {            // 7조각이 한판인 피자를 모든 n이 한조각 이상 먹기
        int answer = n/7;
        if (n%7!=0) {
            answer += 1;
        }
        return answer;
    }
}
