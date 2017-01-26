import java.io.*;

class project3ioBonus{
    public static void main(String[]args){
        System.out.println("Hi Guys! :)");
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader j = new BufferedReader(r);
        System.out.println("Enter desired height of triangle:");
        double height =0.0;
        try{
            height=Integer.valueOf(j.readLine());
        }
        catch(Exception p){
            System.out.println("Invalid Number!");

        }
        for(int a=1; a<=height; a++){
            for( int k=1; k<height -(a-1); k++){
                System.out.print(" ");
            }
            for( int l=1; l<=a; l++){
                System.out.print("*");
                for( int j1=1; j1<l; j1+=l){
                System.out.print("*");
                }
            }
            System.out.println("");
        }
        
    }
}