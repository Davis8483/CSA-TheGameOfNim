public class Board {
    private static int numPieces = 0;

    public static void populate(){
        numPieces = 20;
    }
    public static int getNumPieces(){return numPieces;}
    public static Boolean removePieces(int value){
        // checks if value is positive, and if value is between 0 and (numPieces/2)
        if((Integer.signum(value) == 1) && (numPieces-value > 0) && (value <= (int)numPieces/2)){
            numPieces -= value;
            // pieces were subtracted correctly
            return true;
        }
        else{return false;}
    }
}
