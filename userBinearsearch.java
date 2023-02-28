import java.util.*;
public class userBinearsearch {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your Array size : ");
        int size=sc.nextInt();
        int []a=new int[size];
        System.out.println("enter the array of element");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        System.out.print("Enter your Search Element : ");
        int Search=sc.nextInt();

        int li=0;
        int hi=a.length-1;
        int mi=(li+hi)/2;

        while(li<=hi){
               if(a[mi]==Search){
                System.out.print("Element search " +Search+ " is " +mi+ " index position");
                break;
               }
               else if( a[mi]<Search){
                  li=mi+1;
               }
               else{
                    hi=mi-1;
               }
               mi=(li+hi)/2;
        }
        if(li>hi){
           System.out.print("element not found");
        }
    }
}
