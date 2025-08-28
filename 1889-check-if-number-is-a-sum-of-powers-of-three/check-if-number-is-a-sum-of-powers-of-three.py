class Solution:
    def checkPowersOfThree(self, n: int) -> bool:
        return all(n//3**p%3<2 for p in range(ceil(log(n,3))))
        