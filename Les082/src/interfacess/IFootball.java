package interfacess;

public interface IFootball extends ISports,IEvent,IProtifable{

    //fields
    Integer NO_OF_PLAYERS=11;

    //methods
    void homeTeamScored(int points);
    void visitingTeamScored(int points);
    void endOfQuarter(int quarter);


    String toString();
    boolean equals(Object obj);
    int hashCode();



}
