package baeckJun.ㅂ심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 킹퀸룩비숍나이트폰 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] chess = {1, 1, 2, 2, 2, 8};

        for (int i : chess) {
            int a = Integer.parseInt(st.nextToken());

            System.out.print((i - a) + " ");
        }
    }
}