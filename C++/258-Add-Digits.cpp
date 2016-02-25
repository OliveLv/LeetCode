//Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
//
//For example:
//
//Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
// 8ms
class Solution {
public:
    int addDigits(int num) {
		if(num==0)return 0;
		int tmp=num%9;
        return tmp==0?9:tmp;
    }
};