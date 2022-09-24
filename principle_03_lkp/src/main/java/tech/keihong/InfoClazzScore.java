package tech.keihong;

public class InfoClazzScore {

    private String clazz;
    private String teacherName;
    private Double totalScore;
    private Double averageScore;

    public InfoClazzScore(String clazz, String teacherName, Double totalScore, Double averageScore) {
        this.clazz = clazz;
        this.teacherName = teacherName;
        this.totalScore = totalScore;
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "InfoDto{" +
                "clazz='" + clazz + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", totalScore='" + totalScore + '\'' +
                ", averageScore='" + averageScore + '\'' +
                '}';
    }
}
