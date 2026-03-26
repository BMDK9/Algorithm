package baeckJun.ㅎ집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 포켓몬마스터이다솜 {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int poketCnt = Integer.parseInt(st.nextToken());
            int questionCnt = Integer.parseInt(st.nextToken());

            String[] poketMonNames = new String[poketCnt];
            for (int i = 0; i < poketCnt; i++) {
                poketMonNames[i] = br.readLine();
            }
            poketDir poketMonDir = initDir(poketMonNames);

            String[] questions = new String[questionCnt];
            for (int i = 0; i < questionCnt; i++) {
                questions[i] = br.readLine();
            }

            for (String q : questions) {
                if (isNumber(q.charAt(0))) {
                    System.out.println(poketMonDir.getPoketMonName(Integer.parseInt(q)));
                } else {
                    System.out.println(poketMonDir.getPoketMonNumber(q));
                }
            }
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static poketDir initDir(String[] poketMonNames) {
        HashMap<String, Integer> NameIndex = new HashMap<>();
        HashMap<Integer, String> NomberIndex = new HashMap<>();

        for (int i = 0; i < poketMonNames.length; i++) {
            NameIndex.put(poketMonNames[i], i + 1);
            NomberIndex.put(i + 1, poketMonNames[i]);
        }
        return new poketDir(NameIndex, NomberIndex);
    }

    static class poketDir {
        HashMap<String, Integer> nameIndex;
        HashMap<Integer, String> numberIndex;

        public poketDir(HashMap<String, Integer> nameIndex, HashMap<Integer, String> numberIndex) {
            this.nameIndex = nameIndex;
            this.numberIndex = numberIndex;
        }

        public Integer getPoketMonNumber(String poketMonName){
            return this.nameIndex.get(poketMonName);
        }

        public String getPoketMonName(int poketMonNumber){
            return this.numberIndex.get(poketMonNumber);
        }
    }

    public static boolean isNumber(char s) {
        return Character.isDigit(s);
    }
}