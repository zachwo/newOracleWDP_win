public class Student {

    private int id;
    private String name;
    private int age;
    private String sex;
    private int score;
    private String classroom;


    public Student(int id){
        this.id=id;
    }

    public Student(int id, String name, int age, String sex, int score, String classroom) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.score = score;
        this.classroom = classroom;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
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
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public String getClassroom() {
        return classroom;
    }
    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    @Override
    public String toString(){
        return "学号:"+id+",姓名:"+name+",年龄:"+age+",性别:"+sex;
    }

}