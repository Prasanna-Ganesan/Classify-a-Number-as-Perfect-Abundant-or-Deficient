IN JAVA ,
public class Solution{
  public static void main(String[]args){
    int i,sum=0,n;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();//get input
    for(i=1;i<n;i++){
      if(n%i==0){
        sum=sum+i;
      }
    }
  if(sum==n){
    System.out.println("Perfect Number");
  }
  else if(sum>n){
    System.out.println("Abundant Number");
  }
  else{
    System.out.println("Deficient Number");
  }
}
}
