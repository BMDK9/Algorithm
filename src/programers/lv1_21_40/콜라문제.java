package programers.lv1_21_40;

public class 콜라문제 {
    public static void main(String[] args) {
        solution(2, 1, 20);
    }

    public static int solution(int a, int b, int n) {
//      줘야하는 빈병 a, 콜라 b, 소유중인 빈병 n
        int answer = 0; // 받은 콜라병의 총 개수
        int ownbottle = n;

        while (ownbottle >= a) {

            answer += b * (ownbottle / a);
            ownbottle = b * (ownbottle / a) + (ownbottle % a);

//            if(ownbottle - a >= 0) {
//                ownbottle -= a;
//                ownbottle += b;
//                answer += b;
//            }
        }
        System.out.println(answer);
        return answer;
    }
}
