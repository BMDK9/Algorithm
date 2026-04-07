package baeckJun.ㅍ정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 수정렬하기1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int time = Integer.parseInt(br.readLine());
//        boolean [] numbers = new boolean[2001];
//
//        for (int i = 0; i < time; i++) {
//            int a = Integer.parseInt(br.readLine()) + 1000;
//            numbers[a] = true;
//        }
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i]) {
//                System.out.println(i - 1000);
//            }
//        }
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < time; i++) {
            int a = Integer.parseInt(br.readLine());
            numbers.add(a);
        }
        Collections.sort(numbers);

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
