package programers.lv0;

public class LambBBQ {
    public int solution(int n, int k) {
        int service = 0;
        if (n/10==0) {
            service += 1;
        }
        int lamb = n*12000;
        int drink = (k-service)*2000;

        return lamb + drink;
    }
}
