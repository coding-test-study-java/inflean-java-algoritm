package array;

import java.util.*;

/*
5. 소수(에라토스테네스 체) -> 소수를 구하는데 가장 빠른 알고리즘이 에라토스테네스 체
설명

자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.

만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.


입력
첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.


출력
첫 줄에 소수의 개수를 출력합니다.


예시 입력 1
20

예시 출력 1
8
 */

public class EratoStenses {
    public static void main(String[] args) {

        int answer = 0;

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] arr = new int[num + 1]; // num번 Index까지 생겨야 해서 +1을 해준다.

        for (int i = 2; i <= num; i++) {

            if (arr[i] == 0) {
                answer++;

                for (int j = i; j <= num; j = j + i) {  //  i의 배수라면 arr 현재 Index 번호 값을 1로 변경
                    // 나중에 위 For 문에서 arr[i]가 1이면 계산하지 않고, 넘어 간다.
                    arr[j] = 1;
                } // for (int j = i; j <= num; j = j + i) 끝
            } // if (arr[i] == 0) 끝
        } // for (int i = 2; i <= num; i++) 끝

        System.out.println(answer);

    } // main() 끝
} // class 끝
