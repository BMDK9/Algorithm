package programers.lv0_20;

public class 양꼬치 {
    public int solution(int n, int k) {
        int service = 0;                            // 음료수 서비스 받은 횟수
        int a = n;                                  // 주문한 양꼬치 개수

        while ( a - 10 >= 0) {                      // 양꼬치 주문 10번당 음료 서비스 1번
            a -= 10;
            service += 1;
        }
        int lamb = n * 12000;                       // 총 양꼬치 가격
        int drink = (k - service) * 2000;           // 총 음료수 가격

        return lamb + drink;                        // 총 가격
    }
//        return n * 12000 + k * 2000 - (n / 10 * 2000);        맘에 드는 코드
}
