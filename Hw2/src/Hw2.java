class Box {
    //필드변수 선언
    private int width;
    private int column;
    private int height;

    //생성자
    public Box(int width, int column, int height) {
        this.width = width;
        this.column = column;
        this.height = height;
    }

    //부피 구하는 메소드
    public int getVolume() {
        return width * column * height;
    }

    //부피비교 메소드
    public boolean EqualsVolume(Box b) {
        if (getVolume() == b.getVolume()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] ages) {
        //박스 생성자 호출
        Box b1 = new Box(3, 3, 6);
        Box b2 = new Box(4, 5, 6);
        //출력
        System.out.println("b1의 부피는" + b1.getVolume());
        System.out.println("b2의 부피는" + b2.getVolume());

        //비교해서 출력
        if (b1.EqualsVolume(b2)) {
            System.out.println("두박스의 부피는 같습니다.");
        }
        else {
            System.out.println("두박스의 부피는 다릅니다.");
        }
        //박스 생성자 호출
        Box b3 = new Box(6, 3, 2);
        Box b4 = new Box(3, 6, 2);
        //출력
        System.out.println("\nb1의 부피는" + b3.getVolume());
        System.out.println("b2의 부피는" + b4.getVolume());

        //비교해서 출력
        if (b3.EqualsVolume(b4)) {
            System.out.println("두박스의 부피는 같습니다.");
        }
        else {
            System.out.println("두박스의 부피는 다릅니다.");
        }


    }
}
