package programers.lv1;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class 햄버거만들기 {
    public static void main(String[] args) {
        int[] a = {2, 1, 4, 3, 2, 1, 2, 5, 3, 1, 2, 3, 1};
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

                for (int j : hamburger) {
                    if (j != ingredi.peek()) {
                        success = false;
                        break;
                    }
                    supervise.push(ingredi.pop());
                }
                if (success) {
                    answer++;
                    supervise.clear();
                } else {
                    while (!supervise.isEmpty()) {
                        ingredi.push(supervise.pop());
                    }
                }
            }
        }
        return answer;
    }
}
