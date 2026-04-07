package baeckJun.ㄹ1차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 공바꾸기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] basket = new int[N];

        for (int i = 0; i < N; i++) {
            basket[i] = i + 1;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            int temp = basket[b];

            basket[b] = basket[a];
            basket[a] = temp;
        }

        for (int i : basket) {
            System.out.print(i + " ");
        }
    }
}
