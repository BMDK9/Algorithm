package baeckJun.ㄴ조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 주사위세개 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] dice = {a, b, c};
        Arrays.sort(dice);

        if (a == b && b == c) {
            int price = 10000 + dice[1] * 1000;
            System.out.println(price);
            return;
        }
        if (a == b || a == c || b == c) {
            int price = 1000 + dice[1] * 100;
            System.out.println(price);
            return;
        }
        int price = dice[2] * 100;
        System.out.println(price);
    }
}
