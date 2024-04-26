package src;

import java.util.Scanner;

public class App {
    public class User {
        private String email;
        private String password;
        private String fullName;
        private double balance;
        private Ticket[] ticketlists;
        private int MAX_TICKET;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("------------------------");
        System.out.println("UTP A Cinema");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");
        System.out.println("Pick your choice : ");
        
        // String email, password;
        public Login(String email, String password);
        this.email = email;
        this.password = password;

    static String email(){
   System.out.print("Email : ");
   email = in.nextLine();
   return email;
}
 
static String password(){
  System.out.print("Password : ");
  password = in.nextLine();
  return password;
}
String nama, email, password, ulangi_pass;
boolean register = true;

while (register) {
    System.out.println("Fullname : ");
    nama = in.nextLine();

    System.out.println("Email : ");
    email = in.nextLine();

    System.out.println("Password : ");
    password = in.nextLine();

    System.out.println("Ulangi password : ");
    ulangi_pass = in.nextLine();
}
if (ulangi_pass.equals(password)) {
    register = false;
    System.out.println("Registrasi Berhasil");
} else {
    System.out.println("Password yang dimasukkan salah!");
}
    for(int i = 3;i >= 1;i--) {
        if (email().equals(username) && password().equals(password)) {
            System.out.println("Login success");
            break;
        } else if (i == 1) {
            break;
        }
    }
        }
    }
}