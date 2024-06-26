package programers.lv1;

public class 자연수뒤집어배열로만들기 {
    public static void main(String[] args) {
        solution(12345);
    }

    public static int[] solution(long n) {

        String string_n = Long.toString(n);
        int[] answer = new int[string_n.length()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = (int) (n % 10);
            n /= 10;
        }
        return answer;

//        String string_n = Long.toString(n);           // 단순히 형변환으로만 푼 것
//        List<Character> char_n = new ArrayList<>();
//        int[] answer = new int[string_n.length()];
//
//        for (int i = string_n.length(); i > 0; i--) {
//            char_n.add(string_n.charAt(i-1));
//        }
//
//        for (int i = 0; i < char_n.size(); i++) {
//            answer[i] = Character.getNumericValue(char_n.get(i));
//        }
//
//        return answer;
    }
}