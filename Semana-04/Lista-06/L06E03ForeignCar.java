import java.util.Random;

public class L06E03ForeignCar extends L06E01Car {
  String cnpj;
  
  public L06E03ForeignCar(String brand, String model){
    super(brand, model, "Foreign car");
 
    Random random = new Random();
    String cnpj = "";

    cnpj += this.padStart(random.nextInt(100) + "", 2, "0") + '.';
    cnpj += this.padStart(random.nextInt(1000) + "", 3, "0") + '.';
    cnpj += this.padStart(random.nextInt(1000) + "", 3, "0") + '/';
    cnpj += this.padStart(random.nextInt(10000) + "", 4, "0") + '-';
    cnpj += this.padStart(random.nextInt(100) + "", 2, "0");

    this.cnpj = cnpj;
  }

  private String padStart(String string, int length, String pad){
    for (int i = string.length(); i < length; i++){
      string = pad + string;
    }

    return string;
  }

  public String getCNPJ(){
    return this.cnpj;
  }
}
