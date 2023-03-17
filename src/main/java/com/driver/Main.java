package com.driver;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){
        Product p = new Product();
        int ans1 = p.product(10, 20);
        int ans2 = p.product(10, 20, 30);
        double ans3 = p.product(5.5, 2.8);
        System.out.print(ans1+" "+ans2+" "+ans3);
    }
public static class Product{
        public int product(int x, int y){
            return x*y;
        }

        public int product(int x, int y, int z){
            return x*y*z;
        }

        public double product(double x, double y){
            return x*y;
        }

}
}