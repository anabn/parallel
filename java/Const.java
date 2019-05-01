public class Const {
    public static final double a=.3;
    public static final double b=.1;
    public static final double A=15;
    public static final double B=13;

    static int xIterations = 10;
    static int timeIterations = 300;
    static double xStep = 1. / (xIterations-1);
    static double tStep = 1. / (timeIterations-1);

    public static final String fileSequential = "sequential";
    public static final String fileParallel = "parallel";
    public static final String fileAnother = "exac";

//    public static double F = B - 10 * a * timeStep;
}
