package main;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by svetlana on 14.10.16.
 */
public class Main {
    public static void main(String[] args) {

        int[][] lauaAlgseis = new int[9][9]; // kui suur lauaAlgseis on, ehk siis palju elemente on igas reas v6i voorus
        int[][] lauaSeis = new int[9][9];

        // 0 - meri
        //1 - laev
        // 2 - pihta saanud laev


        for (int count1 = 0; count1 < 9; count1++) {
            for (int count2 = 0; count2 < 9; count2++) {
                lauaAlgseis[count1][count2] = (int) (Math.random() * 1.3);
            }
        }

        prindiLaud(lauaAlgseis);
        System.out.println();
        prindiLaud(lauaSeis);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Kuhu tahad pommitada: x-y");
            String input = sc.nextLine();
            String[] xy = input.split("-");
            int x = Integer.parseInt(xy[0]) - 1;
            int y = Integer.parseInt(xy[1]) - 1;
            System.out.println(x);
            System.out.println(y);

            int tabamus = lauaAlgseis[y][x];

            if (tabamus == 1) {
                lauaAlgseis[y][x] = 2;
                lauaSeis[y][x] = 2;
                System.out.println("Pihtas!");
            } else if (tabamus == 0) {
                lauaSeis[y][x] = 3;
                System.out.println("Mööda!");
            } else if (tabamus == 2) {
                System.out.println("Siia sa juba lasid");
            } else {
                System.out.println("ERROR: kuidas sa üldse siia said??");
                break;
            }

            prindiLaud(lauaSeis);

            boolean labi = kasOnMangLabi(lauaAlgseis);
            if (labi == true) {
                break;
            }

        }

        System.out.println("Mäng on läbi!");

    }

    private static boolean kasOnMangLabi(int[][] laud) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (laud[j][i] == 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void prindiLaud(int[][] prinditavLaud) {

        for (int i = 0; i < 9; i++) {
            System.out.println(Arrays.toString(prinditavLaud[i]));
        }
    }
}


