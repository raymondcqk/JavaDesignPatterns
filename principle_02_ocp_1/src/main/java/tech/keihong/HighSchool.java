package tech.keihong;

/**
 * 高中了，π的精度要求提高，而其他的不变
 */
public class HighSchool {


    protected static final double pai = 3.1415926D;

    public static void main(String[] args) {
        CalculationArea calculationArea = new CalculationAreaHighSchool();
        int r = 29;
        double circular = calculationArea.circular(r);
        System.out.println("圆形面积: " + circular);
        System.out.println("矩形面积: " + calculationArea.rectangle(10, 10));
        System.out.println("三角形面积: " + calculationArea.triangle(29, 12, 20));

        checkCircular(r, circular);

    }

    private static void checkCircular(double r, double result) {
        double teacherResult = pai * r * r;
        if (teacherResult == result) {
            System.out.println("圆形计算正确");
        } else {
            System.out.println("圆形计算错误");
        }
    }
}
