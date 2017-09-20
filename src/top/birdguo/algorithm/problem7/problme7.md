## 问题
- 地址
[第10001个素数](https://projecteuler.net/problem=7)

- 原文
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?

- 译文
前六个素数为2，3，5，7，11，13，所以第6个素数为13，那么第10001个素数是多少


## 分析
- 思路1 
1. 遍历自然数，判断是否为素数
2. 为素数则标号+1
3. 知道标号为10001
4. 遍历的有点多

- 思路2
1. 根据素数的两性定理
大于3的素数只分布在6n-1和6n+1两数列中。（n非0自然数，下同）
6n-1数列中的合数叫阴性合数，其中的素数叫阴性素数；6n+1数列中的合数叫阳性合数，其中的素数叫阳性素数。


