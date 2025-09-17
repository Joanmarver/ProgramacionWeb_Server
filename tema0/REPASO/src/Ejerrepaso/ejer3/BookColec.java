package Ejerrepaso.ejer3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookColec{
    // ¿Qué tipo de colección es la más adecuada para almacenar los libros?
    // ArrayList
    // Crea los métodos solicitados en el enunciado del ejercicio

    public static int fLibros500pags(ArrayList<Bookf> books){
        List<Bookf> cant= books.stream()
                .filter(l -> l.pages()>500)
                .toList();
        return cant.size();

    }
    public static int fLibros300pags (ArrayList<Bookf> books){
        List<Bookf> cant= books.stream()
                .filter(l -> l.pages()<300)
                .toList();
        return cant.size();
    }
    public static void ftituloLibros500pags(ArrayList<Bookf> books){
        List<Bookf> cant= books.stream()
                .filter(l -> l.pages()>500)
                .toList();
        for (Bookf book: cant){
            System.out.println(book.title());
        }
    }
    public static void ftitulosmayornumpaginas(ArrayList<Bookf> books){
        books.sort(Comparator.comparing(Bookf::pages).reversed());
        for(int i = 0; i<3; i++){
            System.out.println(books.get(i));
        }
    }
    public static int fsumatotalpags(ArrayList<Bookf> books){
       int pagtotal = books.stream()
               .mapToInt(Bookf::pages)
               .sum();
       return pagtotal;
    }
    public static void flibrosmayorpromediopags(ArrayList <Bookf> books){
        double average =  books.stream()
                .mapToInt(Bookf::pages)
                .average().getAsDouble();
        List<Bookf> libros = books.stream()
                .filter(l-> l.pages()>average)
                .toList();
        libros.stream()
                .map(Bookf::title)
                .forEach(System.out::println);

    }

    public static void fAutores (ArrayList <Bookf> books){
        List <String> libros = books.stream()
                .map(Bookf::author)
                .distinct()
                .toList();
        libros.stream()
                .forEach(System.out::println);

    }
    public static void fAutoresConMasDe1libro(ArrayList <Bookf> books){
        Map<String , Long> conteo = books.stream()
                .collect(Collectors.groupingBy(Bookf::author, Collectors.counting()));
        conteo.entrySet().stream()
                .filter(entry -> entry.getValue()>1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
    public static void fLibroMayorPaginas(ArrayList <Bookf> books){
        books.sort(Comparator.comparing(Bookf::pages).reversed());
        System.out.println(books.get(0).title());
    }
    public static void fColeccionDeLibors(ArrayList <Bookf> books){
        List<String>titulos = books.stream()
                .map(Bookf::title)
                .toList();
        for (String titulo: titulos){
            System.out.println(titulo);
        }
    }



}
