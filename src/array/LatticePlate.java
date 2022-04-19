package array;

import java.util.*;
/*
9. 격자판 최대합
설명

5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.

Image1.jpg

N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.


입력
첫 줄에 자연수 N이 주어진다.(2<=N<=50)

두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.


출력
최대합을 출력합니다.


예시 입력 1
5
10 13 10 12 15
12 39 30 23 11
11 25 50 53 15
19 27 29 37 27
19 13 30 13 19

예시 출력 1
155
 */

public class LatticePlate {

    // TODO - 다시 풀어야 함.

    public static void main(String[] args) {

        int answer = Integer.MIN_VALUE;     // 엄청 작은 수로 초기화

        int sumRow;                     // 열 합계 선언

        int sumColum;                   // 행 합계 선언

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[][] arr = new int[num][num];

        for (int i = 0; i < num; i++) {
            for (int y = 0; y < num; y++) {

                arr[i][y] = sc.nextInt();

            } // for (int y = 0; y < num; y++) 끝
        } // for (int i = 0; i < num; i++) 끝

        for (int k = 0; k < num; k++) { // 가로, 세로 합 구하기
            sumColum = 0;
            sumRow = 0;

            for (int q = 0; q < num; q++) {

                sumColum += arr[k][q];

                sumRow += arr[q][k];

            }   // for (int q = 0; q < num; q++) 끝

            answer = Math.max(answer, sumColum);
            answer = Math.max(answer, sumRow);
        }

        sumColum = 0;
        sumRow = 0;

        for (int i = 0; i < num; i++) { // 대각선 합 구하기

            sumColum += arr[i][i];

            sumRow += arr[i][num - i - 1];
        }

        answer = Math.max(answer, sumColum);
        answer = Math.max(answer, sumRow);

        System.out.println(answer);
    } // main() 끝
} // class 끝
