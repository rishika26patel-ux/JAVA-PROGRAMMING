class Employee{
    void work(){
        System.out.println("employee is working");
    }
}
class Manager extends Employee{
    void attendMeeting(){
        System.out.println("manager is attending a meeting");
    }
}
public class SingleLevel {
    public static void main(String[]args){
        Manager m= new Manager();
        m.work();
        m.attendMeeting();
    }
}
