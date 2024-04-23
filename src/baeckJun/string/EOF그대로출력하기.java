package baeckJun.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EOF그대로출력하기 {

    public static void main(String[] args) throws IOException {
        // 버퍼드리더
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;

        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }

        // 스캐너
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
    }
}
