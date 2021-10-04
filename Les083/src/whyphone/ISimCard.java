package whyphone;

public interface ISimCard {


    //Methods
     default String startCall(){

        return "calling 911";
    }
    default void endCall(){
        System.out.println("call ended");
    }

}
