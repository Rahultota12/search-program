public class Binearysearch{
    public static void main(String[] args) {
        int a[]={2,4,5,6,7,8,11,66,77,88,99};
        int sear=66;
        int li=0;
        int hi=a.length-1;
        int mi=(li+hi)/2;
        while(li<=hi){
            if(a[mi]==sear){
                System.out.print("Element search "+sear+" is "+mi+" index position");
                break;
            }
            else if(a[mi]<sear){
               li=mi+1;
            }else{
                hi=mi-1;
            }
            mi=(li+hi)/2;
        }
        if(li>hi){
            System.out.println("Element no found");
        }
    }
}