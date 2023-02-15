public class  CashierDataBase {
    private String name;
    private int age;
    private String sex;

//    public CashierDataBase(String name, int age, String sex, int levelOfExperience) {
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
//        LevelOfExperience = levelOfExperience;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getLevelOfExperience() {
        return LevelOfExperience;
    }

    public void setLevelOfExperience(int levelOfExperience) {
        LevelOfExperience = levelOfExperience;
    }

    private int LevelOfExperience;
}
