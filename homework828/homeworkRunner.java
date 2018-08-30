
/**
 * Write a description of class homeworkRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class homeworkRunner
{
    public static void assignment1(){
        for(int x = 0; x < 5; x++){
            for(int a = 0; a <= x ; a++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void assignment2(){
        for(int x = 0; x < 8; x++){
            if(x<4){
                for(int a = 0; a<4-x;a++){
                    System.out.print(" ");
                }
                for(int b = 0; b < x; b++){
                   System.out.print("*");
                }
                for(int c = 0; c< x-1; c++){
                    System.out.print("*");
                }
            }else if(x==4){
                for(int a = 0; a <= 6; a++){
                    System.out.print("*");
                }
            }else if(x>4){
                for(int a = 0; a<4-(8-x);a++){
                    System.out.print(" ");
                }
                for(int b = 0; b < 8-x; b++){
                   System.out.print("*");
                }
                for(int c = 0; c< 8-x-1; c++){
                    System.out.print("*");
                }
            }
           System.out.println();
        }
    }
    public static void assignment3(){
        for(int x = 0; x <100; x++){
            if(x%2 == 0){
                System.out.println("i:" + x + " even");
            }else{
                System.out.println("i:" + x + " odd");
            }
        }
    }
    public static void assignment4(){
        int total = 0;
        for(int i = 0; i <= 254; i++){
            if(i%2==0){
                total +=i;
            }
        }
        System.out.println(total);
    }
}
