package programers.lv1;


import java.util.*;

public class 정수내림차순으로배치하기 {

    public long solution(long n) {
        long answer = 0;
        List<Integer> intN = new ArrayList<>();
        while (n != 0) {
            intN.add((int) (n % 10));
            n /= 10;
        }
        Collections.sort(intN);

        for (int i = intN.size()-1; i >= 0; i--) {
            answer += (long) (intN.get(i) * (Math.pow(10,i)));
        }
        return answer;
    }
//          오름차순 구하기
//    public long ChatGPT(long n) {
//        List<Integer> digits = new ArrayList<>();
//
//        while (n != 0) {
//            digits.add((int) (n % 10));
//            n /= 10;
//        }
//
//        Collections.sort(digits);
//
//        long answer = 0;
//        long multiplier = 1;
//
//        for (int i = digits.size() - 1; i >= 0; i--) {
//            answer += digits.get(i) * multiplier;
//            multiplier *= 10;
//        }
//
//        return answer;
//    }
}
