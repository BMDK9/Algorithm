package programers.lv0_P1;

public class ReverseArray {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
//        Stack<Integer> stack = new Stack<>();             // Stack을 사용한 방법
//
//        for (int arrayNumber : num_list) {                // 배열을 stack에 입력
//            stack.push(arrayNumber);
//        }
//
//        for (int i = 0; i < num_list.length; i++) {       // stqck을 이용, 반전된 배열을 완성, 주의 i < stack.size 아님!
//            answer[i] = stack.pop();
//        }

        int answerNumber = 0;                               // stack을 사용하지 않은 방법. 역전된 배열의 index 설정.

        for (int i = num_list.length - 1; i >= 0; i--) {         // i를 배열의 길이 -1로 설정 후 0을 향하도록
            answer[answerNumber] = num_list[i];
            answerNumber++;
        }
        return answer;
    }
}