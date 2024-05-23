package baeckJun.ㅍ정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 대표값2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] mid = new int[5];
        int avg = 0;

        for (int i = 0; i < 5; i++) {
            int a = Integer.parseInt(br.readLine());
            avg += a;
            mid[i] = a;
        }

        Arrays.sort(mid);

        System.out.println(avg / 5);
        System.out.println(mid[2]);
    }
}
