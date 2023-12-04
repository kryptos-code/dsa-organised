package Array.Hard;
/*
*   Q. Program to generate Pascal’s Triangle
*       V1. Given row number r and column number c. Print the element at position (r, c) in Pascal’s triangle.
*       V2. Given the row number n. Print the n-th row of Pascal’s triangle.
*       V3. Given the number of rows n. Print the first n rows of Pascal’s triangle
* */
public class Array1 {
    public static void main(String[] args) {

        int r = 5;
        int c = 3;
        int element = findElem(r, c);
        System.out.println("Element at ("+r+","+c+"): "+element);
        long newElem = findElemOp(r-1, c-1);
        System.out.println("Opt Element at ("+r+","+c+"): "+newElem);

    }

    // BruteForce Solution :: Native Approach :: Time Complexity-O(N)+O(r)+O(n-r), Space Complexity-O(1)
    public static int findElem(int r, int c) {
        int element = -1;

        if(r<c || r < 1 || c < 1){
            return element;
        }

        element = fact(r-1)/(fact(c-1) * fact((r-1)-(c-1)));

        return element;
    }

    // BruteForce Solution :: Native Approach :: Time Complexity-O(N)+O(r)+O(n-r), Space Complexity-O(1)
    public static long findElemOp(int n, int r) {
        long res = 1;

        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }

        return res;
    }

    public static int fact(int value){
        if( value == 0 || value == 1){
            return 1;
        }

        return value * fact(value-1);
    }
    public static void printArray(Integer[] array){
        System.out.print("Array: ");
        for (int value :
                array) {
            System.out.print(value+" ");
        }
        System.out.println();
    }

}
