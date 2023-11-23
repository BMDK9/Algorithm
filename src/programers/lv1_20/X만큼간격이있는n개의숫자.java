package programers.lv1_20;

public class X만큼간격이있는n개의숫자 {
    public static void main(String[] args) {
        System.out.println(solution(2,5));
    }
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = (long) x * (i+1);
        }
        return answer;
    }
}
