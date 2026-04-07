package baeckJun.ㅊ직사각형과삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 직사각형에서탈출 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int horizon;
        int vertical = Math.min(y, h - y);

        if (x > w / 2) {
            horizon = w - x;
        } else {
            horizon = x;
        }

        int answer = Math.min(vertical, horizon);

        System.out.println(answer);
    }
}
