package interfacess;

import java.math.BigDecimal;

public class AmericanFootball implements IFootball {

    //fields
    Integer NO_OF_PLAYERS=11;

    //methods
    void fight( int points){

    }

    //METHOD_OVERRIDE_FROM_FOOTBALL
    public void homeTeamScored(int points) {

    }

    //METHOD_OVERRIDE_FROM_FOOTBALL
    public void visitingTeamScored(int points) {

    }

    //METHOD_OVERRIDE_FROM_FOOTBALL
    public void endOfQuarter(int quarter) {

    }

    //METHOD_OVERRIDE_FROM_SPORT
    public void setHomeTeam(String name) {

    }

    //METHOD_OVERRIDE_FROM_SPORT
    public void setVisitingTeam(String name) {

    }

    //METHOD_OVERRIDE_FROM_SPORT
    public String getHomeTeam() {
        return null;
    }

    //METHOD_OVERRIDE_FROM_SPORT
    public String getVisitingTeam() {
        return null;
    }

    //METHOD_OVERRIDE_FROM_IEVENT
    public void startEvent(String[] attendees) {

    }

    //METHOD_OVERRIDE_FROM_IEVENT
    public void endEvent() {

    }

    //METHOD_OVERRIDE_FROM_IEVENT
    public String printEventStatistics() {
        return null;
    }



    //METHOD_OVERRIDE_FROM_IPROTIFABLE
    public void earn(int noOfAudience) {

    }

    //METHOD_OVERRIDE_FROM_IPROTIFABLE
    public BigDecimal calculateProfit() {
        return null;
    }
}
