import java.util.Scanner;

public class Titanic{
  public static void main(String[] args) {
    String gender = "";
    int age = 0;
    int pclass = 0;
    boolean a_check;
    Boolean g_checker;
    Boolean c_check;
    double survival_pct = 0;

    Scanner scan = new Scanner(System.in);
    do{
    System.out.println("What is your gender?(F or M)");
    if(scan.hasNext("[FM]")){
      gender = scan.nextLine();
      g_checker = true;
    }
    else{
      System.out.println("Not a valid input!");
      scan.next();
      g_checker = false;
    }
  }while(g_checker == false);
  //age
  do{
  System.out.println("What is your age?");
  if(scan.hasNextInt()){
    age = scan.nextInt();
    a_check = true;
  }
  else{
    System.out.println("Not a valid input!");
    scan.next();
    a_check = false;
  }
}while(a_check == false);
//class
do{
System.out.println("What is your class?(1,2,3)");
if(scan.hasNext("[123]")){
  pclass = scan.nextInt();
  c_check = true;
}
else{
  System.out.println("Not a valid input!");
  scan.next();
  c_check = false;
}
}while(c_check == false);
if(age < 14){
  if(pclass == 1){
    survival_pct = 0.86;
  }
  if(pclass == 2){
    survival_pct = 1;
  }
  if(pclass == 3){
    survival_pct = 0.31;
  }
}
if(age > 14){
  if(gender.equals("F")){
    if(pclass == 1){
      survival_pct = 0.97;
    }
    if(pclass == 2){
      survival_pct = 0.86;
    }
    if(pclass == 3){
      survival_pct = 0.49;
    }
  }
  if(gender.equals("M")){
    if(pclass == 1){
      survival_pct = 0.33;
    }
    if(pclass == 2){
      survival_pct = 0.08;
    }
    if(pclass == 3){
      survival_pct = 0.13;
    }
  }
}

System.out.println("your survival percentage is " + (survival_pct * 100) + "%");
if(survival_pct >= Math.random()){
  System.out.println("You survive!");
}
else{
  System.out.println("Im sorry, You died");

  }
}
}
