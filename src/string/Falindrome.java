package string;

import java.util.*;

/*
8. 유효한 팰린드롬
설명

앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.

문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.

단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.

알파벳 이외의 문자들의 무시합니다.


입력
첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.


출력
첫 번째 줄에 팰린드롬인지의 결과를 YES 또는 NO로 출력합니다.


예시 입력 1

found7, time: study; Yduts; emit, 7Dnuof
예시 출력 1

YES
 */

public class Falindrome {

    public static void main(String[] args) {

        String answer = "NO";

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        // 대소문 구분을 없애기 위해 모두 대문자로 변경한 뒤 replaceAll을 통해 A~Z가 아닌 것들은 빈 문자로 바꿔버린다.
        String str = input.toUpperCase().replaceAll("[^A-Z]", "");

        // StringBuilder 생성자에 str을 넣고, reverse()를 통해 다 뒤집은 뒤 문자열(toString())으로 만들어 tmp에 넣는다.
        String tmp = new StringBuilder(str).reverse().toString();

        if (str.equals(tmp)) {  // 객체값 비교

            answer = "YES";

        }   // if (str.equals(tmp)) 끝

        System.out.println(answer);

    } // main() 끝
} // class 끝
