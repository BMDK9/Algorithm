package programers.lv1_21_40;

public class 부족한금액계산하기 {
    public static long solution(int price, int money, int count) {
        long sum = 0;

        for (int i = 1; i <= count; i++) {
            sum += price * i;
        }

        long answer = money - sum;

        if (sum > money) {
            return answer;
        } else {
            return 0;
        }
    }
}
