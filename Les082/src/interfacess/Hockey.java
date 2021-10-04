package interfacess;

public interface Hockey extends ISports {

    //methods
    void homeGoalScored();
    void visitingGoalScored();
    void endOfPeriod(int period);
    void overTimePeriod(int overtime);



}
