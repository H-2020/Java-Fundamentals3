package reftype_class;

import java.time.Duration;

public abstract class AAnimal {

    //Fields
    private String nickname;
    private Integer age;
    private Boolean alive;

    //Constructor
    public AAnimal(String nickname, Boolean alive) {
        this.setNickname(nickname);
         this.setAlive(alive);
    }

    //Getters_setters
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        if(this.nickname==null){
            this.nickname="Intec";
        }else {
            this.nickname = nickname;
        }
    }

    public Boolean getAlive() {
        return alive;
    }

    public void setAlive(Boolean alive) {
        this.alive = alive;
    }
    //Abstract_Methoden
    public abstract void eat(String foodName);
    public abstract void travel(Integer distanceInMeters);
    public abstract void sleep(Duration duration);



}
