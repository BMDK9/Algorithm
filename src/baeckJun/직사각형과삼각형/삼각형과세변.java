package baeckJun.ㅊ직사각형과삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 삼각형과세변 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] lines = new int[3];

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            lines[0] = Integer.parseInt(st.nextToken());
            lines[1] = Integer.parseInt(st.nextToken());
            lines[2] = Integer.parseInt(st.nextToken());

            Arrays.sort(lines);

            int a = lines[0];
            int b = lines[1];
            int c = lines[2];

            if (a == 0 && a == b && a == c) {
                break;
            }

            if ((a + b) <= c) {
                System.out.println("Invalid");
                continue;
            }

            if (a == b && a == c) {
                System.out.println("Equilateral");
                continue;
            }

            if (a == b || a == c || b == c) {
                System.out.println("Isosceles");
                continue;
            }

            System.out.println("Scalene");
        }
    }
}
