package baeckJun.ㅎ집합과맵;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class 회사에있는사람 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        TreeMap<String, String> workers = new TreeMap<>();

        try {
            int runTime = Integer.parseInt(br.readLine());
            for (int i = 0; i < runTime; i++) {
                st = new StringTokenizer(br.readLine());
                String workerName = st.nextToken();
                String workerStatus = st.nextToken();
                workers.put(workerName, workerStatus);
            }
            String[] names = (String[]) workers.keySet().toArray(new String[workers.size()]);
            for (int i = names.length - 1; i >= 0; i--) {
                if (workers.get(names[i]).equals("enter")) { System.out.println(names[i]); }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
