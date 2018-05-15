package przykladycwicz;

/**
 * The Circle class models a circle with a radius and color.
 *
 * @author CHC
 */

public class Circle {

    // private instance variables
    private double radius;
    private String color;

    /**
     * Construct a circle with default radius of 1.0 and color of blue.
     */
    public Circle() {
        radius = 1.0;
        color = "blue";
    }

    /** Construct a circle with the given radius and color.
     *  @param radius  The radius of the circle
     *  @param color   The color of the circle
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /** Return the radius of the circle.
     *  @return  The radius of the circle LODZ_mw.
     */
    public double getRadius() {
        return radius;
    }

    /** Set the radius of the circle.
     *  @param radius  The radius of the circle to be set.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Return the color of the circle.
     *   @return  The color of the circle.
     */
    public String getColor() {
        return color;
    }

    /** Set the color of the circle.
     *   @param color  The color of the circle to be set.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /** Return the area of the circle.
     *  @return  The area of the circle.
     */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /** Return a short description of this instance.
     *  @return  A short string description.
     */
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }
}
