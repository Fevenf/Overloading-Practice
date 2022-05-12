import java.util.Scanner;
import java.util.ArrayList;

public class Animalmain {

    public static void main(String[] args) throws Exception {
        ArrayList<Animal> animals = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop ");
    
        while (true) {
        System.out.print("Please Enter a name: " );
         String dogName = scanner.nextLine();
         if(dogName.equalsIgnoreCase(""))
         break;
            
            System.out.println("Is it a dog? Yes or no: ");
            boolean dog;
        while(true){
            String theDog = scanner.nextLine();
            if(!theDog.equals ("yes") && !theDog.equals("no")){
                System.out.println("Please enter yes or no");
            } else {
                if(theDog.equals("yes")) {
                    dog = true;
                } else {
                    dog = false;
                }
                break;
        }
            }
        
            animals.add(new Animal(dogName, dog));
    }
            for (Animal animal: animals) {
                System.out.println(animal);
            }
     
        }
         
    }






