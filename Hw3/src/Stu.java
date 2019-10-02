//학생 객체
public class Stu {
    //필드변수 생성
    private int id; //학번
    private String name; //이름
    private int score; //점수
    private Teacher advisor;

    //생성자
    public Stu(int i, String n, int sc) {
        id = i;
        name = n;
        score = sc;
    }
    //학번  접근자
    public int getId(){

        return id;
    }
    //이름 접근자
    public String getName(){

        return name;
    }
    //점수 접근자
    public int getScore() {

        return score;
    }
    //점수변경 메소드
    public  void changeScore(int sc) {

        score = sc;
    }
    //advisor 설정자
    public void setAdvisor(Teacher t) {
        advisor = t;
    }

    //advisor 접근자
    public Teacher getAdvisor(){

        return advisor;
    }
    //정보 출력 메소드
    public void println() {
        System.out.println("[ID : " + id +",Name :" + name +",Score :"+score+"]");
    }
}