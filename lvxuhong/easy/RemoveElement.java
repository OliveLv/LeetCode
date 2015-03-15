package lvxuhong.easy;

public class RemoveElement {
	 public int removeElement(int[] A, int elem) {
	      int n=A.length,num=0;
	      int []B=new int[n];
	      for(int i=0;i<n;i++){
	    	  if(A[i]!=elem)B[num++]=A[i];
	      }
	      for(int i=0;i<num;i++)A[i]=B[i];
	      return num;
	    }
}
