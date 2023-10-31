package junyoungQuiz;

import java.util.Arrays;

public class Quiz4 {
    public static void main(String[] args) {

    int [][] arr = new int[5][5];                               // 이중배열은 좌표라고 생각해라

        for (int i = 0; i < arr.length; i++) {                  // 배열에 값을 입력
            for (int j = 0; j < arr[i].length; j++) {           // i = 행
                arr[i][j] = i;                                  // j = 열
            }
        }

        for (int i = 0; i < arr.length; i++) {                  // 배열을 출력
            for (int j = 0; j < arr[i].length; j++) {           // i = 행
                System.out.print(arr[j][i]);                    // j = 열
            }
        }
    }
}
