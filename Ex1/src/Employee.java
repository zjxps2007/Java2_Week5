public class Employee {
    private static int person;

    private String name;
    private int age;

    Employee(){
        this(" ",0);
    }
    Employee(String name,int age) {
        this.name = name;
        this.age = age;
        Employee.person++;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public static int getPerson() {
        return Employee.person;
    }
    public static void setPerson(int person) {
        Employee.person = person;
    }
    public String toString() {
        return "name = " + this.name + "age = " + this.age;
    }

    public static void main(String[] args) {
        Employee e = new Employee("Alice", 20);
        Employee e2 = new Employee("Bob",20);
        System.out.println(e);
        System.out.println(e2);
        System.out.println("총 직원 수: " + Employee.getPerson());
    }
}