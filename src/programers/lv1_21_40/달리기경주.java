package programers.lv1_21_40;

import java.util.HashMap;

public class 달리기경주 {

    public String[] solution(String[] players, String[] callings) {

        String[] answer = new String[players.length];
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
            answer[i] = players[i];
        }
        for (String calledPlayer : callings) {
            int i = map.get(calledPlayer);
            String frontPlayer = answer[i - 1];

            answer[i-1] = calledPlayer;
            answer[i] = frontPlayer;

            map.replace(calledPlayer, i - 1);
            map.replace(frontPlayer, i);
        }
        return answer;
    }
}
