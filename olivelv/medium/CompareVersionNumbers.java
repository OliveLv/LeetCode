package olivelv.medium;

public class CompareVersionNumbers {
	public int compareVersion(String version1, String version2) {
	    
	      if(version1.equals(version2))return 0;
	      String []ver1=version1.split("\\.");
	      String []ver2=version2.split("\\.");
	      int i;
	      for(i=0;i<ver1.length&&i<ver2.length;i++){
	    	  int x=Integer.parseInt(ver1[i]);
	    	  int y=Integer.parseInt(ver2[i]);
	    	  if(x>y)return 1;
	    	  if(x<y)return -1;
	      }
	      for(int j=i;j<ver1.length;j++){
	    	  int x=Integer.parseInt(ver1[j]);
	    	  if(x!=0)return 1;
	      }
	      for(int j=i;j<ver2.length;j++){
	    	  int x=Integer.parseInt(ver2[j]);
	    	  if(x!=0)return -1;
	      }
	      return 0;
	     
	    }
	public static void main(String []args){
		CompareVersionNumbers test =new CompareVersionNumbers();
		System.out.println(test.compareVersion("01", "1.0"));
	}
}
