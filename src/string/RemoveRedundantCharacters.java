package string;

import java.util.*;

/*
6. 중복문자제거
설명

소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.

중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.


입력
첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.


출력
첫 줄에 중복문자가 제거된 문자열을 출력합니다.


예시 입력 1
ksekkset

예시 출력 1
kset
 */

public class RemoveRedundantCharacters {

    public static void main(String[] args) {

        StringBuilder answer = new StringBuilder();

        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        for (int i = 0; i < input.length(); i++) {

            // indexOf는 문자열 중 특정 값이 맨 처음 발견된 위치의 Index 번호를 반환한다.
            // 예를 들어 ksek라면 k에 대해서는 0을 반환한다.

            if (i == input.indexOf(input.charAt(i))) {  // 입력 받은 문자열의 i번째 문자의 index 번호가 i와 같다면?

                answer.append(input.charAt(i));

            }   // if (isChar[i] != isChar[i+1]) 끝

        } // for (int i = 0; i <= input.length(); i ++) 끝

        System.out.println(answer);

    }   // main() 끝

}   // class 끝
