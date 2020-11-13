package day11_MultiBranchIf;

public class QuizQuestions {
    public static void main(String[] args) {
        int ivar = 100;       //implicit
        double dvar = 200;    //implicit
        float fvar = 300;     //implicit
        ivar = (int) fvar;    //explicit casting
        fvar = ivar;          //implicit
        dvar = fvar;          // implicit
        fvar = (float) dvar;  //explicit casting
        dvar = ivar;          //implicit
        ivar = (int) dvar;    // explicit casting


    }
}
