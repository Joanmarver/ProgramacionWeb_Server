package Ejerrepaso.ejer1_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BookCollection {
    // ¿Qué tipo de colección es la más adecuada para almacenar los libros?
    // ArrayList
    // Crea los métodos solicitados en el enunciado del ejercicio
    public static int quinientaspaginas(ArrayList<Book> books) {
        int cant = 0;
        for (Book book : books) {
            if (book.pages() > 500) {
                cant++;
            }
        }
        return cant;
    }

    public static int trescientospaginas(ArrayList<Book> books) {
        int cant = 0;
        for (Book book : books) {
            if (book.pages() < 300) {
                cant++;
            }
        }
        return cant;
    }

    public static void titulosquinientaspaginas(ArrayList<Book> books) {
        for (Book book : books) {
            if (book.pages() > 500) {
                System.out.printf(book.title());
                System.out.println("\n");
            }
        }
    }

    public static void titulosconmaspaginas(ArrayList<Book> books) {
        books.sort(Comparator.comparing(Book::pages).reversed());
        System.out.println(books.get(0) + "\n");
        System.out.println(books.get(1) + "\n");
        System.out.println(books.get(2));
    }

    public static int numTotalPaginas(ArrayList<Book> books) {
        int pagtotales = 0;
        for (Book book : books) {
            pagtotales += book.pages();
        }
        return pagtotales;
    }

    public static void librosmediapaginas(ArrayList<Book> books) {
        int pagtotales = 0;
        int media = 0;
        for (Book book : books) {
            pagtotales += book.pages();
        }
        media = pagtotales / books.size();
        for (Book book : books) {
            if (book.pages() > media) {
                System.out.println(book.title()+ "\n");
            }
        }
    }

    public static void autores(ArrayList<Book> books) {
        ArrayList<String> autores = new ArrayList<>();

        for (Book book : books) {
            Boolean autorlista= false;
            String autor = book.author();
            for (int i = 0; i < autores.size(); i++) {
                if (autor.equals(autores.get(i))) {
                    autorlista = true;
                }
            }
            if (autorlista == false) {
                autores.add(book.author());
            }
        }
        for (int i = 0; i < autores.size(); i++) {
            System.out.println(autores.get(i));
        }
    }

    public static void autoreslibros(ArrayList<Book> books) {
        ArrayList<String> autores = new ArrayList<>();

        for (Book book : books) {
            String autor = book.author();
            int cont = 0;

            for (Book book2 : books) {
                if (book2.author().equals(autor)) {
                    cont++;
                }
            }

            if (cont > 1 && !autores.contains(autor)) {
                autores.add(autor);
            }
        }

        for (int i = 0; i < autores.size(); i++) {
            System.out.println(autores.get(i));
        }
    }

    public static String libromayornumpaginas(ArrayList<Book> books) {
        int numpaginas=0;
        String titulo="";
        for (Book book : books) {
            if (book.pages() > numpaginas) {
                titulo=book.title();
                numpaginas=book.pages();
            }
        }
        return titulo;
    }
    public static ArrayList<String> colecciontitulos(ArrayList<Book> books) {
        ArrayList<String> colecciontitulos=new ArrayList<>();
        for (Book book : books) {
            String titulo=book.title();
            if (!colecciontitulos.contains(titulo)) {
                colecciontitulos.add(book.title());
            }

        }
        return colecciontitulos;
    }
    public static ArrayList<Book> ordenarAlfabeticamente(ArrayList<Book> books){
        Collections.sort(books);
        return books;
    }


}
