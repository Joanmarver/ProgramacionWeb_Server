package Ejerrepaso.ejer3;

import Ejerrepaso.ejer1_2.Book;
import Ejerrepaso.ejer1_2.BookCollection;

import java.util.ArrayList;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        ArrayList<Bookf> librosF = new ArrayList<Bookf>();
      librosF.add(new Bookf("9788422616337", "El Señor de los Anillos", "J.R.R. Tolkien", 800));
        librosF.add(new Bookf("9788445077528", "El Hobbit", "J.R.R. Tolkien", 350));
        librosF.add(new Bookf("9788466316781", "Cabo Trafalgar", "Arturo Pérez Reverte", 320));
        librosF.add(new Bookf("9788493975074", "El corazón de la piedra", "José María García López", 560));
        librosF.add(new Bookf("9788493291488", "Salmos de vísperas", "Esteban Hernández Castelló", 95));
        librosF.add(new Bookf("9788420685625", "La música en las catedrales españolas del Siglo de Oro", "Robert Stevenson", 600));
        librosF.add(new Bookf("9788423913077", "Luces de bohemia", "Ramón del Valle-Inclán", 296));
        librosF.add(new Bookf("9788448031121", "Contando atardeceres", "La vecina rubia", 528));
        librosF.add(new Bookf("9781529342079", "The Master: The Brilliant Career of Roger Federer", "Christopher Clarey", 456));
        librosF.add(new Bookf("9788408264385", "La teoría de los archipiélagos", "Alice Kellen", 300));
        librosF.add(new Bookf("9788423362479", "Esperando al diluvio", "Dolores Redondo", 576));
        librosF.add(new Bookf("9788466367349", "El italiano", "Arturo Pérez Reverte", 400));
        librosF.add(new Bookf("9788466359290", "Línea de fuego", "Arturo Pérez Reverte", 688));
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Libros con +500 paginas\n" +
                "2. Libros con -300 paginas\n" +
                "3. Lista con libros +500 paginas\n" +
                "4. los 3 primeros titulos con mayor numero de paginas\n" +
                "5. Suma total de paginas de los libros\n" +
                "6. Libros que superen el numero promedio de paginas\n" +
                "7. Autores de libros sin repetir\n" +
                "8. Autores con mas de un libro\n" +
                "9. Libro con mayor numero de paginas\n" +
                "10. Coleccion de todos los titulos\n" +
                "11. Ordenar Alfabeticamente");
        int respuesta = scanner.nextInt();

        switch (respuesta) {
            case 1:{
                int numpaginas = BookColec.fLibros500pags(librosF);
                System.out.println(numpaginas);
                break;
            }
            case 2:{
                int numpaginas= BookColec.fLibros300pags(librosF);
                System.out.println(numpaginas);
                break;
            }
            case 3:{
                BookColec.ftituloLibros500pags(librosF);
                break;
            }
            case 4:{
                BookColec.ftitulosmayornumpaginas(librosF);
                break;
            }
            case 5:{
                int totalpags= BookColec.fsumatotalpags(librosF);
                System.out.println(totalpags);
                break;
            }
            case 6:{
                BookColec.flibrosmayorpromediopags(librosF);
                break;
            }
            case 7:{
                BookColec.fAutores(librosF);
                break;
            }
            case 8:{
                BookColec.fAutoresConMasDe1libro(librosF);
                break;
            }
            case 9:{
                BookColec.fLibroMayorPaginas(librosF);
                break;
            }
            case 10:{
                BookColec.fColeccionDeLibors(librosF);
                break;

            }
            default:
                System.out.println("error");
        }


    }
}