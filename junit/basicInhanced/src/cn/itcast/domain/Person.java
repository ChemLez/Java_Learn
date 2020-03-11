package cn.itcast.domain;

public class Person {

    private String name;
    private int age;
    public int salary;
    int id;
    protected String department;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, int salary, int id, String department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.id = id;
        this.department = department;
    }

    public Person() {

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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", id=" + id +
                ", department='" + department + '\'' +
                '}';
    }

    public void eat() {
        System.out.println("eat...");
    }

    public void eat(String food) {
        System.out.println("eat..." + food);
    }
}
