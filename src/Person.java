public class Person {
    private String name;
    private Object age;
    public Person (String n){
        name = n;
    }

    public String getName(){
        return name;
    }
    public Object getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(Object age){
        this.age = age;
    }
}
