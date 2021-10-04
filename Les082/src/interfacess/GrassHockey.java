package interfacess ;

public class GrassHockey implements Hockey {


    //methods
    void changeSticks(int quantity){

    }
    boolean wearProtection(){
       return true;
    }

    //METHOD_OVERRIDE_FROM_HOCKEY
    public void homeGoalScored() {

    }

    //METHOD_OVERRIDE_FROM_HOCKEY
    public void visitingGoalScored() {

    }

    //METHOD_OVERRIDE_FROM_HOCKEY
    public void endOfPeriod(int period) {

    }

    //METHOD_OVERRIDE_FROM_HOCKEY
    public void overTimePeriod(int overtime) {

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
}
