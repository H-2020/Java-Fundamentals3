package reftype_class;

import java.time.Duration;

public class Lion extends AAnimal{
    private Character gender;
    private Boolean liveInAZoom;

    public Lion(String nickname, Boolean alive, Character gender) {
        super(nickname, alive);
        this.gender = gender;

    }
    public void graaauw(){

    }

    //METHOD_OVERRIDE_FROM_AANIMAL
    public void eat(String foodName) {

    }

    //METHOD_OVERRIDE_FROM_AANIMAL
    public void travel(Integer distanceInMeters) {

    }

    //METHOD_OVERRIDE_FROM_AANIMAL
    public void sleep(Duration duration) {

    }
}
