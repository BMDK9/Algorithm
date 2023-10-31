package programers.lv0;

public class GetHighFrequencyValue {
    public int solution(int[] array) {
        int answer = 0;

//        int i = array
//        int j = arr

        int[] arr = new int[1001];
        for (int i = 0; i < 100; i++) {
            for (int j = 1; j < 1001; j++) {

                arr[j] = arr[j] + 1;
            }

        }


        return answer;
    }
}
