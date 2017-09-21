## 问题
- 地址
[问题](https://projecteuler.net/problem=9)
- 原文
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.
There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc
- 译文
一个毕达哥拉斯三元组是一个包含三个自然数的集合，a<b<c
a2 + b2 = c2
例如：32 + 42 = 9 + 16 = 25 = 52.
已知存在并且只存在一个毕达哥拉斯三元组满足条件a + b + c = 1000。
找出该三元组中abc的乘积。

## 分析
一、达到三个条件，就计算三数乘积结果
1、a+b+c=1000
2、a^2+b^2=c^2
3、c>b>a>0（abc 为自然数）
二、条件化简：
    1、针对已知条件1，2，可通过a + b + c = 1000得出a^2+b^2+c^2+2ab+2ac+2bc=1000000,把a^2+b^2=c^2和a=1000-c-b代入后化简，得出公式(1000-b)*(b+c)=500000
    2、由b>a 和a+b+c=1000，推导出b>500-c/2
    3、由a>0和a+b+c=1000，推导出1000-b-c>0