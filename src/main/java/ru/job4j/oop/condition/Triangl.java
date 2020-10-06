package ru.job4j.oop.condition;

public class Triangl {
    private PointOOP first;
    private PointOOP second;
    private PointOOP third;

    public Triangl(PointOOP ap, PointOOP bp, PointOOP cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double period(double a, double b, double c) {
        double rsl = (a + b + c) / 2;
        return rsl;
    }


    public boolean exist(double ab, double ac, double bc) {
         if (((ab + ac) > bc) && (( ac + bc) > ab) && (( ab + bc) > ac)){
             return true;
         }
        return false;
    }

    public double area() {
        double rsl = -1;
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);
        double p = period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            rsl = Math.sqrt(period(ab,ac,bc) * (period(ab,ac,bc) - ab) * (period(ab,ac,bc) - ac) * (period(ab,ac,bc) - bc));
        }
        return rsl;
    }

}
