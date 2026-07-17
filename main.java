import java.util.Scanner;

// public class main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number : ");
//         int num = sc.nextInt();
//         System.out.println("The number is : "+num);
//         sc.close();

//     }
// }

// import java.util.Scanner;

// public class main {

//      public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the age ");
//        int age = sc.nextInt();
//        System.out.println("name ");
//        sc.nextLine();
//        String name = sc.nextLine();
//        System.out.println("name is  "+ name + " and  age is " +age );
//        sc.close();

     
//      }
// }



// import java.util.Scanner;

// public class main {

//      public static void main(String[] args){
//       Scanner sc = new Scanner(System.in);
//       System.out.print("n1");
//       int n1 = sc.nextInt();
//       System.out.print("n2");
//       int n2 = sc.nextInt();

//       int sum = n1+n2;
//       System.out.println(sum);

//     sc.close(); 
//      }
// }



public class main {

     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("n1");
        int n1 = sc.nextInt();
        System.out.print("n2");
        int n2 = sc.nextInt();
        System.out.println("Befor swap : " +n1 +" "+ n2);
        
        
        int temp;

        temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("After swap : " +n1 +" "+n2);

       
        
     }
}