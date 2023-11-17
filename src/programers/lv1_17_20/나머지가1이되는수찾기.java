package programers.lv1_17_20;

public class 나머지가1이되는수찾기 {
    public static void main(String[] args) {
        System.out.println(solution(9));
    }
    public static int solution(int n) {
        int answer = 0;
        for (int i = n; i > 1; i--) {
            if (n % i == 1) {
                answer = i;
            }
        }
        return answer;

//        for (int i = 1; i < n; i++) {     // 개선함
//            if (n % i == 1) {
//                return i;
//            }
//        }
//        return 1;
    }
}
