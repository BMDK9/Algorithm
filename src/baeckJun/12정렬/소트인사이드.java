package baeckJun.ㅍ정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 소트인사이드 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        while (true) {
            if (input / 10 == 0) {
                list.add(input);
                break;
            }

            int a = input % 10;
            list.add(a);
            input /= 10;
        }

        Collections.sort(list);
        Collections.reverse(list);

        for (Integer i : list) {
            System.out.print(i);
        }
    }
}
