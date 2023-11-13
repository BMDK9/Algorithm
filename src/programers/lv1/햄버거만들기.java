package programers.lv1;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class 햄버거만들기 {
    public static void main(String[] args) {
        int[] a = {1, 3, 2, 1, 2, 1, 3, 1, 2};
        System.out.println(solution(a));
    }

    public static int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> ingredi = new Stack<>();
        Stack<Integer> supervise = new Stack<>();
        int[] hamburger = {1, 3, 2, 1};

        for (int make : ingredient) {
            ingredi.push(make);
            if (ingredi.size() >= 4 && ingredi.peek() == hamburger[0]) {
                boolean success = true;
                for (int i = 0; i < hamburger.length; i++) {
                    if (hamburger[i] != ingredi.peek()) {
                        while (!supervise.isEmpty()) {
                            ingredi.push(supervise.pop());
                        }
                        success = false;
                        break;
                    }
                    supervise.push(ingredi.pop());
                }
                supervise.clear();
                if (success) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
