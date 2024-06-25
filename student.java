public class student
{
    String name;
    int id;
    int age;
    student(String name, int id, int age)
    {
        this.name = name;
        this.id = id;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String displayAll()
    {
        return(this.getName()+this.getAge()+this.getId());
        /*System.out.println(name);
        System.out.println(id);
        System.out.println(age);*/
    }
    public static void main(String[] args) {
        student obj1 = new student("manu",1,21);
        System.out.println(obj1.displayAll());
    }
}