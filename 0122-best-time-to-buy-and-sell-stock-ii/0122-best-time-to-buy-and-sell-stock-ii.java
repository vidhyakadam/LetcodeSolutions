class Solution {
    public int maxProfit(int[] prices) {
//take int profit
//iterate over the loop
//if the right and left side of the no is greather than that no it is a local minima 
//them minius that local minima with next element ; 
// and that valu add in the profit


int profit = 0;
for(int i=1; i<prices.length; i++)
{
   if(prices[i]> prices[i-1])
  {
     profit +=(prices[i]-prices[i-1]);
    }

   }
      return profit;  
    }
}