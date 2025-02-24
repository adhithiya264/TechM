class MatrixMultiplicationTask extends Thread {
    private int[][] A;
    private int[][] B;
    private int[][] result;
    private int row;
    private int col;
    
    public MatrixMultiplicationTask(int[][] A, int[][] B, int[][] result, int row, int col) {
        this.A = A;
        this.B = B;
        this.result = result;
        this.row = row;
        this.col = col;
    }

    @Override
    public void run() {
        result[row][col] = 0;
        for (int k = 0; k < A[0].length; k++) {
            result[row][col] += A[row][k] * B[k][col];
        }
    }
}

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] B = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int rowsA = A.length;
        int colsA = A[0].length;
        int rowsB = B.length;
        int colsB = B[0].length;

        int[][] result = new int[rowsA][colsB];

     
        if (colsA != rowsB) {
            System.out.println("Matrix multiplication is not possible. Invalid dimensions.");
            return;
        }

        // Create and start threads
        Thread[][] threads = new Thread[rowsA][colsB];
        
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                threads[i][j] = new MatrixMultiplicationTask(A, B, result, i, j);
                threads[i][j].start();
            }
        }

        try {
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsB; j++) {
                    threads[i][j].join();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Resultant Matrix:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
