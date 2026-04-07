package baeckJun.ㅇ일반수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 분수찾기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int n = 0;
        int child;
        int parent;

        for (int i = 0; i < X; ) {
            n++;
            i = n * (n + 1) / 2; // 몇 번째 그룹 인지 찾는 코드
        }

        int num = X - n * (n - 1) / 2;  // 그룹 내 몇 번째 값인지 찾는 코드

        if (n % 2 == 0) {  // 짝수 그룹 시
            child = num;
            parent = n - num + 1;
        } else {
            child = n - num + 1;
            parent = num;
        }
        System.out.println(child + "/" + parent);
    }
}
