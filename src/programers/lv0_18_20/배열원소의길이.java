package programers.lv0_18_20;

public class 배열원소의길이 {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];                 // 배열의 길이를 매개변수 길이만큼
        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();                    // for문 으로 변수 값 돌면서 입력
        }
            return answer;
    }
}
//    public List<Integer> solution(String[] strlist) {         // 리스트를 이용한 다른 풀이
//        List<Integer> answer = new ArrayList<>();
//        for (String words : strlist) {
//            answer.add(words.length());
//        }
//        return answer;
//    }
//}

