package baeckJun.ㄱ입출력과사칙연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 곱셈 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int findNumPosition = b;
        List<Integer> numberList = new ArrayList<>();

        while (findNumPosition > 0) {
            int c = findNumPosition % 10;
            numberList.add(c);
            findNumPosition /= 10;
        }

        for (int i = 0; i < numberList.size(); i++) {
            int d = numberList.get(i);
            System.out.println(a * d);
        }

        System.out.println(a * b);
    }
}
