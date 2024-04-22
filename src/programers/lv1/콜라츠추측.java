package programers.lv1;

public class 콜라츠추측 {
    public static void main(String[] args) {
        int num = 626331;

        int answer = 0; // count
        int longNum = num;
        while (longNum != 1) {
            if (answer > 500) {
                answer = -1;
                longNum = 1;
            } else if (longNum % 2 != 0) {
                longNum = (longNum * 3) + 1;
                answer++;
            } else if (longNum % 2 == 0) {
                longNum /= 2;
                answer++;
            }
        }
        System.out.println(longNum);
        System.out.println(answer);

//        int num = 626331;
//        System.out.println(-19%2);
//        int answer = 0;
//        int longNum = num;
//        while (longNum != 1) {
//            if (answer == 500) {
//                answer = -1;
//                longNum = 1;
//            } else if (longNum % 2 != 1) {
//                longNum /= 2;
//                answer++;
//            } else if (longNum % 2 == 1) {
//                longNum = longNum * 3 + 1;
//                answer++;
//            }
//        }
//        System.out.println(longNum);
//        System.out.println(answer);
    }

//    public int solution(int num) {
//        int answer = 0;
//        while (num != 1) {
//            if (answer == 500) {
//                return -1;
//            }
//            answer++;
//
//            if (num % 2 == 0) {
//                num /= 2;
//                continue;
//            }
//            if (num % 2 == 1) num = num * 3 + 1;
//        }
//        return answer;
//    }
}
