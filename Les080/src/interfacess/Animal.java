package interfacess;

/*  */

public abstract class Animal {

    // ABSTRACT_METHOD, MANDATORY_TO_OVERRIDE
    /* Every subclass from Animal super class must contain isAlive method */
    public abstract boolean isAlive();

    // NO_PSEUDO
    public abstract int getBatchNo();

    // NO_PSEUDO
    public abstract void setBatchNo(int batchNo);

    // NO_PSEUDO
    public abstract String getNickname();

    // NO_PSEUDO
    public abstract void setNickname(String nickname);

    // NO_PSEUDO
    public abstract int getAge();

    // NO_PSEUDO
    public abstract void setAge(int age);

}
