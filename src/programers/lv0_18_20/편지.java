package programers.lv0_18_20;

public class 편지 {
    public int solution(String message) {
        char[] characters = message.toCharArray();              // 메세지를 문자의 배열로 변경
        return characters.length * 2;                           // 배열의 길이 * 2
    }
    // return message.length() * 2;                             이렇게 해도 구할 수 있다.

}
