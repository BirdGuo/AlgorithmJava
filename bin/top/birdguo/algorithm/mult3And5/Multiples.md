## 问题

- 地址
[问题](https://projecteuler.net/problem=1)

- 原文
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.

- 译文
如果我们将所有低于10的自然数字列为3或5的倍数，则我们得到3,5,6和9.这些倍数的总和是23。

找到1000以下的3或5的所有倍数的总和。

## 分析
1. 定义a=0
2. 遍历1到999
3. 当能被3或5整除时 a = a+num