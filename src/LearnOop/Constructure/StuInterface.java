package LearnOop.Constructure;
/*
@author YwQ
@version 1.0
*/

public class StuInterface {
    public static void main(String[] args) {
        Student student =new Student();
        Student st =new Student(12,"212");
        System.out.println(st.getBirth()+st.getName());
        student.setName("213");
        System.out.println(student.getBirth()+student.getName());
        student.setName("wqwqwq");student.setBirth(12121212);


    }

}
