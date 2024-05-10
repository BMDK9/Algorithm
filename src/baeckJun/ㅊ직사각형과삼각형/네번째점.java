package baeckJun.ㅊ직사각형과삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 네번째점 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] x = new int[3];
        int[] y = new int[3];

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        int findX = find(x);
        int findY = find(y);

        System.out.print(findX + " " + findY);

    }

    private static int find(int[] arr) {
        if (arr[0] == arr[1]) {
            return arr[2];
        }

        if (arr[0] == arr[2]) {
            return arr[1];
        }

        return arr[0];
    }
}
