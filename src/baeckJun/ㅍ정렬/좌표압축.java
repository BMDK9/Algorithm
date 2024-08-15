package baeckJun.ㅍ정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 좌표압축 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] inputArr = new int[Integer.parseInt(br.readLine())];
        int[] sortArr = new int[inputArr.length];
        HashMap<Integer, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < inputArr.length; i++) {
            int input = Integer.parseInt(st.nextToken());
            inputArr[i] = input;
            sortArr[i] = input;
        }
        Arrays.sort(sortArr);
        int order = 0;
        for (int i = 0; i < inputArr.length; i++) {
            if (!map.containsKey(sortArr[i])) {
                map.put(sortArr[i], order);
                order++;
            }
        }
        for (int i : inputArr) {
            sb.append(map.get(i)).append(" ");
        }
        System.out.println(sb);
    }

}