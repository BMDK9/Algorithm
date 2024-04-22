package programers.lv0;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 최빈값구하기_맵사용 {
    public static void main(String[] args) {
        System.out.println("Map을 활용해서 숫자 5개를 입력 받아 최빈값 구하기" +
                "\n최빈 값이 두개라면 -1을 출력");

        Map<Integer, Integer> inputList = new HashMap<>();                      // 맵을 만든다
        Scanner sc = new Scanner(System.in);
                                                                                // 키 값이 입력한 숫자, 밸류 값이 입력한 횟수
        for (int i = 0; i < 5; i++) {
            int input = sc.nextInt();
            inputList.put(input, inputList.getOrDefault(input, 0) + 1);
            // put 은 ( 여기에, 이걸 넣는다)
            // getOrDefault 는 (get 할 것, [get 할 것이 없다면(=null) 이라면 입력할 것] = 실행할 것)
        }

        int max = 0;
        int result = 0;

        for (int inputKey : inputList.keySet()) {       // inputKey 에 KeySet 한다. (Key 값을 Set 하는데 모든  Key 값이 나오도록)
            System.out.println("숫자"+ inputKey+ "을 "+ inputList.get(inputKey)+ "번 입력했습니다.");
            int a = inputList.get(inputKey);
            if (max < a) {                              // 최빈값 1개
                max = a;
                result = inputKey;
            } else if (max == a) {                      // 최빈값 은 횟수를 비교해서 구하니까 횟수가 같으면 최빈값이 2개 이상이다.
                result = -1;
            }
        }
            System.out.println("최빈 값은 " + result);
    }
}