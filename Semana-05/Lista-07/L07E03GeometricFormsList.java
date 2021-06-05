public class L07E03GeometricFormsList {
  private L07E01GeometricForm[] list;
  private int size;

  L07E03GeometricFormsList(int limit){
    this.list = new L07E01GeometricForm[limit];
    this.size = 0;
  }

  public int getSize(){
    return this.size;
  }

  public String toString(){
    String response = "";
    for (int i = 0; i < this.size; i++){
      response += "\n" + this.list[i];
    }

    return response;
  }

  public void add(L07E01GeometricForm form){
    int limit = this.list.length;
    int i = this.size;

    if (i >= limit){
      System.out.println("This list has already reached its limit.");
    } else {
     this.list[i] = form;
     this.size += 1;
    }
  }
}
