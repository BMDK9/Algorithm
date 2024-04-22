package programers.lv0;

public class 짝수의합 {

    public int solution(int n) {
//        int answer = 0;
//
//        for (int i = 0; i <= n; i++) {
//            if (i % 2 == 0) {
//                answer += i;
//            }
//        }
//        return answer;

        // 괜찮았던 남의 풀이
        int answer = 0;

        for (int i = 2; i <= n; i += 2) {
            answer += i;
        }
        return answer;
    }
}
