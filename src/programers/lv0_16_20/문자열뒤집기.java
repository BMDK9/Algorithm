package programers.lv0_16_20;

public class 문자열뒤집기 {

    public String solution(String my_string) {
        char[] ing = my_string.toCharArray();                       // 배열을 이용한 방법
        char[] reverse = new char[my_string.length()];
        int reverseIndex = 0;
        for (int i = ing.length-1; i >= 0; i--) {
            reverse[reverseIndex] = ing[i];
            reverseIndex++;
        }
        return new String(reverse); // or String.valueOf(reverse);   // 알고 있는 것만 이용

                                                                    // 여기서부터 몰랐음
//        String answer = "";                                       // charAt( )을 사용한 방법
//        for (int i = my_string.length()-1; i >= 0; i--) {
//            answer += my_string.charAt(i);
//        }
//        return answer;

//        StringBuilder answer = new StringBuilder();               // StringBuilder 를 사용한 방법 1
//        for (int i = my_string.length()-1; i >= 0; i--) {
//            answer.append(my_string.charAt(i));
//        }
//        return answer.toString();

//        return new StringBuilder(my_string).reverse().toString(); // StringBuilder 를 사용한 방법 2
    }
}
