public class Hw3 {
    public static void main(String[] args) {
        TeacherList fl = new TeacherList();
        fl.append(new Teacher(123, "Joo0", 40));
        fl.append(new Teacher(234, "Joo1", 41));
        fl.append(new Teacher(345, "Joo2", 42));
        Students c = new Students();

        Stu s = new Stu(783, "Hank", 93);
        s.setAdvisor(fl.getByName("Joo0"));
        c.append(s);

        s = new Stu(678, "Joseph", 83);
        s.setAdvisor(fl.getByName("Joo1"));
        c.append(s);

        s = new Stu(710, "Flora", 94);
        s.setAdvisor(fl.getByName("Joo2"));
        c.append(s);

        s = new Stu(690, "Cathy", 95);
        s.setAdvisor(fl.getByName("Joo2"));
        c.append(s);

        System.out.println("---------------");

        fl.print();
        System.out.println("---------------");

        fl.reverse();
        fl.print();
        System.out.println("---------------");

        fl.sortById();
        fl.print();
        System.out.println("---------------");

        c.StudentsAt(2).getAdvisor().println();

        System.out.println("---------------");
        System.out.println(fl.getByName("Joo1"));
    }
}