package prj6a_sparsematrix;

import java.util.ArrayList;

/**
 * Represents a sparse matrix and provides methods for working with it.
 */
public class SparseMatrixClass {

    /** The list containing sparse matrix elements. */
    private ArrayList<SparseMatrixElementClass> theList;

    /** 
     * Constructs an empty SparseMatrixClass object.
     */
    public SparseMatrixClass() {
        theList = new ArrayList<SparseMatrixElementClass>();
    }

    /**
     * Retrieves prime elements from a given matrix and adds them to the sparse matrix.
     * 
     * @param m The matrix from which prime elements are retrieved.
     */
    public void getSparseArrayPrimes(MatrixClass m) {
        for (int i = 0; i < m.rows; i++) {
            for (int j = 0; j < m.columns; j++) {
                int data = m.Matrix[i][j];

                if (isPrime(data)) {
                    SparseMatrixElementClass e = new SparseMatrixElementClass(data, i, j);
                    theList.add(e);
                }
            }
        }
    }

    /**
     * Checks if a number is prime.
     * 
     * @param n The number to check.
     * @return true if the number is prime, false otherwise.
     */
    public static boolean isPrime(int n) {

        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    /**
     * Returns a string representation of the sparse matrix.
     */
    public String toString() {
        String s = new String();

        for (int i = 0; i < theList.size(); i++) {
            s += theList.get(i).toString();

            if (i < theList.size() - 1) {
                s += " ----> ";
            }
        }

        return s;
    }
}
