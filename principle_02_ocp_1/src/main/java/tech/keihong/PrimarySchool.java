package tech.keihong;

/**
 * 原场景，使用原有的π即可
 */
public class PrimarySchool {

    protected static final double pai = 3.14D;

    public static void main(String[] args) {
        CalculationArea calculationArea = new CalculationArea();
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
