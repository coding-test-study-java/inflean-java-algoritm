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

            if (Character.isLowerCase(c)) {         // 문자 변수 c의 값이 소문자 인가?  isLowerCase는 boolean Type으로 반환

                answer += String.valueOf(Character.toUpperCase(c));         // 문자 변수 c 값을 대문자로 바꿔 문자열 변수 answer에 추가해라

            } else if (Character.isUpperCase(c)) {  // 문자 변수 c의 값이 대문자 인가?  isLowerCase는 boolean Type으로 반환

                answer += String.valueOf(Character.toLowerCase(c));         // 문자 변수 c 값을 소문자로 바꿔 문자열 변수 answer에 추가해라

            } // if-else if문 끝
        } // for (char c : str.toCharArray()) 끝

        return answer;

    } // solution(String str) 끝
} // class 끝