package programers.lv1_21_40;

public class 최대공약수최소공배수 {

    public int[] solution(int n, int m) {
        int[] answer = {findGCD(n, m), findLCM(n, m)};
        return answer;
    }

    public int findGCD(int n, int m) {      // 최대공약수 구하기
        while (m != 0) {        // 유클리드 호제법
            int temp = m;
            m = n % m;
            n = temp;
        }
        return n;
    }

    public int findLCM(int n, int m) {      // 최소공배수 구하기
        return n * m / findGCD(n, m);
    }
}