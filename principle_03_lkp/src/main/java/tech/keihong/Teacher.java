package tech.keihong;


import java.util.List;

public class Teacher {

    private String name;
    private String clazz;
    private List<Student> studentList;

    public Teacher(String name, String clazz, List<Student> studentList) {
        this.name = name;
        this.clazz = clazz;
        this.studentList = studentList;
    }

    public String getName() {
        return name;
    }

    public String getClazz() {
        return clazz;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public Double getTotalScore() {
        Double totalScore = 0d;
        for (Student student : studentList) {
            totalScore += student.getScore();

        }
        return totalScore;
    }

    public Double getAverageScore() {
        return this.getTotalScore() / studentList.size();
    }
}
