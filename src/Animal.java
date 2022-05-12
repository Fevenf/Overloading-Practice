public class Animal {
    private String name;
    private Boolean dogornot;

//constructor
 public Animal(String name,Boolean dogornot){
 this.name = name;
 this.dogornot = dogornot;
 }
//  public Animal(String name){
// this.name = name;
  
//     }
// public Animal(Boolean dogornot){
// this.dogornot = dogornot;
//         }

 public String getName() {
    return name;
}
public Boolean getDog() {
    return dogornot;
}

@Override
public String toString() {
    return getName() + ", is a dog = " + getDog();
}
    

}
