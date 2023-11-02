package programers.lv0;

public class LambBBQ {
    public int solution(int n, int k) {
        int service = 0;
        int a = n;
        while ( a - 10 >= 0) {
            a -= 10;
            service += 1;
        }
        int lamb = n * 12000;
        int drink = (k - service) * 2000;

        return lamb + drink;
    }
//        return n * 12000 + k * 2000 - (n / 10 * 2000);        맘에 드는 코드
}
