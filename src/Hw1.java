import java.util.Scanner;

//배열을 저장하고 평균을 구하는 클래스 선언
class ArrayProc {
    //배열에 입력받은 수를 저장하는 메소드
    public void getValues(int arr[]) {
        Scanner sc = new Scanner(System.in);
        //배열의 입력을 받음
        for(int i =0;i<arr.length;i++) {
            System.out.print((i+1)+"번째 방 데이터 입력 : ");
            arr[i] = sc.nextInt();
        }
    }
    //평균을 구하는 메소드
    public double getAverage(int arr[]) {
        //평균을 구할 변수선언
        double avg = 0;
        //배열의 원소를 더함
        for(int i =0;i<arr.length;i++) {
            avg +=arr[i];
        }
        //평균을 리턴함
        return avg/5;
    }
}

public class Hw1 {
    public static void main(String[] ages) {
        //배열 선언
        int []arr = new int[5];
        ArrayProc arrayProc = new ArrayProc();
        //선언된 배열을 넘겨줌
        arrayProc.getValues(arr);
        //평균을 출력
        System.out.println("평균은 : "+arrayProc.getAverage(arr));
    }
}