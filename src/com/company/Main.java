package com.company;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line;

        System.out.print("Enter some stuff : ");

        line = sc.nextLine();

        try{

            Integer.parseInt(line);

            System.out.println("You entered an Integer");

        }catch(Exception e){

            try{

                Double.parseDouble(line);

                System.out.println("You entered a Double");

            }catch(Exception e1){

                System.out.println("You entered a String");

            }

        }

        sc.close();

    }

}
    }
}
