//Students 클래스 생성
public class Students {
    private Stu[] sts; //stu 배열선언
    private int number;  //배열에 있는 객체수
    //생성자
    public Students(){
        sts = new Stu[100];
        number = 0;
    }
    public Students(int n) {
        sts = new Stu[n];
        number = 0;
    }
    //i 번째학생 검색
    public Stu StudentsAt(int i) {
        if(0<=i&&i<=number-1){
            return sts[i];
        }
        else {
            return null;
        }
    }
    //학생추가 메소드
    public void append(Stu s) {
        sts[number] = s;
        number ++;
    }
    //학생이름 검색
    public Stu getByName(String nm) {
        for(int i = 0; i<number;i++) {
            if(sts[i].getName().equals(nm)) {
                return sts[i];
            }
        }
        return null;
    }
    //출력 메소드
    public void print(){
        for(int i=0; i<number;i++) {
            sts[i].println();
        }
    }
    //교환 메소드
    private void swap(int i, int j) {
        Stu temp = sts[i];
        sts[i] = sts[j];
        sts[j] = temp;
    }
    //학번으로 정렬
    public void sortByid(){
        for (int i = 0; i < number; i++) {
            for (int j = i; j < number; j++) {
                if (sts[i].getId() > sts[j].getId()) {
                    swap(i, j);
                }
            }
        }
    }
    //성적순으로 정렬
    public  void sortByScore(){
        for (int i = 0; i < number; i++) {
            for (int j = i; j < number; j++) {
                if (sts[i].getScore() > sts[j].getScore()) {
                    swap(i, j);
                }
            }
        }
    }
    //전체 학생 평균 메소드
    public double average(){
        double sum = 0;
        for(int i = 0;i<number;i++) {
            sum += sts[i].getScore();
        }
        return sum/number;
    }
}
