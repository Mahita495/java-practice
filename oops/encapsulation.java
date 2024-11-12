// encapsulation binds data and code together and is a concept of creating and defining object's permissions and restrictions for variables and 
// methods as well.Making classes a private or public access specifiers is the use of encapsulation

package oops;

class Person{
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }
}

public class encapsulation {

    public static void main(String[] args) {

        Person person = new Person();
        person.setAge(22);
        person.setName("Mahita");

        System.out.println("Name = "+person.getName());
        System.out.println("Age = "+person.getAge());
        
    }
    
}
