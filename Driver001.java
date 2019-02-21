package Lab1;

import java.sql.SQLOutput;

public class Driver001 {
    public static void main(String[] args) {

        Model Sean = new Model("Sean","Chien",180,60,false,false);
        System.out.println("Name" + "Sean Chien");
        System.out.println("Height:" + "180" + "cm");
        System.out.println("Weight:" + "60" + "kg");
        if(Sean.isCanTravel() == true){
                System.out.println("Go travel :" + "yep");
            }
            else{
                System.out.println("do not go travel :"+ "nope");
            }

        if(Sean.isSmokes() == false){
                System.out.println("Does smoke :" + "yep");
            }
            else{
                System.out.println("Does not smoke :" + "nope");
            }
        }
    }

