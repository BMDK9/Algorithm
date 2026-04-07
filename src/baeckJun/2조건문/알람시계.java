package baeckJun.ㄴ조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 알람시계 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if (h == 0) {
            h = 24;
        }

        int alarmTime = (h * 60) + m - 45;
        int alarmH = alarmTime / 60;
        int alarmM = alarmTime % 60;

        if (alarmH == 24) {
            alarmH = 0;
        }

        System.out.println(alarmH + " " + alarmM);
    }
}
