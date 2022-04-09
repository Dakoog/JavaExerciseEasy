package JavaBasic.dayThird.task7;

public class Main {
    public static void main(String[] args) {

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Blue");
        cats[1] = new Cat("Pysia");
        cats[2] = new Cat("Gardfield");
        int i = 5;
        for (Cat cat : cats ){
            cat.print();
            cat.eateMice(i++ * i);
            cat.makeSound();
        }


    }
}

