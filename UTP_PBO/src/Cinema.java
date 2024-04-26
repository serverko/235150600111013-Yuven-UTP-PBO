package src;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Cinema {
    private String name;
    private User[] listUsers;
    private Studio[] listStudio;
    private int studioCapacity;

    public Cinema(String name, int studioCapacity) {
        this.name = name;
        this.studioCapacity = studioCapacity;
        init();
    }

    private void init() {
        listUsers = new User[100]; 
        listStudio = new Studio[5]; 
    }

    public boolean registerUser(User user) {
        return false;
    }

    public User authenticateUser(String email, String password) {
        return null;
    }

    public void displayListStudio() { 
    }

    public void displayStudioDetail(int studioNumber) {   
    }

    public boolean addStudioWithMovies(String studioType, String movieTitle, double movieRating, String[] movieGenres) {
        return false;
    }

    public boolean bookTicket(User user, int studioNumber, char row, int col) {
        return false;
    }

    public String getName() {
        return name;
    }
}