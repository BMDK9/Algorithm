package baeckJun.ㅍ정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수정렬하기3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int time = Integer.parseInt(br.readLine());
        int[] count = new int[10001];

        for (int i = 0; i < time; i++) {
            int input = Integer.parseInt(br.readLine());
            count[input]++;
        }

        for (int i = 1; i < count.length; i++) {
            while (count[i] > 0) {
                sb.append(i).append('\n');
                count[i]--;
            }
        }
        String str = sb.toString();
        System.out.println(str);
    }
}
