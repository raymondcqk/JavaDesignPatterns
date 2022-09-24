package tech.keihong;


import java.util.ArrayList;
import java.util.List;

public class Principal {

    private String name;
    private List<Teacher> teacherList;

    public Principal(String name, List<Teacher> teacherList) {
        this.name = name;
        this.teacherList = teacherList;
    }

    public List<InfoClazzScore> getScoreInfo() {
        List<InfoClazzScore> infoClazzScores = new ArrayList<>();

        for (Teacher teacher : teacherList) {
            String clazz = teacher.getClazz();
            String teacherName = teacher.getName();
            Double totalScore = teacher.getTotalScore();
            Double averageScore = teacher.getAverageScore();
            InfoClazzScore infoClazzScore = new InfoClazzScore(clazz, teacherName, totalScore, averageScore);
            infoClazzScores.add(infoClazzScore);
        }
        return infoClazzScores;
    }
}
