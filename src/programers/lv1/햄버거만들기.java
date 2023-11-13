package programers.lv1;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class 햄버거만들기 {
    public static void main(String[] args) {
        int[] a = {4, 1, 2, 3, 1, 5, 1, 2, 3, 1};
        System.out.println(solution(a));
    }

    public static int solution(int[] ingredient) {
        int answer = 0;
        Stack ingredi = new Stack<>();
        Stack supervise = new Stack<>();

        for (int make : ingredient) {
            if (ingredi.size() >= 4 && ingredi.peek().equals(1)) {
                for (int i = 0; i < 4; i++) {
                    supervise.push(ingredi.pop());
                }

            }
        }
        return answer;
    }
}
