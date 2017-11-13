package assaf.zfani.simpleadapterdrill;

/**
 * Created by user on 11/13/2017.
 */

public class Worker {
    private String name;
    private  int salary;
    private int age;

    public Worker (String name,int salary,int age)
    {
        this.name = name;
        this.salary= salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}
