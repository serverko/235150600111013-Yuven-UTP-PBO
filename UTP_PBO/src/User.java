package src;
public class User {
    private String email;
    private String password;
    private String fullName;
    private double balance;
    private Ticket[] ticketLists;
    private int MAX_TICKET;

    public User(String email, String password, String fullName, double balance) {
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.balance = balance;
    }

    public boolean addTicket() {
        // return addTicket();
    }

    public void displayAllTickets() {
    }

    public boolean isMatch(String email, String password ) {
        if ((email().equals(email) && password().equals(password))) {
            return true;
    }



    
    // Tabungan(saldo:int)
    // public Tabungan(int saldo) {
    //     this.saldo = saldo;
    // }

    // public int getSaldo() {
    //   return saldo;
    // }