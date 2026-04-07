package baeckJun.ㄴ조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 윤년 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        if (a % 400 == 0 || a % 100 != 0) {
            if (a % 4 == 0) {
                System.out.println(1);
                return;
            }
        }
        System.out.println(0);
    }
}
