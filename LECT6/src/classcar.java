//public class Car {
  //  String name;
    //void display(){
      //  System.out.println("hello");
    //}
//}
//class Car{
  //  public static void main(String[]args){
    //    Car obj=new Car();
      //  obj.display();
    //}
//}

public class classcar {
    String model;
    int year;

    classcar(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Car Model: " + model);
        System.out.println("Manufacturing Year: " + year);
    }

    public static void main(String[] args) {
        classcar myCar = new classcar("scarpio", 2025);
        myCar.displayInfo();
    }
}
