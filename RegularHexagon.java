package com.company;

public class RegularHexagon {
    /*Array points holds 6 CoordinatePoints objects that represent the vertices of the RegularHexagon.
     The CoordinatePoints objects are in consecutive order.  That is, if you connect the element at index 0
    with the element at index 1 and so on to the element at index 5 and then back to the element at index 0,
    the hexagon will be formed correctly.
    */
    private CoordinatePoints[] points;

    public RegularHexagon(CoordinatePoints[] points;) {
        this.points = points;
    }

    public double getSideLength()
    {
        //find the change between px2 and px1, square it
        //find the change between py2 and py1, square it
        //add them
        //square root them
        //return distance

        double px1, py1 = points[0]
        double px2, py2 = points[1]

        double xTerm = Math.pow((px2 - px1), 2);
        double yTerm = Math.pow((py2-py1), 2);
        double distance = Math.sqrt((xTerm + yTerm));

        return distance;
    }

    public double getArea()
    {
        //all multiplication, order doesn’t matter
        //square side length
        //return the area

        double area = (1/2)*(Math.pow(getSideLength(), 2) * 3 * Math.sqrt(3));
        return area;
    }

    public CoordinatePoint getCenter()
    {
        //need px1
        //need py1
        //need px2
        //need py2
        //add px1 and px2, then multiply by ½
        //add py1 and py2, then multiply by ½
        //create and then return the CoordinatePoint midpoint

        double xOfMiddle = (1/2) * (px1+px2);
        double yOfMiddle = (1/2) * (py1+py2);

        CoordinatePoint midpoint = new CoordinatePoint(xOfMiddle, yOfMiddle);
        return midpoint;
    }
}