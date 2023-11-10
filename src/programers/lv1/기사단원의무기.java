package programers.lv1;

import java.util.HashSet;
import java.util.Set;

public class 기사단원의무기 {
    public static void main(String[] args) {
        System.out.println(solution(5, 3, 3));
    }

    public static int solution(int number, int limit, int power) {

        int answer = 0;
        int [] knightDmg = new int[number];

        for (int i = 1; i <= number; i++) {
            Set<Integer> Dmg = new HashSet<>();
            for (int j = 1; j <= Math.sqrt(i); j++) {  // 약수를 구하는 공식이 있었다.
                if (i % j == 0) {
                    Dmg.add(i / j);
                    Dmg.add(j);
                }
                knightDmg[i-1] = Dmg.size();
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
//        for (int i = 1; i <= number; i++) {
//            int count = 0;
//            for (int j = 1; j <= i; j++) {
//                if (i % j == 0) {
//                    count++;
//                }
//            }
//            knightDmg[i - 1] = count;
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
//    public int solution(int number, int limit, int power) {   // 리스트로 억지로 끌어온 답.
//        int answer = 0;
//        List<Integer> knightDmg = new ArrayList<>();
//        List<Integer> needIron = new ArrayList<>();
//
//        for (int i = 1; i <= number; i++) {
//
//            for (int j = 1; j <= i; j++) {
//
//                if (i % j == 0) {
//                    knightDmg.add(j);
//                }
//            }
//            needIron.add(knightDmg.size());
//            knightDmg.clear();
//        }
//        for (int dmg : needIron) {
//            if (dmg > limit) {
//                dmg = power;
//            }
//            answer += dmg;
//        }
//        return answer;
//    }

