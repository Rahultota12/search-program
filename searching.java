import java.util.*;
public class searching {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter arry size : ");
         int size=sc.nextInt();
         int a[]=new int[size];
         System.out.print("Enter the array elements : ");
         for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
         }
         System.out.print("Enter your search elements : ");
         int Search=sc.nextInt();
             
         for(int i=0;i<a.length;i++){
            if(a[i]==Search){
                System.out.print("Element your search " +Search+ " is " +i+ " index position");
                break;
            }else{
                System.out.println("element not found ");
            }
         }
    }  
}
