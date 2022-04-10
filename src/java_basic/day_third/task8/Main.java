package java_basic.day_third.task8;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Kaczmarski","Polska");
        Author author1 = new Author("Puszkin","Rosja");
        Author author2 = new Author("Sheakspeare","Anglia");
        Poem [] poem = new Poem[3];
        poem[0]=new Poem(author,303);
        poem[1]=new Poem(author,78);
        poem[2]=new Poem(author,256);
        for (Poem poems: poem) {


        }

    }

}
