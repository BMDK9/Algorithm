package programers.lv1_21_40;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 푸드파이트 {
    public String solution(int[] food) {

        List<Integer> foodSetting = new ArrayList<>();
        for (int i = 1; i < food.length; i++) {     // 물을 제외한 나머지 음식 i의
            for (int k = 0; k < food[i]/2; k++) {   // 개수 절반만큼
                foodSetting.add(i);                 // 앞에서부터 세팅한다.
            }                                       // 선수 1세팅 but String이 아님.
        }

        StringBuilder foodSetting1 = new StringBuilder();   // 푸드세팅을
        for (Integer foods : foodSetting) {                 // 리스트에서
            foodSetting1.append(foods);                     // 문자열로 치환 = 선수1 세팅
        }
        Collections.reverse(foodSetting);                   // 리스트 뒤집음

        StringBuilder foodSetting2 = new StringBuilder();   // 푸드세팅을
        for (Integer foods : foodSetting) {                 // 리스트에서
            foodSetting2.append(foods);                     // 문자열로 치환 = 선수2 세팅
        }

        return foodSetting1 + "0" + foodSetting2;           // 중앙에 물 세팅
    }
}
