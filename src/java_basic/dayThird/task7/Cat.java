package java_basic.dayThird.task7;

import java.util.Objects;

public class Cat{
    private final String catsName;

    public Cat(String name) {
        this.catsName = name;
    }

    public String getCatsName() {

        return catsName;
    }
    public void makeSound(){
        System.out.println("Miauuuuuuuuu");
    }
    public void eateMice( int mice ){
        System.out.println("I eate "+mice +" mice");
    }

    public void print(){
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "Cat :" + catsName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat cat)) return false;
        return Objects.equals(catsName, cat.catsName);
    }



}
