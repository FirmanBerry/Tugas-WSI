package array2d;

/**
 *
 * @author M Norisman Firmansyah E41202317
 */
public class Array2D {
    public static void main(String[] args) {
        int[][] array ={ {1, 2, 3, 4},{8, 5, 6, 9},{1, 5, 0, 2},{8, 2, 4, 5} };
        
            for (int baris = 0; baris < 4; baris++){
                for (int kolom = 0; kolom < 4; kolom++){
                    System.out.print(array[baris][kolom] + "  ");
                }
                System.out.println("");
                
            }
    }
    
}
