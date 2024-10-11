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
        intro();
        String gameContinue = "1";

            while (gameContinue == "1") {
                // 야구 숫자 랜덤 세팅
                List<Integer> computer = getComputerNumber();
                System.out.println("computer = " + computer);


                // 입력 무한히 받아보기
                boolean gameResult = false;
                while (!gameResult) {
                    gameResult = playMainGame(computer);
                }

                // 게임 종료 & 재시작 여부
                System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                gameContinue = Console.readLine();
            }




    }

    private static List<Integer> getComputerNumber() {
        List<Integer> computer = Randoms.pickUniqueNumbersInRange(1, 9, 3);
        return computer;
    }

    private static void intro() {
        System.out.println("숫자 야구 게임을 시작합니다.\n");
    }

    private static boolean playMainGame(List<Integer> computer) {
        System.out.print("숫자를 입력해주세요 : ");
        String inn = Console.readLine();
        try {
            if (inn.length() != 3) {
                throw new IllegalArgumentException();
            }

            String[] strArr = inn.split("");
            int[] inputNum = new int[3];
            for (int i = 0; i < 3; i++) {
                inputNum[i] = Integer.parseInt(strArr[i]);
            }
            int strike = 0;
            int ball = 0;
            for (int i = 0; i < 3; i++) {
                if (computer.get(i) == inputNum[i]) {
                    strike++;
                } else if (computer.contains(inputNum[i])) {
                    ball++;
                }
            }

            if (ball > 0) {
                System.out.print(ball + "볼 ");
                if (strike > 0) {
                    System.out.print(strike + "스트라이크");
                }
            } else if (strike > 0) {
                System.out.print(strike + "스트라이크");
            } else {
                System.out.print("낫싱");
            }

            if (strike == 3) {
                System.out.print("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                return true;
            }
            System.out.println();
        } catch (IllegalArgumentException e) {
            System.out.println("잘못된 입력발생");
            System.exit(0);
        }
        return false;

    }

    private static void displayArray(int[] checker,String name) {
        for (int i = 0; i < checker.length; i++) {
            System.out.println(name + "["+i+"] : "+checker[i]);

        }
    }
    private static void displayArray(String[] checker,String name) {
        for (int i = 0; i < checker.length; i++) {
            System.out.println(name + "["+i+"] : "+checker[i]);
        }
    }

}
