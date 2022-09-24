package tech.keihong;

import java.util.ArrayList;
import java.util.List;

public class ReportService {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("小陈和", 100d));
        studentList.add(new Student("小陈2", 90d));
        studentList.add(new Student("小陈3", 80d));

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(new Teacher("陈老师", "班级1", studentList));

        Principal principal = new Principal("陈校长", teacherList);

        List<InfoClazzScore> scoreInfo = principal.getScoreInfo();

        System.out.println(scoreInfo);
    }
}
