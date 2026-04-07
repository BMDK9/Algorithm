package baeckJun.ㅌ브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 영화감독숌 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long num = 665L;
        int count = 0;

        while (true) {
            int digit = 0; // num 자리 수
            long digitNum = num; // 자리수 찾는데 사용
            long arrNum = num; // 각 숫자 배열에 입력하는데 사용

            for (int i = 10; digitNum / i > 0; ) { // 자리 수 찾기
                digit++;
                digitNum /= i;
            }
            digit++;

            long[] eachDigit = new long[digit];
            for (int i = 0; i < eachDigit.length; i++) { // 1의 자리 숫자부터 입력
                eachDigit[i] = arrNum % 10;
                arrNum /= 10;
            }

            for (int i = 0; i < eachDigit.length - 2; i++) {
                if (eachDigit[i] == 6L && eachDigit[i + 1] == 6L && eachDigit[i + 2] == 6L) {
                    count++;

                    if (N == count) {
                        System.out.println(num);
                        return;
                    }
                    break;
                }
            }
            num++;
        }
    }
}
