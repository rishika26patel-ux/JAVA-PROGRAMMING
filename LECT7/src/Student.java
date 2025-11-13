class Student{
String name;
int rollNumber;
double marks;
void display(){
    System.out.println("Name"+" "+ name);
    System.out.println("rollNUmber"+" "+ rollNumber);
    System.out.println("marks"+" "+ marks);

}
}
class main{
    public static void main(String[]args){
        Student s1=new Student();
        s1.name="rishika";
        s1.rollNumber=170;
        s1.marks=89.7;

        Student s2=new Student();
        s2.name="riya";
        s2.rollNumber=174;
        s2.marks=89.7;


        Student s3=new Student();
        s3.name="neha";
        s3.rollNumber=151;
        s3.marks=89.7;
        s1.display();
        s2.display();
        s3.display();

    }
}
