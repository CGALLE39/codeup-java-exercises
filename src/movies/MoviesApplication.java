package movies;

import java.util.Scanner;

public class MoviesApplication {
//    public static Movie[] movies = MoviesArray.findAll();

    public static void main(String[] args) {
//        MoviesArray.findAll();
        Scanner user = new Scanner(System.in);
        Movie[] movies = MoviesArray.findAll();
//        MoviesArray newMovies = new MoviesArray();
//        Movie[] in = newMovies.findAll();
        System.out.println("\n What would you like to do?");
        System.out.println("\t0. - exit");
        System.out.println("\t1. - view all movies");
        System.out.println("\t2. - view movies in animated category");
        System.out.println("\t3. - view movies in drama category");
        System.out.println("\t4. - view movies in horror category");
        System.out.println("\t5. - view movies in scifi category");

        String input = user.nextLine();
        if (input.equals("1")) {
            System.out.println(movies);
        } else if (input.equals("2")) {
            System.out.println();
        } else if (input.equals("3")) {
            System.out.println();
        } else if (input.equals("4")) {
            System.out.println();
        } else if (input.equals("5")) {
            System.out.println();

        }
    }
}
