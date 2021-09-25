package forest;

public  class Animal {

    private String nickname;
    private int age;

    public Animal(String nickname) {
        this.nickname = nickname;
    }

    public Animal(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // METHOD_OVERRIDE_FROM_OBJECT
    public String toString() {
        return "Animal: nickname: " + this.nickname + ", age: " + this.age;
    }


    // METHOD_OVERRIDE_FROM_OBJECT
    public int hashCode() {
       return 1;
    }
}
