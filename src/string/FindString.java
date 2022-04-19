package string;

import java.util.Scanner;

/**
 * 1. 문자 찾기
 * 설명
 *
 * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
 *
 * 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
 *
 *
 * 입력
 * 첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
 *
 * 문자열은 영어 알파벳으로만 구성되어 있습니다.
 *
 *
 * 출력
 * 첫 줄에 해당 문자의 개수를 출력한다.
 *
 *
 * 예시 입력 1
 * Computercooler
 * c
 *
 * 예시 출력 1
 * 2
 */

public class FindString {   // 백준에서는 class 명을 Main으로 해야 한다.

    public int solution(String str, char t) {
        int answer = 0;

        str = str.toUpperCase();                         // str로 들어온 문자열을 모두 대문자로 바꿔준다.
        t = Character.toUpperCase(t);                   // t로 들어온 문자를 대문자로 바꿔준다.

        System.out.println("문자열 출력(str) : " + str);
        System.out.println("문자 출력(t) : " + t);

        // 문자열은 for each문 뒤에 올 수 없기 때문에 이를 문자 배열로 바꿔주는 toCharArray()를 호출해야 한다.
        for (char x : str.toCharArray()) {  // str 문자열 배열에 한 문자씩 문자 배열에 넣고, 하나씩 꺼내 문자 변수 x에 넣으면서 for문 동작

            if (x == t) {                   // 문자 변수 x에 값이 t 변수에 값과 같은가?
                answer++;                   // 같다면 answer를 1 증가 시킨다.
            } // if (x == t) 끝

        } // for (char x : str.toCharArray()) 끝

        /* for-each 사용을 위한 주석 */

//        for (int i = 0; i < str.length(); i++) {
//
//            if (str.charAt(i) == t) {                   // str로 들어온 문자열에 i번째 문자가 t로 들어온 문자와 같은가?
//                answer++;                               // answer를 1 증가 시켜라
//            } // if (str.charAt(i) == t) 끝

//       } // for (int i = 0; i < str.length(); i++) 끝

        return answer;
    } // solution(String str, char t) 끝

    public static void main(String[] args) {

        FindString T = new FindString();

        Scanner sc = new Scanner(System.in);          // scanner 객체 생성

        String str = sc.next();                      // 문자열 입력 받기 (입력값 : Computercooler)

        char c = sc.next().charAt(0);               // 입력된 문자열 중에 0번째 알파벳을 가져와라 (입력값 : c)

        System.out.println(T.solution(str, c));

    } // main(String[] args)

} // class 끝
