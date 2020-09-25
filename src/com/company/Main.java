package com.company;
public class Main {
    public static void main(String[] args){}
    abstract class Shape{
        private String colour;
        private boolean filled;
        public Shape(String colour, boolean filled){
            this.colour = colour;
            this.filled = filled;
        }
        public String getShapeColour(){
            return colour;
        }
        public void setShapeColour(String colour){
            this.colour = colour;
        }
        public boolean getFilled(){
            return filled;
        }
        public void setFilled(boolean filled){
            this.filled = filled;
        }
        abstract public double getArea();
    }
    class Circle extends Shape{
        private double radius;
        private double diameter;
        public Circle(String colour, boolean filled, double radius, double diameter){
            super(colour, filled);
            this.radius = radius;
            this.diameter = diameter;
        }
        public double getRadius(){
            return radius;
        }
        public void setRadius(double radius){
            this.radius = radius;
        }
        public double getDiameter(){
            return diameter;
        }
        public void setDiameter(double diameter){
            this.diameter = diameter;
        }
        @Override
        public double getArea() {
            return (Math.PI * Math.pow(radius,2));
        }
    }
    class Rectangle extends Shape{
        private int length;
        private int width;
        public Rectangle(int length, int width, String colour, boolean filled){
            super(colour, filled);
            this.length = length;
            this.width = width;
        }
        public void setLength(int length){
            this.length = length;
        }
        public int getLength(){
            return length;
        }
        public void setWidth(int width){
            this.width = width;
        }
        public int getWidth(){
            return width;
        }
        @Override
        public double getArea() {
            return (length*width);
        }
    }
    class Oval extends Circle{
        private double diameter1;
        private double diameter2;
        public Oval(double diameter1, double diameter2, String colour, boolean filled, double radius, double diameter){
            super(colour, filled, radius, diameter);
            this.diameter1 = diameter1;
            this.diameter2 = diameter2;
        }
        public void setDiameter1(double diameter1){
            this.diameter1 = diameter1;
        }
        public double getDiameter1(){
            return diameter1;
        }
        public void setDiameter2(double diameter2){
            this.diameter2 = diameter2;
        }
        public double getDiameter2(){
            return diameter2;
        }
        @Override
        public double getArea() {
            return Math.PI * diameter1 * diameter2;
        }
    }
    class Square extends Rectangle{
        private int side;
        public Square(int length, int width, String colour, boolean filled, int side){
            super(length, width, colour, filled);
            this.side = side;
        }
        public void setSide(int side){
            this.side = side;
        }
        public double getSide(){
            return side;
        }
        @Override
        public double getArea() {
            return side*side;
        }
    }
}