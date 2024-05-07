package prj6a_sparsematrix;

/**
 * Represents an element in a sparse matrix.
 */
public class SparseMatrixElementClass {

    /** The value of the element. */
    private int data;
    
    /** The row index of the element. */
    private int row;
    
    /** The column index of the element. */
    private int column;

    /**
     * Constructs a SparseMatrixElementClass object with specified parameters.
     * 
     * @param d The value of the element.
     * @param r The row index of the element.
     * @param c The column index of the element.
     */
    public SparseMatrixElementClass(int d, int r, int c) {
        this.data = d;
        this.row = r;
        this.column = c;
    }

    /**
     * Returns a string representation of the sparse matrix element.
     */
    public String toString() {
        String s = new String();
        s += "Row " + row + " Col " + column + " Data " + data;
        return s;
    }
}
