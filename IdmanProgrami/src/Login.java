import java.util.Scanner;

public class Login {
    public boolean login (Account account){
        Scanner sc = new Scanner(System.in);
        
        String username;
        String password;
        
        System.out.print("Username : ");
        username = sc.nextLine();
        System.out.print("Password : ");
        password = sc.nextLine();
        
        if(account.getUsername().equals(username) && account.getPassword().equals(password)){
            return true;
        }
        else{
            return false;
        }
    }
    
    
}
