package baeckJun.ㅊ직사각형과삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 세막대 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] tri = new int[3];

        for (int i = 0; i < tri.length; i++) {
            tri[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(tri);

        if (tri[0] + tri[1] <= tri[2]) {
            tri[2] = tri[0] + tri[1] - 1;
        }

        System.out.println(tri[0] + tri[1] + tri[2]);
    }
}
