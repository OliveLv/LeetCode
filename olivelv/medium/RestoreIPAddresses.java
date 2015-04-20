package olivelv.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given a string containing only digits, restore it by returning all possible
 * valid IP address combinations.
 * 
 * For example: Given "25525511135",
 * 
 * return ["255.255.11.135", "255.255.111.35"]. (Order does not matter)
 * 
 * 
 * @author olivelv
 * @version time: 2015年4月19日 下午3:36:20
 */
public class RestoreIPAddresses {
	public boolean isValid(String s) {
		// System.out.println(s);
		if(s.length()==0||s.length()>3)return false;
		int val = Integer.parseInt(s);
		if (s.length() > 1 && s.charAt(0) == '0')
			return false;
		if (val >= 0 && val < 256)
			return true;
		return false;
	}

	public List<String> restoreIpAddresses(String s) {
		Set<String> res = new HashSet<String>();
		int n = s.length();
		if (n < 4)
			return new ArrayList<String>(res);
		if (n == 4) {
			res.add(s.charAt(0) + "." + s.charAt(1) + "." + s.charAt(2) + "."
					+ s.charAt(3));
			return new ArrayList<String>(res);
		}
		String[] ip = new String[4];
		for (int i = 1; i <= 3 && i < n; i++) {
			String val = s.substring(0, i);

			// int val=ip[0]*10+s.charAt(i)-'0';
			if (!isValid(val))
				break;
			ip[0] = new String(val);
			for (int j = i + 1; j - i <= 3 && j < n; j++) {
				val = s.substring(i, j);
				// System.out.println(val);
				if (!isValid(val)) {
					ip[1] = null;
					break;
				}
				ip[1] = new String(val);
				// print(ip);
				for (int k = j + 1; k - j <= 3 && k < n; k++) {
					val = s.substring(j, k);
					if (!isValid(val)) {
						ip[2] = null;
						break;
					}
					ip[2] = new String(val);
					// print(ip);
					if (n - k > 4) {
						// ip[1]=ip[2]=ip[3]=0;
						continue;
					}
					val = s.substring(k, n);
					if (isValid(val)) {
						ip[3] = new String(val);
						res.add(array2str(ip));
						// print(ip);
						ip[3] = null;
					}
				}

			}

		}
		return new ArrayList<String>(res);
	}

	public String array2str(String[] ip) {
		String str = "";
		for (int j = 0; j < 4; j++)
			if (j == 0)
				str += ip[j];
			else
				str += "." + ip[j];
		return str;
	}
	
	// 另一种方法
	public List<String> restoreIpAddresses2(String s) {
	     return restoreIpAddresses2(s, 0);
	}
	public List<String> restoreIpAddresses2(String s, int idx) {
		List<String> res = new ArrayList<String>();
		if (idx == 3) {
			if (isValid(s))
				res.add(s);
			return res;
		}
		int n = s.length();

		for (int i = 1; i <= 3 && i <= n; i++) {
			String str = s.substring(0, i);
			if (!isValid(str))
				continue;
			List<String> list = restoreIpAddresses2(s.substring(i), idx + 1);
			for (String ele : list) {
                 res.add(str+"."+ele);
			}

		}
		return res;
	}
    // 另一种方法 结束
	public void print(String[] ip) {
		for (int j = 0; j < 4; j++)
			System.out.print(ip[j] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		RestoreIPAddresses test = new RestoreIPAddresses();
		// String s="25525511135";
		String s = "0279245587303";
		List<String> res = test.restoreIpAddresses2(s);
		System.out.println(res.size());
		for (String str : res) {
			System.out.println(str);
		}
	}
}
