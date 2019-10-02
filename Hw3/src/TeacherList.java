public class TeacherList {
    //필드 변수 선언
    private Teacher[] fts;
    private int number;


    //배열 생성자
    public TeacherList() {
        fts = new Teacher[100];
        number = 0;
    }
    //배열크기가 n이 되도록 생성
    public void TeacherList(int n) {
        fts = new Teacher[n];
        number = 0;
    }//리턴 메소드
    public Teacher TeacherAt(int i) {

        return fts[i];
    }
    // 이름 검색 메소드
    public Teacher getByName(String nm) {
        for(int i =0;i<number;i++) {
            if(fts[i].getName().equals(nm)) {
                return fts[i];
            }
        }
        return null;
    }
    //추가 메소드
    public void append(Teacher t) {
        fts[number] = t;
        number ++;
    }
    //출력 메소드
    public void print(){
        for(int i =0; i<number;i++) {
            fts[i].println();
        }
    }
    //교한메소드
    public void swap(int i, int j) {
        Teacher Temp = fts[i];
        fts[i] = fts[j];
        fts[j] = Temp;
    }
    // 배열을 역순으로
    public void reverse() {
        for(int i =0;i<number/2;i++) {
            swap(i,(number-1)-i);
        }
    }
    // 아이디를 기준으로 정렬
    public void sortById() {
        for(int i =0;i<number;i++) {
            for(int j =i;j<number;j++) {
                if(fts[i].getId()>fts[j].getId()) {
                    swap(i,j);
                }
            }
        }
    }
}
