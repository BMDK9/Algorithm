//package programers.lv1_21_40;
//
//public class 모의고사 {
//    public int[] solution(int[] answers) {
////        int[] omrCard = new int[answers.length];
//        int i = 1;
//        int su1 = 1;
//        int su2 = 2;
//        int su22 = 1;
//        int su3 = 3;
//        int answer3 = 0;
//        int[] count = new int[3];
//
//        while (i <= answers.length) {
//
////            ========== 수포자 1
//            if (answers[i] == su1) count[0]++;
//            su1++;
//            if (su1 == 6) su1 = 1;
//
////            =========== 수포자 2
////            홀수 문제 답은 2로 고정
//
//            if (i % 2 == 0) {   // 짝수 문제일 경우
//                if (answers[i] == su22) count[1]++;
//                su22++;
//                if (su22 == 2) su22 += 1;
//                if (su22 == 6) su22 = 1;
//            }
//
//            if (answers[i] == su2) count[1]++; // 홀수 문제일 경우
//
////            ============ 수포자 3
////            31245
//            answer3 = su3;
//            if (answers[i] == answer3) count[2]++;
//
//            if (su3 == 3) answers3 = 1;
//            su3++;
//            if (su3 == 6) su3 == 3;
//
//
//        }
//    }
//}
