package baeckJun.ㄱ입출력과사칙연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 나머지 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int one = (a + b) % c;
        int two = ((a % c) + (b % c)) % c;
        int three = (a * b) % c;
        int four = ((a % c) * (b % c)) % c;

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
    }
}