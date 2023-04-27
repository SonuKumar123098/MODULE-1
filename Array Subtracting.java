//https://course.acciojob.com/idle?question=95bad7cc-6eba-42c3-b682-a280d69ee63b
// Java program to sum two numbers
// represented two arrays.
import java.util.*;

public class Main {

  static int[] subtract(int[] n1, int[] n2) {
    // your code here
	  int sign=1;
	  if(n1.length<n2.length ){
		  int temp[]=n1;
		  n1=n2;
		  n2=temp;
		  sign=-1;
	  }
	  int carry=0;
	  for(int i=0;i<n2.length;i++){
		  int a=n1[n1.length-1-i]-carry;
		  int b=n2[n2.length-1-i];
		  carry=0;
		  if(a<b){
			  carry=1;
			  a+=10;
		  }
		  n1[n1.length-1-i]=a-b;
	  }
	  if(carry==1 && n1.length==n2.length){
		  for(int i=0;i<n1.length;i++){
			  n1[i]=(9-n1[i]);
		  }
		  n1[n1.length-1]+=1;
		  n1[0]*=(-1);
	  }
	  else if(carry==1 ){
	    for(int i=n1.length-n2.length-1;i>=0;i--){
			if(n1[i]!=0){
				n1[i]-=1;
				break;
			}
		}
	  }
	  n1[0]*=sign;
	  return n1;
  }

  /* Driver program to test above function */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int[] arr1 = new int[n1];
    for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

    int n2 = sc.nextInt();
    int[] arr2 = new int[n2];
    for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();
    sc.close();

    int[] res = subtract(arr1, arr2);
    for (int i : res) System.out.println(i);
  }
}
