package interfacess;

public class Dinosaur extends Animal {

    /*
    * If a dinosaur can eat people more than 0 then
    * dangerous
    * If not,
    * not dangerous
    * */

    private int noOfPeopleCanEat;
    private boolean dangerous;

    public Dinosaur(int noOfPeopleCanEat) {
//        this.noOfPeopleCanEat = noOfPeopleCanEat;
        this.setNoOfPeopleCanEat(noOfPeopleCanEat);
    }

    public int getNoOfPeopleCanEat() {
        return noOfPeopleCanEat;
    }

    public void setNoOfPeopleCanEat(int noOfPeopleCanEat) {
        if(noOfPeopleCanEat > 0){
            this.dangerous = true;
        }
        this.noOfPeopleCanEat = noOfPeopleCanEat;
    }

    public boolean isDangerous() {
        return dangerous;
    }

    public void setDangerous(boolean dangerous) {
        this.dangerous = dangerous;
    }

    public boolean isAlive() {
        return false;
    }

    public int getBatchNo() {
        return 0;
    }

    public void setBatchNo(int batchNo) {

    }

    public String getNickname() {
        return null;
    }

    public void setNickname(String nickname) {

    }

    public int getAge() {
        return 0;
    }

    public void setAge(int age) {

    }
}
