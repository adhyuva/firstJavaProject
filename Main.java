public class Main{
    public static void main(String[] args) {
        Person yuvaraj = new Person("Yuvaraj Mahendran", "Head of House", "Human", 47);
        Person vidya = new Person("Vidya Vidyasagarajan", "Wife (Queen)", "Human", 42);
        Person adhithya = new Person("Adhithya Yuvaraj", "First born", "Human", 15);
        Person arjun = new Person("Arjun Yuvaraj", "Baby brother", "Human", 13);
        Person richard = new Person("Richard", "Doggy", "Dog", 2);

        yuvaraj.info();
        vidya.info();
        adhithya.info();
        arjun.info();
        richard.info();
    }
}
