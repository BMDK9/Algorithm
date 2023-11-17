package programers.lv1_15_20;

import java.util.Stack;

public class 햄버거만들기 {
    public static void main(String[] args) {
        int[] a = {2, 1, 4, 3, 2, 1, 2, 5, 3, 1, 2, 3, 1};
        System.out.println(solution(a));
    }

    public static int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> ingredi = new Stack<>();             // 재료를 받아올 Stack
        Stack<Integer> supervise = new Stack<>();           // 재료 순서를 검증할 Stack
        int[] hamburger = {1, 3, 2, 1};                     // 햄버거를 완성하기 위한 재료의 순서

        for (int make : ingredient) {                       // 재료를 받아옴
            ingredi.push(make);
            if (ingredi.size() >= 4 && ingredi.peek() == hamburger[0]) {    // 재료 검증하기 위한 조건
                boolean success = true;                     // 재료 검증 결과 태그

                for (int j : hamburger) {                   // 재료 검증 실패 조건
                    if (j != ingredi.peek()) {
                        success = false;
                        break;
                    }
                    supervise.push(ingredi.pop());          // 각 재료의 검증 완료 시
                }
                if (success) {                              // 모든 재료의 검증 완료 시
                    answer++;
                    supervise.clear();
                } else {
                    while (!supervise.isEmpty()) {          // 재료 검증 실패시 공정과정
                        ingredi.push(supervise.pop());
                    }
                }
            }
        }
        return answer;
    }
}
