package programers.lv1_21_40;

public class 모의고사 {
    public int[] solution(int[] answers) {
//        int[] omrCard = new int[answers.length];
        int i = 0;
        int su1 = 1;
        int su2 = 2;
        int[] count = new int[3];

        while (i == answers.length) {
            if (answers[i] == su1) count[0]++;
            su1++;
            if (su1 == 6) su1 = 1;
//            =========== 수포자 1
            if (i % 2 == 1) su2 = 2;



            if (answers[i] == su2) count[1]++;

        }
    }
}
}
