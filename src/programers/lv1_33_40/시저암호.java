package programers.lv1_33_40;

public class 시저암호 {

    public String solution(String s, int n) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char A : chars) {
            if (A == ' ') {
                sb.append(" ");
                continue;
            }
            char ch = ' ';
//            char ch;
//            ch = (Character.isUpperCase(A)) ? 'A' : 'a';
            if (A >= 65 && A <= 90) {
                ch = 'A';
            }
            if (A >= 97 && A <= 122) {
                ch = 'a';
            }

            A += n;
            char B = (char) (ch + (A - ch) % 26);
            sb.append(B);
        }
        return sb.toString();
    }
}
