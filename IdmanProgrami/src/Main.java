public class Main {
    public static void main (String [] args){
        Workout workout = new Workout();
        
        Account account = new Account("Goktug Ibolar", "123123",88,1.78);
        
        workout.work(account);
        System.out.println("Leaving...");
                
        
    }
    
}
