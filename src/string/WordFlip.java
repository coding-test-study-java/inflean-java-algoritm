package string;

import java.util.ArrayList;
import java.util.Scanner;

public class WordFlip {

    public static void main(String[] args) {

        WordFlip T = new WordFlip();

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        String[] str = new String[num];

        for (int i = 0; i < num; i ++) {

            str[i] = sc.next();

        }   // for (int i = 0; i < num; i ++) 끝

        for(String x : T.solution(num, str)) {

            System.out.println(x);

        } // for(String x : T.solution(num, str)) 끝

    } // main() 끝

    public ArrayList<String> solution(int num, String[] str) {

        ArrayList<String> answer = new ArrayList<>();

        for (String x : str) {

            char[] s = x.toCharArray();

            int lt = 0;

            int rt = x.length() -1;

            while (lt < rt) {

                char tmp = s[lt];

                s[lt] = s[rt];

                s[rt] = tmp;

                lt++;

                rt--;
            }

            String tmp = String.valueOf(s);

            answer.add(tmp);

        }

//        for (String x : str) {
//            // StringBuilder 객체를 만들 때 생성자에 x를 넣어준 뒤 reverse()를 호출하여 문자열을 뒤집고, toString()으로 다시 문자열화 하여 반환
//            String tmp = new StringBuilder(x).reverse().toString();
//
//            answer.add(tmp);
//
//        }   // for (String x : str) 끝

        return answer;

    } // solution(String str) 끝

} // class 끝
