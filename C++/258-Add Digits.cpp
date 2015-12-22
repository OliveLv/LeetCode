class Solution {
public:
    int addDigits(int num) {
		if(num<10)return num;
		int tmp=num%9;
        if(tmp==0)return 9;
		return tmp;
    }
};