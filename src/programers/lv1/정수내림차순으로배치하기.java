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

//        char[] nlong = Long.toString(n).toCharArray();
//        Arrays.sort(nlong);
//        return Long.parseLong(new StringBuilder(new String(nlong)).reverse().toString());
    }
}
