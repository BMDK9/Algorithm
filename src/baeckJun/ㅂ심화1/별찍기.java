package baeckJun.ㅂ심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 별찍기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int time = Integer.parseInt(br.readLine());

        for (int i = 1; i <= time; i++) {
            print(time, i);
        }
        for (int i = time - 1; i > 0; i--) {
            print(time, i);
        }
    }

    private static void print(int time, int i) {
        for (int j = time - i; j > 0; j--) {
            System.out.print(" ");
        }
        for (int j = 0; j < i * 2 - 1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
