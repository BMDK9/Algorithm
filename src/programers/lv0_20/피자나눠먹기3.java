package programers.lv0_20;

public class 피자나눠먹기3 {

    public int solution(int slice, int n) {

        if (n % slice == 0) {
            return n / slice;
        }
        return n / slice + 1;
    }
}
