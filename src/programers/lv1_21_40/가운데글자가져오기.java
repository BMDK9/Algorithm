package programers.lv1_21_40;

public class 가운데글자가져오기 {

    public String solution(String s) {
        String answer = "";

        if (s.length() % 2 == 0) {
//                      String       char           int
            answer = String.valueOf(s.charAt((s.length() / 2) - 1));
        }
//                      String       char           int
        answer += String.valueOf(s.charAt(s.length()/2));

        return answer;
    }
}
