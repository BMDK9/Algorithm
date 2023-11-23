package programers.lv1_20;

public class 문자열을정수로바꾸기 {
    public static void main(String[] args) {
    int a = -123;
        System.out.println(a);
    }
    public int solution(String s) {
        return Integer.parseInt(String.valueOf(s));
    }
}
