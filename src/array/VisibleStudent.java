package array;

import java.util.*;

/*
2. 보이는 학생
설명

선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는

선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)


입력
첫 줄에 정수 N(5<=N<=100,000)이 입력된다. 그 다음줄에 N명의 학생의 키가 앞에서부터 순서대로 주어진다.


출력
선생님이 볼 수 있는 최대학생수를 출력한다.


예시 입력 1
8
130 135 148 140 145 150 150 153

예시 출력 1
5
 */

public class VisibleStudent {
    public static void main(String[] args) {

        int answer = 1;

        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();

        int max = 0;

        int[] studentTall = new int[cnt];

        for (int i = 0; i < cnt; i++) { // 학생 키 배열에 넣기

            studentTall[i] = sc.nextInt();

        } // for (int i = 0; i < cnt; i++) 끝

        max = studentTall[0];

        for (int y = 0; y < cnt; y++) {

            if (studentTall[y] > max) {     // 뒤에 학생 키가 더 크거나 같다면?

                answer++;

                max = studentTall[y];

            }   // if (studentTall[y] <= studentTall[y - 1]) 끝

        }   // for (int y = 1; y < cnt; y++) 끝

        System.out.println(answer);

    } // main() 끝
} // class 끝
