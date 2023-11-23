package programers.lv1_20;

import java.util.HashSet;
import java.util.Set;

public class 기사단원의무기 {
    public static void main(String[] args) {
        System.out.println(solution(5, 3, 3));
    }

    public static int solution(int number, int limit, int power) {

        int answer = 0;
        int [] knightDmg = new int[number];

        for (int i = 1; i <= number; i++) {             // 1부터 number까지
            Set<Integer> Dmg = new HashSet<>();         // 중복되는 약수를 제거하기 위한 Set 사용
            for (int j = 1; j <= Math.sqrt(i); j++) {  // 약수 구하는 공식 구현
                if (i % j == 0) {
                    Dmg.add(i / j);
                    Dmg.add(j);
                }
                knightDmg[i-1] = Dmg.size();            // 구한 약수의 개수를 저장
            }
        }

        for (int needIron : knightDmg) {
            if (needIron > limit) {
                needIron = power;
            }
            answer += needIron;
        }
        return answer;
    }
}


//==================================================================================
//        int answer = 0;                       //  정석이지만 시간초과
//        int[] knightDmg = new int[number];
//
//        for (int i = 1; i <= number; i++) {			// 1부터 int number 까지
//            int count = 0;
//            for (int j = 1; j <= i; j++) {			// 각 숫자의
//                if (i % j == 0) {					    // 약수를 구하고
//                    count++;                          // 카운트 한다
//                }
//            }
//            knightDmg[i - 1] = count;                 // 각 숫자의 배열에 카운트를 저장한다
//        }
//        for (int needIron : knightDmg) {
//            if (needIron > limit) {
//                needIron = power;
//            }
//            answer += needIron;
//        }
//        return answer;
//    }


//================================================================================================
//public int solution(int number, int limit, int power) {   // 리스트로 억지로 끌어온 답.
//    int answer = 0;
//    List<Integer> knightDmg = new ArrayList<>();
//    List<Integer> needIron = new ArrayList<>();
//
//    for (int i = 1; i <= number; i++) {			// 1부터 int number 까지
//
//        for (int j = 1; j <= i; j++) {			// 각 숫자의
//
//            if (i % j == 0) {					// 약수를 구한다
//                knightDmg.add(j);				// knightDmg에 저장한다
//            }
//        }
//        needIron.add(knightDmg.size());			// 각 숫자의 약수의 개수를 저장
//        knightDmg.clear();
//    }
//    for (int dmg : needIron) {					// 각 숫자 약수의 개수를 출력
//        if (dmg > limit) {						// int limit 보다 크면
//            dmg = power;						// 해당 개수를 int power로 치환
//        }
//        answer += dmg;							// 총 dmg를 구한다.
//    }
//    return answer;
//}
