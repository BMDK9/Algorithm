package programers.lv1_20;

public class 수박수박수박수 {

    public String solution(int n) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(i % 2 == 0 ? "수" : "박");
        }
        return sb.toString();

//        ===============================================

//        String answer = "";
//        for (int i = 0; i < n; i++) {
//
//            switch (i % 2) {
//                case 0 : answer += "수";
//                break;
//
//                default : answer += "박";
//            }
//
//        }
//        return answer;
    }
}
