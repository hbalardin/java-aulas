import java.util.ArrayList;

public class L05E03Cart {
  private ArrayList<String> products;

  public L05E03Cart(){
    this.products = new ArrayList<>();
  }

  public String toString(){
    if (this.products.isEmpty()) {
      return "Cart is empty!";
    } else {
      String products = this.products.get(0);
      for (int i = 1; i < this.products.size(); i++){
        products += ", " + this.products.get(i);
      }
      return "Cart products: " + products;
    }
  }

  public int getQuantity(){
    return this.products.size();
  }

  public boolean addProduct(String product){
    boolean productAlreadyPurchased = false;
    
    if (this.products.contains(product)){
      productAlreadyPurchased = true;
      return productAlreadyPurchased;
    }

    this.products.add(product);

    return productAlreadyPurchased;
  }

  public boolean removeProduct(String product){
    boolean productExists = true;
    
    if (this.products.contains(product)){
      this.products.remove(product);
      return productExists;
    }

    productExists = false;
    return productExists;
  }
}
