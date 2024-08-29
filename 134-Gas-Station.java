class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasSum = 0, costSum = 0, index=0, totalGas=0, currentGas=0;
        for(int i=0;i<gas.length;i++){
            gasSum += gas[i];
            costSum += cost[i];
            totalGas += gas[i] - cost[i];
            if(totalGas < 0){
                totalGas = 0;
                index = i+1;
            }
        }
        if(costSum > gasSum){
            return -1;
        }
        return index;
    }
}