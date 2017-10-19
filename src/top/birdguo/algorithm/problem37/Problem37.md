Truncatable primes

The number 3797 has an interesting property. Being prime itself, it is possible to continuously remove digits from left to right, and remain prime at each stage: 3797, 797, 97, and 7. Similarly we can work from right to left: 3797, 379, 37, and 3.

Find the sum of the only eleven primes that are both truncatable from left to right and right to left.

NOTE: 2, 3, 5, and 7 are not considered to be truncatable primes.

可截素数

3797有着奇特的性质。不仅它本身是一个素数，而且如果从左往右逐一截去数字，剩下的仍然都是素数：3797、797、97和7；同样地，如果从右往左逐一截去数字，剩下的也依然都是素数：3797、379、37和3。

只有11个素数，无论从左往右还是从右往左逐一截去数字，剩下的仍然都是素数，求这些数的和。

注意：2、3、5和7不被视为可截素数。

## 分析
1. 生成素数
2. 首位和末位均为素数 2，3，5，7
3. 二位数 23，37，53，73
4. 首位和末位必为3或7