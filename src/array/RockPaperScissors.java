package array;

import java.util.*;

/*
3. 가위 바위 보
설명

A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.

가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.

예를 들어 N=5이면

Image1.jpg

두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.


입력
첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다.

두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.

세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.


출력
각 줄에 각 회의 승자를 출력합니다. 비겼을 경우는 D를 출력합니다.


예시 입력 1
5
2 3 3 1 3
1 1 2 2 3

예시 출력 1
A
B
A
B
D
 */

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt(); // 가위 바위 보 회수 받기

        char[] answer = new char[cnt];
        int[] playerA = new int[cnt];
        int[] playerB = new int[cnt];

        for (int i = 0; i < cnt; i++) { // player A 가위 바위 보 값 넣기(1: 가위, 2:바위, 3: 보)

            playerA[i] = sc.nextInt();

        } // for (int i = 0; i < cnt; i++) 끝

        for (int y = 0; y < cnt; y++) { // player A 가위 바위 보 값 넣기(1: 가위, 2:바위, 3: 보)

            playerB[y] = sc.nextInt();

        }   // for (int y = 0; y < cnt; y++) 끝

        for (int k = 0; k < cnt; k++) {

            if (playerA[k] > playerB[k] || (playerA[k] == 1 && playerB[k] == 3)) {

                answer[k] = 'A';

                if (playerB[k] == 1 && playerA[k] == 3) {
                    answer[k] = 'B';
                }


            } else if (playerA[k] < playerB[k] || (playerB[k] == 1 && playerA[k] == 3)) {

                answer[k] = 'B';

                if (playerA[k] == 1 && playerB[k] == 3) {
                    answer[k] = 'A';
                }

            } else {
                answer[k] = 'D';
            }

            System.out.println(answer[k]);

        } // for (int y = 0; y < cnt; y++) 끝

    } // main() 끝
} // class 끝
