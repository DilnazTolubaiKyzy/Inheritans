public class Main {
    public static void main(String[] args) {
     Programmer programmer = new Programmer("Эсен","Soft Skills","Moscow 4");
     Dancer dancer = new Dancer("Michael Jackson","Sofia Boutella","Michael Jackson");
     Singer singer = new Singer("Lisa","Money","BlackPink");
        System.out.println(programmer);
     programmer.eat();
     programmer.learn();
     programmer.walk();
     programmer.coding();
        System.out.println(dancer);
        dancer.eat();
        dancer.learn();
        dancer.walk();
        dancer.dancing();
        System.out.println(singer);
        singer.eat();
        singer.learn();
        singer.walk();
        singer.singing();
        singer.playGuitar();



    }
}