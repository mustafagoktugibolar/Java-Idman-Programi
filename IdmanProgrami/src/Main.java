public class Main {
    public static void main (String [] args){
        Idman idman = new Idman();
        
        Account account = new Account("Goktug Ibolar", "123123",88,1.78);
        
        idman.work(account);
        System.out.println("Leaving...");
                
        
    }
    
}
