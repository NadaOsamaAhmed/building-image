import java.util.Scanner;

public class Test {

    @SuppressWarnings({ "ConvertToTryWithResources", "resource" })
    public static void main(String[] args){
        System.out.println("Hello, Welcome to my simple program with java");
        System.out.println("This is simple calculator , you should choose the operation you want then, you will enter 2 numbers and get the result:"); 
        Scanner input = new Scanner(System.in);
        System.out.println("1 -> Sum , 2 -> Subtraction , 3 -> Multiplication , 4 -> Division");
        int opNumber = input.nextInt();
        System.out.println("Enter the first number :");
        int num1 = input.nextInt();
        System.out.println("Enter the second number :");
        int num2 = input.nextInt();

            switch (opNumber) {
            case 1 ->                 {
                    int num3 = num1 + num2;
                    System.out.println("The sum of these 2 numbers is : " + num3 );
                }
            case 2 ->                 {
                    int num3 = num1 - num2;
                    System.out.println("The subtraction of these 2 numbers is : " + num3 );
                }
            case 3 ->                 {
                    int num3 = num1 * num2;
                    System.out.println("The multiplication of these 2 numbers is : " + num3 );
                }
            case 4 -> {
                try{
                    if(num2 != 0){
                        int num3 = num1 / num2;
                        System.out.println("The multiplication of these 2 numbers is : " + num3 );
                    }
                    else{
                        throw new Exception ("Division by 0 is not allowed!");
                    }
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }
            default -> System.out.println("This operation is not available");
        }
        input.close();
    }
    
}