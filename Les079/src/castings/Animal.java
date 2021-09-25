package castings;

public abstract class Animal {

    // this == instance

    private String nickname;
    private Integer age;

    public Animal(String nickname) {
        this.nickname = nickname;
    }

    public Animal(String nickname, Integer age) {
        this.nickname = nickname;
        this.age = age;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public abstract void print();

}
