package array;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetMatrixZeros {
    public void setZeroes(ArrayList<ArrayList<Integer>> a) {
        Set<Integer> posColumn = new HashSet<>();
        Set<Integer> posRow = new HashSet<>();

        for (int i = 0 ; i <a.size(); i++) {
            for (int j = 0; j < a.get(i).size(); j++) {
                if (a.get(i).get(j) == 0) {
                    posRow.add(i);
                    posRow.add(j);
                }
            }
        }

        for (Integer row: posRow) {
            for (int i = 0 ; i < a.get(i).size(); i++) a.get(row).set(i, 0);
        }

        for (Integer col: posColumn) {
            for (int i = 0 ; i < a.size(); i++) a.get(i).set(col, 0);
        }
    }
}
