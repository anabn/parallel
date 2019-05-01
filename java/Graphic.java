import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Graphic {
    public void print(String string){
        System.out.println(string);
    }

    public void printToPlot(double[][] matrix, String path) {
        try {
            DecimalFormat decimalFormat = new DecimalFormat("#.##", new DecimalFormatSymbols(Locale.US));
            StringBuilder file = new StringBuilder(' ');
            for (int t = 0; t < Const.timeIterations; t++){
                for (int i = 0; i < Const.xIterations; i++){
                    file.append(decimalFormat.format(matrix[t][i])).append(" ");
                }
                file.append("\n");
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
            bufferedWriter.write(file.toString());
            bufferedWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }


    }

}
