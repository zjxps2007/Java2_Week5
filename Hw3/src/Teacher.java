public class Teacher {
    //필드 변수선
    private int id;
    private String name;
    private int age;

    //생성
    public Teacher (int i,String n,int a) {
        id = i;
        name = n;
        age = a;
    }
    //아이디 접근자
    public int getId(){

        return id;
    }
    //이름접근자
    public String getName() {

        return name;
    }
    //나이 접근자
    public int getAge() {

        return age;
    }
    //정보출력
    public void println() {

        System.out.println("Id: "+id+" Name: "+name+" Age: "+age);
    }
    //문자열로 린턴하는 메소드
    public String toString() {
        return ("Id: "+id+" Name: "+name+" Age: "+age);
    }
}