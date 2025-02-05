package doubly_linked_list.movie_management_system;

public class MovieManagementSystem {
    private MovieNode head;
    private MovieNode tail;

    public void addMovieAtBeginning(String title, String director, int year, double rating) {
        MovieNode newMovie = new MovieNode(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }

    public void addMovieAtEnd(String title, String director, int year, double rating) {
        MovieNode newMovie = new MovieNode(title, director, year, rating);
        if (tail == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }

    public void addMovieAtPosition(String title, String director, int year, double rating, int position) {
        if (position <= 0) {
            addMovieAtBeginning(title, director, year, rating);
            return;
        }

        MovieNode newMovie = new MovieNode(title, director, year, rating);
        MovieNode temp = head;
        int currentPosition = 0;

        while (temp != null && currentPosition < position - 1) {
            temp = temp.next;
            currentPosition++;
        }

        if (temp == null) {
            addMovieAtEnd(title, director, year, rating);
        } else {
            newMovie.next = temp.next;
            newMovie.prev = temp;

            if (temp.next != null) {
                temp.next.prev = newMovie;
            } else {
                tail = newMovie; // Update tail if added at the end
            }
            temp.next = newMovie;
        }
    }

    public void removeMovieByTitle(String title) {
        MovieNode temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                if (temp == head) {
                    head = temp.next;
                    if (head != null) {
                        head.prev = null;
                    }
                } else if (temp == tail) {
                    tail = temp.prev;
                    if (tail != null) {
                        tail.next = null;
                    }
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                System.out.println("Movie \"" + title + "\" removed successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie \"" + title + "\" not found!");
    }

    public void searchMovie(String director, Double rating) {
        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {
            if ((director != null && temp.director.equalsIgnoreCase(director)) ||
                    (rating != null && temp.rating == rating)) {
                System.out.println("Found: Title=" + temp.title + ", Director=" + temp.director +
                        ", Year=" + temp.year + ", Rating=" + temp.rating);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movie found for the given search criteria.");
        }
    }

    public void displayMoviesForward() {
        MovieNode temp = head;
        System.out.println("Movies in forward order:");
        while (temp != null) {
            System.out.println("Title: " + temp.title + ", Director: " + temp.director +
                    ", Year: " + temp.year + ", Rating: " + temp.rating);
            temp = temp.next;
        }
    }

    public void displayMoviesReverse() {
        MovieNode temp = tail;
        System.out.println("Movies in reverse order:");
        while (temp != null) {
            System.out.println("Title: " + temp.title + ", Director: " + temp.director +
                    ", Year: " + temp.year + ", Rating: " + temp.rating);
            temp = temp.prev;
        }
    }

    public void updateMovieRating(String title, double newRating) {
        MovieNode temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated for movie \"" + title + "\" to " + newRating);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie \"" + title + "\" not found!");
    }
}
