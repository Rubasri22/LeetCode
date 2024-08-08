class Info {
    int r;
    int c;

    public Info(int r, int c) {
        this.r = r;
        this.c = c;
    }
}

class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int totalCells = rows * cols;
        List<Info> list = new ArrayList<>();
        int i = rStart;
        int j = cStart;

        list.add(new Info(i, j));
        
        int steps = 1;
        while (list.size() < totalCells) {
            // Move right
            for (int k = 0; k < steps; k++) {
                j++;
                if (i >= 0 && i < rows && j >= 0 && j < cols) {
                    list.add(new Info(i, j));
                }
            }
            // Move down
            for (int k = 0; k < steps; k++) {
                i++;
                if (i >= 0 && i < rows && j >= 0 && j < cols) {
                    list.add(new Info(i, j));
                }
            }
            steps++;
            // Move left
            for (int k = 0; k < steps; k++) {
                j--;
                if (i >= 0 && i < rows && j >= 0 && j < cols) {
                    list.add(new Info(i, j));
                }
            }
            // Move up
            for (int k = 0; k < steps; k++) {
                i--;
                if (i >= 0 && i < rows && j >= 0 && j < cols) {
                    list.add(new Info(i, j));
                }
            }
            steps++;
        }

        int[][] arr = new int[list.size()][2];
        for (int k = 0; k < list.size(); k++) {
            arr[k][0] = list.get(k).r;
            arr[k][1] = list.get(k).c;
        }
        return arr;
    }
}