package baeckJun.ㅊ직사각형과삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 대지 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int time = Integer.parseInt(br.readLine());

        int[] x = new int[time];
        int[] y = new int[time];

        for (int i = 0; i < time; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(x);
        Arrays.sort(y);

        int a = x[time - 1] - x[0];
        int b = y[time - 1] - y[0];

        System.out.println(a * b);
    }
}
