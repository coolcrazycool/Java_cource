import java.io.*;
public class Lab1 {
    public static double getDouble() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Read in a whole line of text.
        String s = br.readLine();

        double d = Double.parseDouble(s);
        //Return the inputted double.
        return d;
    }

    public static void main(String[] args) throws IOException {
        Point3d fPoint = new Point3d(getDouble(),getDouble(),getDouble());
        Point3d sPoint = new Point3d(getDouble(),getDouble(),getDouble());
        Point3d thPoint = new Point3d(getDouble(),getDouble(),getDouble());
        System.out.println(Point3d.equals(fPoint, sPoint));
        System.out.println(Point3d.distanceTo(fPoint, sPoint));
        if (Point3d.computeArea(fPoint, sPoint, thPoint) == -1) {
            System.out.println("Two or more Points is equal - area = 0");
        } else {
            System.out.println(Point3d.computeArea(fPoint, sPoint, thPoint));
        }
    }
}
