package voorbeeldexamen;

public class Affenpinscher extends HomelyDog{

    private String color;
    private String nickname;

    public Affenpinscher(String name) {
        super(name);
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    //METHOD_OVERRIDE_FROM_WOLF
    public void makeNoise() {
        System.out.println("WOW WOW WOW");

    }

    public void dance(){

    }
}
