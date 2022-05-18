
import java.util.Scanner;

public class Idman {
    public void work(Account account){
        Login login = new Login();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("WELCOME");
        System.out.println("**********************");
        System.out.println("LOGIN");
        System.out.println("**********************");
        
        int entry_right = 3;
        
        while(true){
            if(login.login(account)){
                System.out.println("Login succesful");
                break;
                
            }
            else {
                System.out.println("Login failed");
                entry_right -= 1;
                System.out.println("Remaining entry : " + entry_right);
            }
            if (entry_right == 0 ){
                System.out.println("Your access right has expired");
                return;
                
            }
        }
        System.out.println("**********************");
        String process = "1. Preparing a program\n"
                + "2. Implementing the program\n"
                + "3. Show body mass index\n"
                + "q. Quit ";
        System.out.println("**********************");
        int burpee = 0;
        int pushup = 0;
        int pullup = 0;
        int squat = 0;
        
        
        
        while(true){
            
            System.out.println("Choose Process : ");
            System.out.println(process);
            String choosed = sc.nextLine();
            
            if (choosed.equals("q")){
                
                break;
                
            }
            else if (choosed.equals("1")){
                System.out.println("Entre the number you want to add :\n"
                        + "1 : burpee\n"
                        + "2 : push-up\n"
                        + "3 : pull-up\n"
                        + "4 : squat");
                
                
                System.out.print("1 :");
                int burpee_add = sc.nextInt();
                burpee += burpee_add;
                
                
                System.out.print("2 :");
                int pushup_add = sc.nextInt();
                pushup += pushup_add;
                
                
                System.out.print("3 :");
                int pullup_add = sc.nextInt(); 
                pullup += pullup_add;
                
                
                System.out.print("4 :");
                int squat_add = sc.nextInt(); 
                squat += squat_add;
                
            }
            else if(choosed.equals("2")){
                System.out.println("Entre the number you want to make :\n"
                        + "1 : burpee\n"
                        + "2 : push-up\n"
                        + "3 : pull-up\n"
                        + "4 : squat");
                System.out.print("1 :");
                int burpee_made = sc.nextInt();
                burpee -= burpee_made;
                
                
                System.out.print("2 :");
                int pushup_made = sc.nextInt();
                pushup -= pushup_made;
                
                
                System.out.print("3 :");
                int pullup_made = sc.nextInt();
                pullup -= pullup_made;
                
                
                System.out.print("4 :");
                int squat_made = sc.nextInt();
                squat -= squat_made;
                
                
                System.out.println( "1 : " + burpee + "left");
                System.out.println( "2 : " + pushup + "left");
                System.out.println( "3 : " + pullup + "left");
                System.out.println( "4 : " + squat + "left");
                
                
                
            }
            else if(choosed.equals("3")){
                /*System.out.print("Please enter your weight example(80.5):");
                double weight = sc.nextDouble();
                System.out.print("Please enter your height example(1.75) :");
                double height = sc.nextDouble();*/
        
                double bmi = account.getWeight() / (account.getHeight() * account.getHeight()) ;
        
                if(bmi < 18.5){
                    System.out.print("thin (" + bmi + ")");
                }
                else if(bmi < 25){
                    System.out.print("normal (" + bmi + ")");
                }
                else if(bmi < 30){
                    System.out.print("over weight (" + bmi + ")");            
                }
                else{
                    System.out.print("obese (" + bmi + ")");
                }
                
            }
            else{
                System.out.println("Unvalid Proccess");
                   
            }
            
        }
        
        
        
    }    
}


























































/*public static double bmi_calculation(){ 
    // bmi = body mass index
    Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your weight example(80.5):");
        double weight = scanner.nextDouble();
        System.out.print("Please enter your height example(1.75) :");
        double height = scanner.nextDouble();
        
        double bmi = weight / (height * height);
        
        if(bmi < 18.5){
            System.out.print("thin (" + bmi + ")");
        }
        else if(bmi < 25){
            System.out.print("normal (" + bmi + ")");
        }
        else if(bmi < 30){
            System.out.print("over weight (" + bmi + ")");            
        }
        else{
            System.out.print("obese (" + bmi + ")");
        }
            
    }*/