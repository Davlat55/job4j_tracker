package ru.job4j.oop.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class PointOOP {

    private int x;

    private int y;

    private int z;

    public PointOOP(int first, int second, int third) {

        int x = new first;
        int y = new second;
        int z = new third;
    }

    public double distance(PointOOP that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

    public static void main(String[] args) {
        PointOOP a = new PointOOP(0, 0, 1);
        PointOOP b = new PointOOP(0, 2, 1);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}
