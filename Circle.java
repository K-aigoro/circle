public class Circle {
  public double radius;
  public double PI = 3.142;

  public double getRadius() {
    return this.radius;
  }

  public void setRadius(double newRadius) {
    this.radius = newRadius;
  }

  public double calDiameter() {
    double diameter = 2 * this.radius;
    return diameter;
  }

  public double calArea() {
    return this.PI * Math.pow(this.radius, 2);
  }

}
