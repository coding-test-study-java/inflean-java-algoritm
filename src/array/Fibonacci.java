package array;
import java.util.*;

/*
4. 피보나치 수열
설명

1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.

2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.


입력
첫 줄에 총 항수 N(3<=N<=45)이 입력된다.


출력
첫 줄에 피보나치 수열을 출력합니다.


예시 입력 1
10

예시 출력 1
1 1 2 3 5 8 13 21 34 55
 */

public class Fibonacci {
    public static void main(String[] args) {

        Fibonacci T = new Fibonacci();

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.print(T.soultion(num));

    } // main() 끝

    public ArrayList<Integer> soultion(int num) {

        ArrayList<Integer> answer = new ArrayList<>();

        answer.add(1);      // 첫번째 값은 무조건 1
        answer.add(1);      // 두번째 값은 무조건 1

        for (int i = 2; i < num; i ++) {    // 세번째 부터 피보나치 계산 시작

            answer.add((answer.get(i-2)) + (answer.get(i-1)));

        }   // for (int i = 2; i < num; i ++)

        return answer;

    } // soultion(int num) 끝
} // class 끝
