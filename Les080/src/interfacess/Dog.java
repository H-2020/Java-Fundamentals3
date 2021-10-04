package interfacess;

public class Dog extends Animal{

    private double hairLength;
    private int batchNo;
    private String nickname;
    private int age;

    public Dog(double hairLength, int batchNo, String nickname, int age) {
        this.hairLength = hairLength;
        this.batchNo = batchNo;
        this.nickname = nickname;
        this.age = age;
    }

    public double getHairLength() {
        return hairLength;
    }

    public void setHairLength(double hairLength) {
        if(hairLength > 1){
            this.hairLength = hairLength;
        }
    }

    // METHOD_OVERRIDE_FROM_ANIMAL
    public boolean isAlive() {
        return true;
    }

    public int getBatchNo() {
        return this.batchNo;
    }

    public void setBatchNo(int batchNo) {
        this.batchNo = batchNo;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
