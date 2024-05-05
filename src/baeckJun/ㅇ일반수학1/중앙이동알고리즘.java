package baeckJun.ㅇ일반수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 중앙이동알고리즘 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int square = (int) Math.pow(2, N);
        int dot = square + 1;

        System.out.println(dot * dot);
    }
}