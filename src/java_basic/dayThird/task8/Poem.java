package java_basic.dayThird.task8;

public class Poem {
    private Author author;
    private int stropheNumbers;

    public Poem(Author author, int stropheNumbers) {
        this.author = author;
        this.stropheNumbers = stropheNumbers;
    }
 public void print(){
     System.out.println(this);
 }

    @Override
    public String toString() {
        return "Poem{" +
                "author=" + author +
                ", stropheNumbers=" + stropheNumbers +
                '}';
    }
}
