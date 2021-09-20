package polyformismm;

public class Mouse extends Animal{

    private String origin;

    // CUSTOM_METHOD_FOR_MOUSE_ONLY
    public void eatCheese(){
        System.out.println("My favorite cheese is Danish Blue.");
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
