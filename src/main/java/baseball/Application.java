package baseball;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // 인트로
        System.out.println("숫자 야구 게임을 시작합니다.\n");

        // 야구 숫자 랜덤 세팅
        List<Integer> computer = Randoms.pickUniqueNumbersInRange(1, 9, 3);

        // 입력 무한히 받아보기
        System.out.print("숫자를 입력해주세요 : ");
        String inn = Console.readLine();
        String[] strArr = inn.split("");
        int[] input = new int[3];
        for (int i = 0; i < 3; i++) {
            input[i] = Integer.parseInt(strArr[i]);
        }
        System.out.println(input);

        int [] checker = new int[2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (computer.get(j) == input[i]) {
                    if (i == j) {
                        checker[0]++;
                        break;
                    } else {
                        checker[1]++;
                        break;
                    }
                }
            }
        }
        System.out.println("computer = " + computer);
        displayArray(checker,"checker");

    }

    private static void displayArray(int[] checker,String name) {
        for (int i = 0; i < checker.length; i++) {
            System.out.println(name + "["+i+"] : "+checker[i]);
        }
    }
}
