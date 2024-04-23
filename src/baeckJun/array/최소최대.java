package baeckJun.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최소최대 {

    public static void main(String[] args) throws IOException {
        // 배열 안쓰고
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int reps = Integer.parseInt(br.readLine());
//
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//
//        for (int i = 0; i < reps; i++) {
//            int inputNum = Integer.parseInt(st.nextToken());
//
//            if (inputNum < min) {
//                min = inputNum;
//            }
//            if (inputNum > max) {
//                max = inputNum;
//            }
//        }
//
//        System.out.println(min + " " + max);

        // 배열 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int reps = Integer.parseInt(br.readLine());
        int [] numArr = new int[reps];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < reps; i++) {
            numArr[i] = Integer.parseInt(st.nextToken());
        }

        int min = numArr[0];
        int max = numArr[0];

        for (int i = 1; i < numArr.length; i++) {

            if (numArr[i] < min) {
                min = numArr[i];
            }

            if (numArr[i] > max) {
                max = numArr[i];
            }
        }

        System.out.println(min + " " + max);
    }
}
