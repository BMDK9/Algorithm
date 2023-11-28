package programers.lv1_21_40;

public class 콜라문제 {
    public static void main(String[] args) {
        solution(2, 1, 20);
    }

    public int solution(int a, int b, int n) {
//      매점에 줘야하는 빈병 a, 새로 받는 콜라 b, 소유중인 빈병 n
//      새로 받은 콜라는 빈병이 된다.
        int answer = 0; // 받은 콜라병의 총 개수 = b의 누적
        int ownbottle = n;

        while (ownbottle >= a) {
//          리팩토링
            answer += b * (ownbottle / a);
            ownbottle = b * (ownbottle / a) + (ownbottle % a);

//            최초 풀이
//            if(ownbottle - a >= 0) {
//                ownbottle -= a;
//                ownbottle += b;
//                answer += b;
//            }
        }
        return answer;
    }
}
