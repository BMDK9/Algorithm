package baeckJun.ㄴ조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 사분면고르기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] coordinate = new int[2];

        int x = coordinate[0];
        int y = coordinate[1];

        for (int i = 0; i < coordinate.length; i++) {
            coordinate[i] = Integer.parseInt(br.readLine());
        }

        if (x > 0) {
            if (y > 0) {
                System.out.println(1);
                return;
            }
            System.out.println(4);
            return;
        }
        if (y > 0) {
            System.out.println(2);
            return;
        }
        System.out.println(3);
    }
}
