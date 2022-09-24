package tech.keihong;

public class CalculationAreaHighSchool extends CalculationArea {

    protected final double pai = 3.1415926D;

    @Override
    public double circular(double r) {
        return pai * r * r;
    }
}
