package programers.lv1;

public class 두정수사이의합 {
    public long solution(int a, int b) {
        int c = Math.min(a, b);
        int d = Math.max(a, b);

        return (long) (d - c + 1) * (c + d) / 2;
    }
}
