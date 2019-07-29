public class QueenAttackCalculator {
    Queen queen1,queen2;

    QueenAttackCalculator(Queen queen1,Queen queen2){
        this.queen1 = queen1;
        this.queen2 = queen2;
        if(queen1 == null || queen2 == null)
            throw new IllegalArgumentException("You must supply valid positions for both Queens.");
        if(queen1.row == queen2.row && queen1.col == queen2.col){
            throw new IllegalArgumentException("Queens cannot occupy the same position.");
        }
    }
    Boolean canQueensAttackOneAnother(){
        int t1 = queen1.row-queen2.row;
        int t2 = queen1.col-queen2.col;
        if(t1*t2==0 || Math.abs(t1)==Math.abs(t2))
            return true;
        return false;

    }

}
class Queen {
    int row;
    int col;
    Queen(int row,int col){
        this.col = col;
        this.row = row;
        if(col < 0){
            throw new IllegalArgumentException("Queen position must have positive column.");
        }
        if(row < 0){
            throw new IllegalArgumentException("Queen position must have positive row.");
        }
        if(col > 7){
            throw new IllegalArgumentException("Queen position must have column <= 7.");
        }
        if(row > 7){
            throw new IllegalArgumentException("Queen position must have row <= 7.");
        }
    }
}
