package com.example.algorithm;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

import java.awt.*;

/**
 * @author Mr.Mai
 * @version 2.0
 * @date 2021/9/2 0002 8:40
 */
public class RandomConnection {



    public static void main(String[] args) throws InterruptedException {

        int N = 10;
        circle(0.5,0.5,0.5);

        Double angle = 360.0 / N;

        Double P = StdRandom.uniform();

        StdDraw.setPenColor(Color.BLACK);
        StdDraw.setPenRadius(0.01);

        Point[] points = new Point[N];

        for (int i = 0; i < N; i++) {
            points[i] =
                    //弧度 = 角度数 * Pi / 180
                    new Point(0.5 + 0.5 * Math.cos(i * angle * Math.PI / 180), 0.5 + 0.5 * Math.sin(i * angle * Math.PI / 180));
            StdDraw.point(points[i].x, points[i].y);
        }


        StdDraw.setPenColor(Color.GRAY);

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (StdRandom.bernoulli(P)){
                    Thread.sleep(100);
                    StdDraw.line(points[i].x, points[i].y, points[j].x, points[j].y);
                }
            }
        }

    }

    public static void circle(double x, double y, double radius){
        StdDraw.circle(x, y, radius);
    }
}
class Point{
    Double x;
    Double y;
    public Point(Double x, Double y){
        this.x = x;
        this.y = y;
    }
}