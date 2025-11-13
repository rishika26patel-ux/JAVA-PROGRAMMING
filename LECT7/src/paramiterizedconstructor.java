public class paramiterizedconstructor {
    class car {
        car(String str) {
            System.out.println(str);
        }
    }

    class main {
        public static void main(String[] args) {
            car obj = new car("hello");
            obj = new car("hii");
        }
    }
}


