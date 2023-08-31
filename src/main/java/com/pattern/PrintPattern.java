package com.pattern;

public class PrintPattern {


    //write method print star
    public static void printStar(int number){
        StringBuilder s = new StringBuilder();
        if (number <= 0 ){
            System.out.println("invalid parameter");
        }else {
            for (int i =1 ; i  <= number ; i++) {
                System.out.println( s.append("*"));
            }
            for (int i = number ; i  <=  number ; i--){
                if(i == 1){
                    break;
                }
                System.out.println( s.delete( i-1 , i ));
            }
        }
    }

}
