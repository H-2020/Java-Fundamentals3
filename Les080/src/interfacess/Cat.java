package interfacess;

import java.time.Year;

public class Cat extends Animal{

    // NO_PSEUDO
    private String leftEye;
    private String rightEye;

    private int id;
    private String nick;
    private int birthYear;

    // SET_ALL_FIELD_IN_THIS_METHOD
    public void create(String leftEye, String rightEye, int id, String nick, int birthYear){
        this.leftEye = leftEye;
        this.rightEye = rightEye;
        this.id = id;
        this.nick = nick;
        this.birthYear = birthYear;
    }

    // METHOD_OVERRIDE_FROM_ANIMAL
    public boolean isAlive() {
        return true;
    }

    public int getBatchNo() {
        return this.id;
    }

    public void setBatchNo(int batchNo) {
        this.id = batchNo;
    }

    public String getNickname() {
        return this.nick;
    }

    public void setNickname(String nickname) {
        this.nick = nickname;
    }

    public int getAge() {
        return (Year.now().getValue() - birthYear);
    }

    public void setAge(int age) {
        this.birthYear = (Year.now().getValue() - age);
    }
}
