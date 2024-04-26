package baeckJun.ㄹ1차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 개수세기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int answer = 0;
        int count = Integer.parseInt(br.readLine());
        int[] numbers = new int[count];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < count; i++) {
            int a = Integer.parseInt(st.nextToken());
            numbers[i] = a;
        }

        int find = Integer.parseInt(br.readLine());

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == find) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
