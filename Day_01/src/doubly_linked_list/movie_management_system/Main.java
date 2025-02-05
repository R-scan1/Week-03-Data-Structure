package doubly_linked_list.movie_management_system;

public class Main {
    public static void main(String[] args) {
        MovieManagementSystem movieManagementSystem = new MovieManagementSystem();

        movieManagementSystem.addMovieAtEnd("Joker", "Manish Patel", 2014, 8.8);
        movieManagementSystem.addMovieAtBeginning("King", "Arpita Gautam", 2012, 8.3);
        movieManagementSystem.addMovieAtEnd("Queen", "Jack Dorsi", 2018, 9.0);
        movieManagementSystem.addMovieAtPosition("Jam", "Raj S Can", 2020, 9.6, 2);

        movieManagementSystem.displayMoviesForward();
        System.out.println();
        movieManagementSystem.displayMoviesReverse();

        movieManagementSystem.searchMovie("Raj", null);
        movieManagementSystem.searchMovie(null, 9.6);

        movieManagementSystem.updateMovieRating("King", 8.3);

        movieManagementSystem.removeMovieByTitle("Queen");

        movieManagementSystem.displayMoviesForward();
    }
}
