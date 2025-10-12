/**
 * Calculates the maximum profit from buying and selling a stock once
 * @param prices - Array of stock prices where prices[i] is the price on day i
 * @returns Maximum profit that can be achieved from one transaction
 */
function maxProfit(prices: number[]): number {
    // Track the maximum profit found so far
    let maxProfitSoFar: number = 0;
  
    // Track the minimum price seen so far (best buying price)
    let minPrice: number = prices[0];
  
    // Iterate through each price in the array
    for (const currentPrice of prices) {
        // Update maximum profit if selling at current price yields better profit
        maxProfitSoFar = Math.max(maxProfitSoFar, currentPrice - minPrice);
      
        // Update minimum price if current price is lower (better buying opportunity)
        minPrice = Math.min(minPrice, currentPrice);
    }
  
    return maxProfitSoFar;
}