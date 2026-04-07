package baeckJun.ㄷ반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 코딩은체육과목입니다 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int bite = Integer.parseInt(br.readLine());
        int longTime = bite / 4;

        for (int i = 0; i < longTime; i++) {
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
