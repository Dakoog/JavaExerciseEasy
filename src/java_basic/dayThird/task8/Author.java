package java_basic.dayThird.task8;

public class Author {
    private final String surname;
    private String nationality;

    public Author(String surname, String nationality) {
        this.surname = surname;
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Author: " +
                " " + surname +
                " narodowość " + nationality;
    }
    public void print(){
        System.out.println(this);
    }
}
