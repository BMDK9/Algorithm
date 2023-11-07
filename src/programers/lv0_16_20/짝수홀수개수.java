package programers.lv0_16_20;

public class 짝수홀수개수 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];                      // 짝수[0]와 홀[1]수가 담긴 배열 생성, 초기값 0

        for (int judgeNumber : num_list) {              // 정수가 담긴 리스트를 돌아가면서 조건문에 대입

            if (judgeNumber%2==1) {                     // 홀수면 홀수 배열 값 1 증가
                answer[1]++;
            } else {                                    // 짝수면 짝수 배열 값 1 증가
                answer[0]++;
            }
//            answer[num_list[judgeNumber] % 2]++;      // 맘에 드는 코드, for문 안에 한줄로

        }
            return answer;
    }
}
