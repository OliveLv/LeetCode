package lvxuhong.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	 public List<List<Integer>> generate(int numRows) {
		 
	        List<List<Integer>>pascal=new ArrayList< List<Integer>>();
	        if(numRows==0)return pascal;
	        List<Integer>row=new ArrayList<Integer>();
	        row.add(1);
	        pascal.add(row);
	        for(int i=2;i<=numRows;i++){
	        	List<Integer>row1=new ArrayList<Integer>();
	        	row1.add(1);
	        	for(int j=1;j<i-1;j++){
	        		row1.add(row.get(j-1)+row.get(j));
	        	}
	        	row1.add(1);
	        	pascal.add(row1);
	        	row=row1;
	        }
	        for(int i=0;i<numRows;i++){
	        	row=pascal.get(i);
	        	for(Integer ele:row){
	        		System.out.print(ele+" ");
	        	}
	        	System.out.println();
	        }
	        return pascal;
	    }
	 public static void main(String []args){
		 PascalTriangle test=new PascalTriangle();
		 test.generate(5);
		/* test.generate(1);
		 test.generate(2);
		 test.generate(3);*/
	 }
}
