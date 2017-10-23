
Problem 40

Champernowne’s constant

An irrational decimal fraction is created by concatenating the positive integers:
0.123456789101112131415161718192021…

It can be seen that the 12th digit of the fractional part is 1.

If dn represents the nth digit of the fractional part, find the value of the following expression.
d1 × d10 × d100 × d1000 × d10000 × d100000 × d1000000

钱珀瑙恩常数

将所有正整数连接起来构造的一个十进制无理数如下所示：
0.123456789101112131415161718192021…

可以看出小数点后第12位数字是1。

如果dn表示上述无理数小数点后的第n位数字，求下式的值：
d1 × d10 × d100 × d1000 × d10000 × d100000 × d1000000

## 分析

个位 1*9 = 9 = 1 * 9 * 10^0
十位 2*(99-9) = 180 = 2 * 9 * 10^1
百位 3*(999-99) = 2700 = 3 * 9 * 10^2
千位 4*(9999-999) = 36000 = 3 * 9 * 10^3

i*9*10^(i-1)

d1 = 1 9 
d10 = 1  (10)
d100 = 5 (56) 
