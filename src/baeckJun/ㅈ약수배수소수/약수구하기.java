package baeckJun.ㅈ약수배수소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 약수구하기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int answer = 0;

        for (int i = 0; i < a; i++) {
            if (a % i == 0) {
                answer++;

                if (answer == b) {
                    answer = i;
                    break;
                }
            }
        }

        if (b > answer) {
            answer = 0;
        }

        System.out.println(answer);

//        List<Integer> factors = new ArrayList<>();
//
//        for (int i = 1; i <= Math.sqrt(a); i++) {
//            if (a % i == 0) {
//                if (a / i == i) {
//                    factors.add(i);
//                    continue;
//                }
//                factors.add(a / i);
//                factors.add(i);
//            }
//        }
//        Collections.sort(factors);
//
//        if (b > factors.size()) {
//            System.out.println("0");
//            return;
//        }
//
//        System.out.println(factors.get(b - 1));
    }
}
