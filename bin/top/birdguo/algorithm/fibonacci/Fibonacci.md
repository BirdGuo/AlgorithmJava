## 问题
- 地址
[问题](https://projecteuler.net/problem=2)

- 原文
Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

- 译文
斐波纳契序列中的每个新术语都是通过添加前两个术语来生成的。 从1和2开始，前10个术语将是：

1，2，3，5，8，13，21，34，55，89，...

通过考虑斐波纳契序列中的值不超过400万的条件，找到偶数项的总和。

## 分析
- 想法1
1. 生成斐波纳契数组
2. 遍历
3. 判断是否为偶数
4. 求和

- 优化
1. 自定义数组
2. 生成斐波纳契数组，生成时判断是否为偶数
3. 加入数组
4. 求和