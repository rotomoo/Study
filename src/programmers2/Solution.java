package programmers2;

import java.util.ArrayList;

class Solution {

    static class MergeClass {
        int minRow, maxRow, minCol, maxCol;

        public MergeClass(int minRow, int maxRow, int minCol, int maxCol) {
            this.minRow = minRow;
            this.maxRow = maxRow;
            this.minCol = minCol;
            this.maxCol = maxCol;
        }
    }

    public static MergeClass updateRange(int curRow, int mergeRow, int curCol, int mergeCol, String[][] table, String word) {
        int minRow = Math.min(curRow, mergeRow);
        int minCol = Math.min(curCol, mergeCol);
        int maxRow = Math.max(curRow, mergeRow);
        int maxCol = Math.max(curCol, mergeCol);
        for (int i = minRow; i <= maxRow; i++) {
            for (int j = minCol; j <= maxCol; j++) {
                table[i][j] = word;
            }
        }
        return new MergeClass(minRow, minCol, maxRow, maxCol);
    }

    public static String[] solution(String[] commands) {
        ArrayList<String> answer = new ArrayList<>();
        String[][] table = new String[51][51];
        ArrayList<MergeClass> mergeList = new ArrayList<>();

        for (String command : commands) {
            String[] commandArr = command.split(" ");
            String order = commandArr[0];
            if (!commandArr[1].chars().allMatch(Character::isDigit)) {
                for (int i = 0; i < table.length; i++) {
                    for (int j = 0; j < table[0].length; j++) {
                        table[i][j] = commandArr[1].equals(table[i][j]) ? commandArr[2] : table[i][j];
                    }
                }
                continue;
            }
            int curRow = Integer.parseInt(commandArr[1]);
            int curCol = Integer.parseInt(commandArr[2]);
            String word = "";
            if (order.equals("UPDATE") || order.equals("UNMERGE")) {
                boolean unMerge = false;
                if (order.equals("UNMERGE")) {
                    word = table[curRow][curCol];
                    for (MergeClass mergeClass : mergeList) {
                        System.out.println("mergeClass.minRow = " + mergeClass.minRow);
                        System.out.println("mergeClass.minCol = " + mergeClass.minCol);
                        System.out.println("mergeClass.maxRow = " + mergeClass.maxRow);
                        System.out.println("mergeClass.maxCol = " + mergeClass.maxCol);
                        System.out.println("curRow = " + curRow);
                        System.out.println("curCol = " + curCol);
                        if (mergeClass.maxCol >= curCol && curCol >= mergeClass.minCol
                                && mergeClass.maxRow >= curRow && curRow >= mergeClass.minRow) {
                            updateRange(mergeClass.minRow, mergeClass.maxRow, mergeClass.minCol, mergeClass.maxCol, table, "");
                            table[curRow][curCol] = word;
                            unMerge = true;
                            break;
                        }
                    }
                }
                if (unMerge) continue;
                word = commandArr[3];
                table[curRow][curCol] = word;
            }
            else if (order.equals("MERGE")) {
                int mergeRow = Integer.parseInt(commandArr[3]);
                int mergeCol = Integer.parseInt(commandArr[4]);
                word = table[curRow][curCol].equals("") ? table[mergeRow][mergeCol] : table[curRow][curCol];
                MergeClass mergeClass1 = new MergeClass(0 ,0 ,0, 0);
                boolean mergeClass1Bool = false;
                boolean mergeClass2Bool = false;
                MergeClass mergeClass2 = new MergeClass(0 ,0 ,0, 0);
                for (MergeClass mergeClass : mergeList) {
                    if (mergeClass1Bool) {
                        if (mergeClass.maxCol >= mergeCol && mergeCol >= mergeClass.minCol
                                && mergeClass.maxRow >= mergeRow && mergeRow >= mergeClass.minRow) {
                            mergeClass2 = mergeClass;
                            mergeClass2Bool = true;
                        }
                    }
                    if (mergeClass2Bool) {
                        if (mergeClass.maxCol >= curCol && curCol >= mergeClass.minCol
                                && mergeClass.maxRow >= curRow && curRow >= mergeClass.minRow) {
                            mergeClass1 = mergeClass;
                            mergeClass1Bool = true;
                        }
                    }
                }
                curRow = Math.min(mergeClass1.minRow, mergeClass2.minRow);
                curCol = Math.min(mergeClass1.minCol, mergeClass2.minCol);
                mergeRow = Math.min(mergeClass1.maxRow, mergeClass2.maxRow);
                mergeCol = Math.min(mergeClass1.maxCol, mergeClass2.maxCol);
                MergeClass mergeClass = updateRange(curRow, mergeRow, curCol, mergeCol, table, word);
                mergeList.add(mergeClass);
            }
            else {
                answer.add(table[curRow][curCol]);
            }
        }
        return answer.toArray(new String[answer.size()]);
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"UPDATE 1 1 a", "UPDATE 1 2 b", "UPDATE 2 1 c", "UPDATE 2 2 d", "MERGE 1 1 1 2", "MERGE 2 2 2 1", "MERGE 2 1 1 1", "PRINT 1 1", "UNMERGE 2 2", "PRINT 1 1"}));
    }
}