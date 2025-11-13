public class studentDetails {
    String name;
    int age;
    String roll ;

    studentDetails(String name, int age, String roll ) {
        this.name = name;
        this.age = age;
        this.roll = roll;
    }

    void displayInfo() {
        System.out.println("Student Name:");
        System.out.println("Age: " +18);
        System.out.println("roll : "+70);
    }

    public static void main(String[] args) {
        studentDetails student1 = new studentDetails("Rishika", 18, "A");
        student1.displayInfo();
    }


}
