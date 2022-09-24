package tech.keihong;

public class Girl {
   private String name;
   private Integer age;
   private Integer figure;

    public Girl(String name, Integer age, Integer figure) {
        this.name = name;
        this.age = age;
        this.figure = figure;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getFigure() {
        return figure;
    }

    public void setFigure(Integer figure) {
        this.figure = figure;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
