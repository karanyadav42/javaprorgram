
class Dog {

    String name;
    String color;

    Dog(String a, String b) {
        name = a;
        color = b;

    }

    public static void main(String[] args) {
        Dog d = new Dog("joy", "white");
        System.out.println(d.name + " " + d.color);
    }
}
