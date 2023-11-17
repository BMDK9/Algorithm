package programers.lv1_15_20;

public class 정수제곱근판별 {
    public long solution(long n) {

        long root = (long) Math.sqrt(n);
        return Math.sqrt(n)%1 == 0 ? (long) Math.pow(root + 1, 2) : -1;
//		아래와 같은 의미이다.
//        if (Math.sqrt(n) % 1 == 0) {
//            return = (long) Math.pow(root+1, 2);
//        } else {
//            return -1;
//        }

    }
}
