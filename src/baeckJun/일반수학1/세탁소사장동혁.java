package baeckJun.ㅇ일반수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 세탁소사장동혁 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int time = Integer.parseInt(br.readLine());
        int[] coin = {25, 10, 5, 1};

        for (int i = 0; i < time; i++) {
            int change = Integer.parseInt(br.readLine());
            int[] count = new int[4];

            for (int j = 0; j < coin.length; j++) {
                if (change / coin[j] != 0) {
                    count[j] = change / coin[j];
                    change %= coin[j];
                }
            }
            for (int c : count) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
