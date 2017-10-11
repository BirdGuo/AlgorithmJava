Non-abundant sums
A perfect number is a number for which the sum of its proper divisors is exactly equal to the number. For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.

A number n is called deficient if the sum of its proper divisors is less than n and it is called abundant if this sum exceeds n.

As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest number that can be written as the sum of two abundant numbers is 24. By mathematical analysis, it can be shown that all integers greater than 28123 can be written as the sum of two abundant numbers. However, this upper limit cannot be reduced any further by analysis even though it is known that the greatest number that cannot be expressed as the sum of two abundant numbers is less than this limit.

Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.

并非盈数之和
完全数是指真因数之和等于自身的那些数。例如，28的真因数之和为1 + 2 + 4 + 7 + 14 = 28，因此28是一个完全数。

一个数n被称为亏数，如果它的真因数之和小于n；反之则被称为盈数。

由于12是最小的盈数，它的真因数之和为1 + 2 + 3 + 4 + 6 = 16，所以最小的能够表示成两个盈数之和的数是24。通过数学分析可以得出，所有大于28123的数都可以被写成两个盈数的和；尽管我们知道最大的不能被写成两个盈数的和的数要小于这个值，但这是通过分析所能得到的最好上界。

找出所有不能被写成两个盈数之和的正整数，并求它们的和。

## 定义
真因数
一个数的因数只有1和它本身，这个数叫质数。一个数除1和它本身外，还有其它的因数，这个数叫合数。真因数通常是对合数来说的。不包括这个数本身的约数就是真因数（真因子[1]  ）。如6的约数（因子）有1、2、3、6，真因子是1、2、3。

## 分析
1. 小于**28123**不能被写成盈数和的正整数
2. 找到能被写成盈数和的正整数
3. 去除这部分正整数

4. 从25开始计算是否能成为盈数和
5. 找到所有小于28123的盈数