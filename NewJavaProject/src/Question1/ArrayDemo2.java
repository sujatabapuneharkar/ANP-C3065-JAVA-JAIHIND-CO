package Question1;
import java.util.Arrays;
public class ArrayDemo2 {
public void manipulateIntegerArray()
{
	Integer arr[]= {10,20,30,40,50};
	Integer arr1[]= new Integer[5];
	
	System.out.println("Old Array:"+Arrays.toString(arr));
	for(int i=0,j=0;i<arr.length;i++,j++)
	{
		arr1[j]=arr[i]+5;
	}
	
	System.out.println("New Array:"+Arrays.toString(arr1));
	
}
public static void main(String []args) {
	//TODO Auto-generated method stub
ArrayDemo2 A1=new ArrayDemo2();
A1.manipulateIntegerArray();
}
}

	
