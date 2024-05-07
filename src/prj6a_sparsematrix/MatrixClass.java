package prj6a_sparsematrix;

/**
 * This class represents a matrix.
 */
public class MatrixClass {

    /** The matrix data. */
    private int Matrix[][];
    
    /** The number of rows in the matrix. */
    private int rows;
    
    /** The number of columns in the matrix. */
    private int columns;
    
    /** The name of the matrix. */
    private char name;

    /**
     * Constructs an empty MatrixClass object.
     */
    public MatrixClass() {
    }

    /**
     * Constructs a MatrixClass object with specified parameters.
     * 
     * @param n The name of the matrix.
     * @param row The number of rows.
     * @param col The number of columns.
     */
    public MatrixClass(char n, int row, int col) {
        this.Matrix = new int[row][col];
        this.rows = row;
        this.columns = col;
        this.name = n;
    }

    public int getRow(){
        return rows;
    }

    public int getColumn(){
        return columns;
    }

    public int[][] getMatrix(){
        return Matrix;
    }

    /**
     * Populates the matrix with random values within a given range.
     * 
     * @param min The minimum random value.
     * @param max The maximum random value.
     */
    public void populateRandom(int min, int max) {
        int rand = new java.util.Random().nextInt(max) + min;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                Matrix[i][j] = rand;
                rand = new java.util.Random().nextInt(max) + min;
            }
        }
    }

    /**
     * Returns a string representation of the matrix.
     */
    public String toString() {
        String s = new String();
        s += "Matrix " + name + "\n";
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int data = Matrix[i][j];
                s += (data + " ");
            }
            s += "\n";
        }
        return s;
    }
}
