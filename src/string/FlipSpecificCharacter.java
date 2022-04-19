package string;

import java.util.*;

/*
5. 특정 문자 뒤집기
설명

영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,

특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.


입력
첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.


출력
첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.


예시 입력 1
a#b!GE*T@S

예시 출력 1
S#T!EG*b@a
 */

public class FlipSpecificCharacter {

    public static void main(String[] args) {

        FlipSpecificCharacter T = new FlipSpecificCharacter();

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(T.solution(str));

    } // main() 끝

    public String solution(String str) {

        String answer = "";

        char[] s = str.toCharArray();

        int left = 0;

        int right = str.length() -1;

        while(left < right) {

            if (!Character.isAlphabetic(s[left])) {  // s 배열 left번에 값이 알파벳이 아니라면?
                left ++;
            } else if (!Character.isAlphabetic(s[right])) { // s 배열 Right번에 값이 알파벳이 아니라면?
                right --;
            } else {

                char tmp = s[left];

                s[left] = s[right];

                s[right] = tmp;

                left ++;

                right --;

            }   // if - else 끝

        }   // while(left < right) 끝
        answer = String.valueOf(s);

        return answer;

    } // solution(String str) 끝

} // class 끝
