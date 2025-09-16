package Ejerrepaso.ejer3;

public record Bookf(String isbn, String title, String author, int pages)implements Comparable<Bookf>{

    @Override
    public int compareTo(Bookf o) {
        return this.title.compareTo(o.title);

    }

}
