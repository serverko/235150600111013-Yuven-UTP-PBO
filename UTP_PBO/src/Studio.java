package src;
public class Studio {
    private Movie movie;
    private String type;
    private boolean[][] seats;

    public Studio(String type) {
        this.type = type;
        setSeats();
    }

    public String getStudioInfo() {
        return "Studio Type : " + type + "Movie : " + movie.getTitle();
    }

    public int isbooked(char row, int col) {
        if (seats[row - 'A'][col]) {
            return 0; 
        } else {
            return 1; 
        }
    }

    public boolean reserve(char row, int col) {
        if (isbooked(row, col) == 0) {
            seats[row - 'A'][col] = false; 
            return true; 
        } else {
            return false;
        }
    }


    public String getType() {
        return type;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    private void setSeats() {
    }
}