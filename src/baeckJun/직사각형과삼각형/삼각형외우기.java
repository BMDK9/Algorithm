package baeckJun.ㅊ직사각형과삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 삼각형외우기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] ankle = new int[3];

        for (int i = 0; i < 3; i++) {
            ankle[i] = Integer.parseInt(br.readLine());
        }

        int a = ankle[0];
        int b = ankle[1];
        int c = ankle[2];

        if (a + b + c != 180) {
            System.out.println("Error");
            return;
        }
        if (a == 60 && a == b && a == c) {
            System.out.println("Equilateral");
            return;
        }
        if (a == b || a == c || b == c) {
            System.out.println("Isosceles");
            return;
        }
        System.out.println("Scalene");
    }
}
