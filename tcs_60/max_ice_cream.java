class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int icecream = 0;
        for (int cost : costs) {
            if (coins >= cost) { // if coins not left then break 
                coins = coins - cost;
                icecream++;
            } else {
                break;
            }
        }
        return icecream;
    }
}
/**
dry run
[2,3,5] coins=8

8>=2true
8-2=6 c=1
--------------------------------
8-2=6  2 coin used !!!!

6>=3  true
6-3=3 c=2
--------------------
6-3=3 coin left 

3>=5  false break 

c=2 ans */