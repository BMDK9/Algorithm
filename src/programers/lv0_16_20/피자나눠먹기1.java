package programers.lv0_16_20;

public class 피자나눠먹기1 {
    public int solution(int n) {            // 7조각이 한판인 피자를 모든 n이 한조각 이상 먹기
        int answer = n/7;
        if (n%7!=0) {
            answer += 1;
        }
        return answer;
    }
    //  return (n + 6) / 7;                 // 맘에 드는 코드
}
