## 问题
- address
[问题](https://projecteuler.net/problem=6)
- 原文

The sum of the squares of the first ten natural numbers is,
1² + 2² + ... + 10² = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)² = 55² = 3025

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

- 译文
前十个自然数的平方和，
1² + 2² + ... + 10² = 385

前十位自然数之和的平方，
（1 + 2 + ... + 10）² = 55² = 3025

因此，前10个自然数的平方和之和与平方的差为3025〜385 = 2640。

找出第一百个自然数的平方和与和的平方之间的差额。

## 分析
- 思路1
1. 套用完全平方公式(a+b)²=a²+2ab+b² 
2. (a+b+c)²=((a+b)+c)²=(a+b)²+2(a+b)c+c²=a²+2ab+b²+2ac+2bc+c²
3. (1+2+3+...+n)²-(1²+2²+3²+...+n²)=2(1*2+1*3+...+1*n+2*3+2*4+...2*n+...)
4. 这样循环太多了
5. 1+2+...+n = n*(n+1)/2
6. 2(1*2+1*3+...+1*n+2*3+2*4+...2*n+...) = 2*(2+3+...+n+ 2*(3+..+n)+3*(4+...+n) )
7. 



- 思路2
1. 获得平方和
2. 获得（1+...+n）平方
3. 相减