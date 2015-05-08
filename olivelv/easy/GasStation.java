package olivelv.easy;

/**
 * There are N gas stations along a circular route, where the amount of gas at
 * station i is gas[i].
 * 
 * You have a car with an unlimited gas tank and it costs cost[i] of gas to
 * travel from station i to its next station (i+1). You begin the journey with
 * an empty tank at one of the gas stations.
 * 
 * Return the starting gas station's index if you can travel around the circuit
 * once, otherwise return -1. Note: The solution is guaranteed to be unique.
 * 
 * @author olivelv
 * @version time: 2015年5月8日 下午11:02:48
 */
public class GasStation {
	public int canCompleteCircuit(int[] gas, int[] cost) {
		int n=gas.length;
		if(n==0)return -1;
		int tolgas=0;
		int tolcost=0;
		for(int i=0;i<n;i++){
			tolgas+=gas[i];
			tolcost+=cost[i];
		}
		if(tolgas<tolcost)return -1;
		int begin=0;
		int current=0;
		while(true){
			int remain=0;
			for(int idx=0;idx<n;idx++){
				current=(begin+idx)%n;
				remain+=gas[current]-cost[current];
				if(remain<0)break;
			}
			if(remain>=0)return begin;
			begin=(current+1)%n;
		}
	}
}
