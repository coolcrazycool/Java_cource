public class Point3d {
    private double xCoordinate;
    private double yCoordinate;
    private double zCoordinate;

    public Point3d() {
        this.xCoordinate = 0;
        this.yCoordinate = 0;
        this.zCoordinate = 0;
    }

    public Point3d(double xC, double yC, double zC) {
        this.xCoordinate = xC;
        this.yCoordinate = yC;
        this.zCoordinate = zC;
    }

    public double getXCoordinate() {
        return xCoordinate;
    }

    public double getYCoordinate() {
        return yCoordinate;
    }

    public double getZCoordinate() {
        return zCoordinate;
    }

    public void setXCoordinate(double newX) {
        xCoordinate = newX;
    }

    public void setYCoordinate(double newY) {
        yCoordinate = newY;
    }

    public void setZCoordinate(double newZ) {
        zCoordinate = newZ;
    }

    public static boolean equals(Point3d fP, Point3d sP) {
        if (fP.xCoordinate == sP.xCoordinate & fP.yCoordinate == sP.yCoordinate & fP.zCoordinate == sP.zCoordinate){
            return true;
        }else{
            return false;
        }
    }

    public static double distanceTo(Point3d fP, Point3d sP) {
        double x = Math.pow((fP.xCoordinate - sP.xCoordinate), 2);
        double y = Math.pow((fP.yCoordinate - sP.yCoordinate), 2);
        double z = Math.pow((fP.zCoordinate - sP.zCoordinate), 2);
        double distanceBetweenPoints = Math.sqrt(x + y + z);
        return distanceBetweenPoints;
    }

    public static double computeArea(Point3d fP, Point3d sP, Point3d thP) {
        if (Point3d.equals(fP, sP) | Point3d.equals(fP,thP) | Point3d.equals(sP, thP)) {
            return -1;
        }
        double firstToSecond = Point3d.distanceTo(fP, sP);
        double secondToThird = Point3d.distanceTo(sP, thP);
        double firstToThird = Point3d.distanceTo(fP, thP);
        double halfPerimeter = (firstToSecond + secondToThird + firstToThird)/2;
        double areaS = Math.sqrt(halfPerimeter * (halfPerimeter - firstToSecond) * (halfPerimeter - secondToThird) * (halfPerimeter - firstToThird));
        return areaS;
    }
}
