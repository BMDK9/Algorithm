package programers.lv1;

public class 부족한금액계산하기 {
    public long solution(int price, int money, int count) {

        long sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += price * i;
        }

        if (sum > money) {
            return sum - money;
        }
        return 0;
    }
}

