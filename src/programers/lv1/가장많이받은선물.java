package programers.lv1;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 가장많이받은선물 {

    public int solution(String[] friends, String[] gifts) {

        int[][] giftChart = new int[friends.length][friends.length]; // 선물 주고 받은 이력표
        int[] whoBow = new int[friends.length]; // 정답 후보군
        Map<String, Integer> nameTag = new HashMap<>(); // 이력표에 사용할 번호 찾기용
        Map<String, Integer> jiSoo = new HashMap<>(); // 선물 지수

        for (int i = 0; i < friends.length; i++) {
            nameTag.put(friends[i], i);
        }

        for (int i = 0; i < gifts.length; i++) { // 선물 주고 받은 이력
            StringTokenizer st = new StringTokenizer(gifts[i]);
            String from = st.nextToken();
            String to = st.nextToken();
            int j = nameTag.get(from);
            int k = nameTag.get(to);

            giftChart[j][k] += 1;
        }

        for (int i = 0; i < friends.length; i++) { // 선물 지수
            int totalGive = 0;
            int totalTake = 0;
            for (int j = 0; j < friends.length; j++) {
                if (i == j) {
                    continue;
                }
                int give = giftChart[i][j];
                int take = giftChart[j][i];

                totalGive += give;
                totalTake += take;
            }
            jiSoo.put(friends[i], totalGive - totalTake);
        }

        int answer = 0; // 정답
        for (int i = 0; i < friends.length; i++) { // 추가 선물 측정
            for (int j = 0; j < friends.length; j++) {
                if (i == j || j < i) {
                    continue;
                }
                int a = giftChart[i][j];
                int b = giftChart[j][i];
                if (a == b) { // 주고 받은 기록이 없거나 같다면
                    if (jiSoo.get(friends[i]).equals(jiSoo.get(friends[j]))) { // 선물 지수 같음
                        continue;
                    }
                    if (jiSoo.get(friends[i]) > jiSoo.get(friends[j])) { // 선물 지수 다름
                        whoBow[i] += 1;
                        continue;
                    }
                    whoBow[j] += 1;
                    continue;
                }
                // 두 사람이 선물을 주고받은 기록이 있다면
                if (a > b) {
                    whoBow[i] += 1;
                    continue;
                }
                whoBow[j] += 1;
            }
            if (whoBow[i] > answer) {
                answer = whoBow[i];
            }
        }
        return answer;
    }
}

class Solution { // 우리 준영이 풀이~

    static HashMap<String, Integer> giftMap = new HashMap<>();
    static HashMap<String, HashMap<String, Integer>> table = new HashMap<>();

    public int solution(String[] friends, String[] gifts) {
        initMap(friends);
        giftPoint(gifts);
        int answer = 0;
        for (String name : table.keySet()) {
            int count = 0;
            for (String friend : friends) {
                if (name.equals(friend)) {
                    continue;
                }
                int myPoint = table.get(name).get(friend);
                int friendPoint = table.get(friend).get(name);
                if (myPoint > friendPoint) {
                    count++;
                    continue;
                }
                if (myPoint == friendPoint) {
                    if (giftMap.get(name) > giftMap.get(friend)) {
                        count++;
                    }
                }
            }
            answer = Math.max(count, answer);
        }
        return answer;
    }

    static void initMap(String[] friends) {
        for (String friend : friends) {
            table.put(friend, new HashMap<>());
            giftMap.put(friend, 0);
        }
        for (String key : table.keySet()) {
            for (String friend : friends) {
                if (key.equals(friend)) {
                    continue;
                }
                table.get(key).put(friend, 0);
            }
        }
    }

    static void giftPoint(String[] gifts) {
        StringTokenizer st;
        for (String gift : gifts) {
            st = new StringTokenizer(gift);
            String pub = st.nextToken();
            String sub = st.nextToken();

            table.get(pub).put(sub, table.get(pub).getOrDefault(sub, 0) + 1);
            giftMap.put(pub, giftMap.get(pub) + 1);
            giftMap.put(sub, giftMap.get(sub) - 1);
        }
    }
}
