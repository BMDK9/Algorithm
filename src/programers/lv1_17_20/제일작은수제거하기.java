package programers.lv1_17_20;

public class 제일작은수제거하기 {
    public int[] solution(int[] arr) {

        if (arr.length == 1) return new int[]{-1};

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        int[] answer = new int[arr.length - 1];

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                answer[j++] = arr[i];
            }
        }
        return answer;
    }
}
