package interfacess;

public interface IEvent {


    //fields
    Double MAX_DURATION=90.0;
    //methods
    void startEvent(String[] attendees );
    void endEvent();
    String printEventStatistics();
}
