/**
 * Class representing a line with coordinates of its start and end points.
 */
public class ex15 implements ex15interface {

    /** Array representing the coordinates of the start point */
    private double[] startPoint;
    /** Array representing the coordinates of the end point */
    private double[] endPoint;

    /**
     * Constructor for creating a line with specified start and end coordinates.
     *
     * @param startX X-coordinate of the line's start
     * @param startY Y-coordinate of the line's start
     * @param endX   X-coordinate of the line's end
     * @param endY   Y-coordinate of the line's end
     */
    public ex15(double startX, double startY, double endX, double endY) {
        startPoint = new double[]{startX, startY};
        endPoint = new double[]{endX, endY};
    }

    /**
     * Constructor for creating a line starting at (0,0) and ending at (1,1).
     */
    public ex15() {
        startPoint = new double[]{0, 0};
        endPoint = new double[]{1, 1};
    }

    /**
     * Calculates the length of the line using the distance formula between two points.
     *
     * @return the length of the line
     */
    @Override
    public double calculateLength() {
        double xDiff = endPoint[0] - startPoint[0];
        double yDiff = endPoint[1] - startPoint[1];
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    /**
     * Moves the line by specified offsets along the X and Y axes.
     *
     * @param xOffset offset along the X-axis
     * @param yOffset offset along the Y-axis
     */
    @Override
    public void moveLine(double xOffset, double yOffset) {
        startPoint[0] += xOffset;
        startPoint[1] += yOffset;
        endPoint[0] += xOffset;
        endPoint[1] += yOffset;
    }

    /**
     * Sets the coordinates of the line's start point.
     *
     * @param x X-coordinate of the line's start
     * @param y Y-coordinate of the line's start
     */
    @Override
    public void setStartPoint(double x, double y) {
        startPoint[0] = x;
        startPoint[1] = y;
    }

    /**
     * Sets the coordinates of the line's end point.
     *
     * @param x X-coordinate of the line's end
     * @param y Y-coordinate of the line's end
     */
    @Override
    public void setEndPoint(double x, double y) {
        endPoint[0] = x;
        endPoint[1] = y;
    }

    /**
     * Gets the coordinates of the line's start point.
     *
     * @return an array with X and Y coordinates of the line's start
     */
    @Override
    public double[] getStartPoint() {
        return startPoint;
    }

    /**
     * Gets the coordinates of the line's end point.
     *
     * @return an array with X and Y coordinates of the line's end
     */
    @Override
    public double[] getEndPoint() {
        return endPoint;
    }
}
