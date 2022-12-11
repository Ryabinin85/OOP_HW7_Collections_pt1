package chessBoard;

import java.util.ArrayList;
import java.util.List;

public class Chess {

    static void example() {
        List<List<String>> biDemArrList = new ArrayList<>();
        System.out.println("      A  B  C  D  E  F  G  H");
        System.out.println("  \u2655―――――――――――\u2654");
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                if ((i % 2 == 0) && (j % 2 == 1) || (j % 2 == 0) && (i % 2 == 1)) {
                    biDemArrList.get(i).add(j, "■");
                } else
                    biDemArrList.get(i).add(j, "☐");
                if (j == 0) System.out.print(8 - i + " | ");
                System.out.print(biDemArrList.get(i).get(j) + " ");
                if (j == 7) System.out.print("|" + (j - i + 1));
            }
            System.out.println();
        }
        System.out.println("  \u265A―――――――――――\u265B");
        System.out.println("      A  B  C  D  E  F  G  H");
    }

    public static void main(String[] args) {
        example();
    }
}