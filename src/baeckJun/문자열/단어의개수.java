package baeckJun.ㅁ문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 단어의개수 {

    public static void main(String[] args) throws IOException {
        List<String> stringList = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            String nextToken = st.nextToken();
            stringList.add(nextToken);
        }

        System.out.println(stringList.size());
    }
}
