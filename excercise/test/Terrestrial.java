public class Terrestrial extends Human {
    private int age;
    public Terrestrial(String name, int age){
        super(name);
        this.age = age;
    }

    public static void main(String[] args) {
        Terrestrial jdObject = new Terrestrial("John Doe",42);
        System.out.println(jdObject.name+jdObject.age);
    }
}