package whyphone;

public class DummyPhone implements ISimCard, IRadio {



    //Method_override_from_IRadio
    public double playChannel() {
        return 0;
    }

    //Method_override_from_IRadio
    public double changeChannel() {
        return 0;
    }

    //Method_override_from_ISimCard
    public String startCall() {
        return null;
    }

    //Method_override_from_ISimCard
    public void endCall() {

    }
}
