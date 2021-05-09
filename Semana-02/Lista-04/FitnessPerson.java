public class FitnessPerson {
    double height;

    double weight;

    FitnessPerson(double height, double weight) {
      this.height = height;
      this.weight = weight;
    }

    double calculateIMC() {
      double imc = this.weight / Math.pow(this.height, 2);
      return imc;
    }

    void weightGain(double kilos) {
      this.weight += kilos;
    }
   
}
