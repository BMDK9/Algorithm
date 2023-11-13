package programers.lv1;

public class 정수제곱근판별 {
    public long solution(long n) {

        long root = (long) Math.sqrt(n);
        return Math.sqrt(n)%1 == 0 ? (long) Math.pow(root + 1, 2) : -1;

    }
}
