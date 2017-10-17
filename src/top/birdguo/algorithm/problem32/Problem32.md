Pandigital products

We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once; for example, the 5-digit number, 15234, is 1 through 5 pandigital.

The product 7254 is unusual, as the identity, 39 × 186 = 7254, containing multiplicand, multiplier, and product is 1 through 9 pandigital.

Find the sum of all products whose multiplicand/multiplier/product identity can be written as a 1 through 9 pandigital.

HINT: Some products can be obtained in more than one way so be sure to only include it once in your sum.

全数字的乘积

如果一个n位数包含了1至n的所有数字恰好一次，我们称它为全数字的；例如，五位数15234就是1至5全数字的。

7254是一个特殊的乘积，因为在等式39 × 186 = 7254中，被乘数、乘数和乘积恰好是1至9全数字的。

找出所有被乘数、乘数和乘积恰好是1至9全数字的乘法等式，并求出这些等式中乘积的和。

注意：有些乘积可能从多个乘法等式中得到，但在求和的时候只计算一次。

## 分析
a*b=c

1. c必定不为素数
2. a,b均小于c
3. 如果a为个位数，则b,c均为4位数
4，如果a为两位数，则b为三位数，c为4位数
5，如果a为三位数，则b为三位数，c为三位数，此种情况不可能
//最小四位数
for(int c = 1234;c<=9876;c++){
	//1234
	获得除以
	//5,6,7,8,9
	//56,57,58,59,67,68,69,78,78,89 后的商
	//商是否和剩余的数相同
}