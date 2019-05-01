public class Main {
    public static void main(String[] args) {

        Exact.calculate();
        new SequentialSolving().calculate();
        new ParallelSolving().calculate();
        Error error = new Error();

        System.out.println("Computation error: " + error.error(SequentialSolving.matrix) + " % ");
        System.out.println("Computation error: " + error.error(ParallelSolving.matrix) + " % ");
    }
}
