package prj6a_sparsematrix;

/**
 * This class contains the main method to test the sparse matrix functionality.
 */

/* COSC220 Instructor: Mr. Fallon
    Project 6 - Sparse Matrix
        
        This project is to test the sparse matrix functionality.

        Nasir D. Deshields - May 7th, 2024
    Posting my name above indicates that I wrote and understand this code.
*/

public class Main {
    public static void main(String[] args) throws Exception {
        MatrixClass m = new MatrixClass('A', 3, 5);
        SparseMatrixClass s = new SparseMatrixClass();

        m.populateRandom(1, 99);
        s.getSparseArrayPrimes(m);

        System.out.println(m.toString());
        System.out.println(s.toString() + "\nNasir Deshields 5/7/2024");
    }
}

