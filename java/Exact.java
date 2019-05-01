public class Exact {
    static double[][] matrix = new double[Const.timeIterations][Const.xIterations];
    private static double functionF(int t, double tStep, double B, double a){
        return (B - 10 * a * t * tStep);
    }

    static void calculate(){
        Graphic graphic = new Graphic();
        for (int t = 0; t <Const.timeIterations; t++){
            for (int i = 0; i < Const.xIterations; i++){
                double F = functionF(t, Const.tStep, Const.B, Const.a);
                matrix[t][i] = Math.pow( Math.pow( i * Const.xStep, 2)/F
                                + Const.A * Math.pow(F, -0.2)
                                - Const.b * F / (24 * Const.a), 2);
            }
        }
        graphic.printToPlot(matrix, Const.fileAnother);
    }
}
