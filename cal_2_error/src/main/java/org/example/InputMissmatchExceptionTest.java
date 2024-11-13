package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMissmatchExceptionTest {
    Calculator ca = new Calculator();

    public int miss(int one, int two,int f) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int t_c = 1;
            try {
                switch (t_c) {
                    case 1:
                        ca.setOne(Integer.parseInt(sc.nextLine()));
                        t_c = 2;
                    case 2:
                        ca.setTwo(Integer.parseInt(sc.nextLine()));
                        t_c = 1;
                }
                break;
            } catch (InputMismatchException ime) {
                System.out.println("잘못 되었습니다. 정수만 입력가능합니다. 프로그램이 종료됩니다.");
                f = 1;
            }
        }
        return 0;
    }
}
