package precedence;

public class Precedence {
    public static void main(String[] args) {

        //Defualt Precedence
        //16 x 2 = 32, + 24 = 56
        int sum = 32 - 8 + 16 * 2;
        System.out.println("Defualt order: " + sum);
        
        //Giving + and - Precedence over *
        //24 + 16 = 40, x 2 = 80
        sum = (32 - 8 + 16) * 2;
        System.out.println("Specified order: " + sum);
        
        //Giving operation precedence order in first +, then -, and then x
        //32 - 24 = 8, x 2 = 16
        sum = (32 - (8 + 16)) * 2;
        System.out.println("Nested Specific order: " + sum);
        
    }
    
}
