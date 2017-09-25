/* PROJECT:  DoEWithWhile       (draw a big E using WHILE loops)
 * AUTHOR:  ______________              DESIGNER:  Dr. Kaminski
 * DESCRIPTION:  Programs draws a big letter E (in console window) based on
 *      user-supplied parameters (dialog boxes):  drawing char, height, width.
 * RULES FOR E's - see comment in code below
 * ASSUMPTION for drawing in Console window:
 *      - it prints from top to bottom,
 *      - and for a particular row, it prints from left to right
 *****************************************************************************/
import javax.swing.JOptionPane;

public class DoEWithWhile {

    public static void main(String[] args) {

        // ---------------------------------------------------------- VARIABLES
        String userInput;
        int height;
        int width;
        char pen;
        // -------------------------------------------------------------- INPUT
        // Temporarily for testing, just HARD-CODED "input"
        height = 10;
        width = 15;
        pen = 'X';

//        userInput = JOptionPane.showInputDialog("Enter height (pos int 5-24)");
//        height = Integer.parseInt(userInput);
//
//        userInput = JOptionPane.showInputDialog("Enter width (pos int 5-24)");
//        width = Integer.parseInt(userInput);
//        
//        userInput = JOptionPane.showInputDialog("Enter drawing character");
//        pen = userInput.charAt(0);       

        // --------------------------------------------------- DRAW THE 5 LINES
        // RULES FOR E's
        // - top & bottom horizontals both full width
        // - middle horizontal is 1/2 width
        // - top & bottom verticals are same size when height is odd,
        //      but for even heights, bottom vertical is slightly taller
        //      - to calculate topVertHeight:
        //              part of entire char's height used by the 3 horizontals
        //              & remainder of height split between the 2 verticals,
        //              (integer divide means this is truncated 1/2 2 not same)
        //      - to calculate bottomVertHeight:
        //              same as topVertHeight if overall height is odd
        //              otherwise it's topVertHeight + 1
        //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        // 1) DRAW TOP HORIZONTAL



        // 2) DRAW TOP VERTICAL



        // 3) DRAW MIDDLE HORIZONTAL



        // 4) DRAW BOTTOM VERTICAL



        // 5) DRAW BOTTOM HORIZONTAL



        // ---------------------------------------------------------- FINISH-UP
        System.out.printf("\n\nHeight: %d, width: %d\n", height, width);
        System.exit(0);
    }
}