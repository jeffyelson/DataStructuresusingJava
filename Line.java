public class Line {
    // ToDo: create useful member variables
    private final Point point1;
    private final Point point2;

    // --------------------------------------------------------------- //
    public Line(Point p0, Point p1) {
        // ToDo: add your code for the constructor
        // ToDO: Points should be saved as reference
        this.point1 = p0;
        this.point2 = p1;
    }

    // --------------------------------------------------------------- //
    public Point getPoint(int idx) {
        // ToDo: return the point with the corresponding index
        // ToDo: return null if the index is neither 0 nor 1
        Point value;
        if (idx == 0) {
            value = point1;
        } else if (idx == 1) {
            value = point2;
        } else value = null;
        return value;
    }

    // --------------------------------------------------------------- //
    public Point getCenterPoint() {
        // ToDo: compute and return the center of the line
        Point centre = new Point((point1.getX() + point2.getX()) / 2, (point1.getY() + point2.getY()) / 2);
        return centre;
    }
}
