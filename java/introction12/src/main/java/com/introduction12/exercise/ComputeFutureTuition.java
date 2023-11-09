import javax.swing.plaf.metal.MetalIconFactory.FolderIcon16;

public class ComputeFutureTuition {
  public static void main(String[] args) {
    // suppose tuition at now is $10,000
    double tuition = 10000;
    double tuitionInTenthYear = tuition;
    // Compute tuition in 10 years
    for (int i = 0; i < 10; i++) {
      tuitionInTenthYear *= 1.05;// increases 5% every year
    }

    System.out.printf("The tuition at tenth year is: %.3f \n", tuitionInTenthYear);
    double costOfTuitionIn4Years = 0;// Declare cost of tuition in four year after tenth year
    // Total cost of four year's worth of tuition starting after the tenth year
    for (int i = 0; i < 4; i++) {
      costOfTuitionIn4Years += tuitionInTenthYear; // sum of four years
      tuitionInTenthYear *= 1.05;
    }

    System.out.printf("Total tuition in four years after tenth year is: %.3f \n", costOfTuitionIn4Years);

  }
}
