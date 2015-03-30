package olivelv.medium;
/**
 * Given an integer, convert it to a roman numeral. 
 * Input is guaranteed to be within the range from 1 to 3999.
 * @author olive
 *String[] romanPieces={"","I","II","III","IV","V","VI","VII","VIII","IX", "","X","XX","XXX","XL","L","LX","LXX","LXXX","XC", "","C","CC","CCC","CD","D","DC","DCC","DCCC","CM", "","M","MM","MMM","MMMM"}; 
 *return romanPieces[num/1000+30]+romanPieces[(num/100)%10+20] +romanPieces[(num/10)%10+10]+romanPieces[num%10];
 */
public class IntegertoRoman {
public String intToRoman(int num) {
	String[] romanPieces={"","I","II","III","IV","V","VI","VII","VIII","IX", "","X","XX","XXX","XL","L","LX","LXX","LXXX","XC", "","C","CC","CCC","CD","D","DC","DCC","DCCC","CM", "","M","MM","MMM","MMMM"}; 
	return romanPieces[num/1000+30]+romanPieces[(num/100)%10+20] +romanPieces[(num/10)%10+10]+romanPieces[num%10];
    }
}
