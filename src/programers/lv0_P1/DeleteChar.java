package programers.lv0_P1;

public class DeleteChar {
    public String solution(String my_string, String letter) {           // 알고 있는 방법으로
        String answer = "";
        char[] chars = my_string.toCharArray();
        for (char delet : chars) {
            if (delet != letter.charAt(0)) {
                answer += String.valueOf(delet);
            }
        }
            return answer;

//        String answer = my_string.replace(letter, "");          // letter를 ""으로 바꾸는 기능 = .replace
//        return answer;
    }
}
