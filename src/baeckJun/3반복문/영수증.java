package baeckJun.ㄷ반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 영수증 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int totalPrice = Integer.parseInt(br.readLine());
        int checkPrice = 0;
        int time = Integer.parseInt(br.readLine());

        for (int i = 0; i < time; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int price = Integer.parseInt(st.nextToken());
            int count = Integer.parseInt(st.nextToken());

            checkPrice += price * count;
        }

        if (totalPrice == checkPrice) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}
