package reftype_class;

import java.awt.*;
import java.time.Duration;

public class Cat extends AAnimal {
    private Color leftEyeColor;
    private Color rightEyeColor;

    public Cat(String nickname, Boolean alive, Color leftEyeColor, Color rightEyeColor) {
        super(nickname, alive);
        this.leftEyeColor = leftEyeColor;
        this.rightEyeColor = rightEyeColor;
    }

   public void miauw(){

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
