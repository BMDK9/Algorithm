package baeckJun.ㄴ조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 오븐시계 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int startH = Integer.parseInt(st.nextToken());
        int startM = Integer.parseInt(st.nextToken());
        int takeTime = Integer.parseInt(br.readLine());

        int totalMin = (startH * 60) + startM + takeTime;

        int endH = totalMin / 60;
        int endM = totalMin % 60;

        if (endH > 23) {
            endH %= 24;
        }

        System.out.println(endH + " " + endM);
    }
}
