/*
2. 대소문자 변환
설명

대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.


입력
첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.

문자열은 영어 알파벳으로만 구성되어 있습니다.

출력
첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.

예시 입력 1 : StuDY

예시 출력 : 1sTUdy

 */


import java.util.Scanner;

public class CaseConversion {

    public static void main(String[] args) {

        CaseConversion c = new CaseConversion();

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(c.solution(str));            // 입력값 : StuDY

    } // main(String[] args) 끝

    public String solution(String str) {
        String answer="";


        for (char c : str.toCharArray()) {

            /**
             * ASCII Code 에서 대문자는 65 ~ 90
             * 소문자는 97 ~ 122이다.
             * 소문자 a에서 대문자 A의 수를 빼면 32가 되는데, 소문자에서 대문자를 빼면 그렇다라는 규칙이 생신다.
             */

            if ( c >= 65 && c <= 90) {      // 문자 변수 c의 값이 ASCII 값 65(대문자 A)보다 크고, 90(대문자 Z) 보다 작다면?
                answer += (char) (c + 32);
            } else if (c >= 97 && c <= 122) {   // 문자 변수 c의 값이 ASCII 값 97(소문자 a)보다 크고, 122(소문자 z) 보다 작다면?
                answer += (char) (c - 32);
            } else {   // 입력 값으로 띄어쓰기가 들어오면 끝나버리기 때문에 입력
                System.out.println(c);
                answer += (char) (c);
            }  // if-else if-else 끝

            /* ASCII 로 풀이 하기 위해 주석 처리 */

//            if (Character.isLowerCase(c)) {         // 문자 변수 c의 값이 소문자 인가?  isLowerCase는 boolean Type으로 반환
//
//                answer += String.valueOf(Character.toUpperCase(c));         // 문자 변수 c 값을 대문자로 바꿔 문자열 변수 answer에 추가해라
//
//            } else if (Character.isUpperCase(c)) {  // 문자 변수 c의 값이 대문자 인가?  isLowerCase는 boolean Type으로 반환
//
//                answer += String.valueOf(Character.toLowerCase(c));         // 문자 변수 c 값을 소문자로 바꿔 문자열 변수 answer에 추가해라
//
//            } // if-else if문 끝
        } // for (char c : str.toCharArray()) 끝

        return answer;

    } // solution(String str) 끝
} // class 끝