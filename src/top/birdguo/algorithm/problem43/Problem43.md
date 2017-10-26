Sub-string divisibility

The number, 1406357289, is a 0 to 9 pandigital number because it is made up of each of the digits 0 to 9 in some order, but it also has a rather interesting sub-string divisibility property.

Let d1 be the 1st digit, d2 be the 2nd digit, and so on. In this way, we note the following:

    d2d3d4=406 is divisible by 2
    d3d4d5=063 is divisible by 3
    d4d5d6=635 is divisible by 5
    d5d6d7=357 is divisible by 7
    d6d7d8=572 is divisible by 11
    d7d8d9=728 is divisible by 13
    d8d9d10=289 is divisible by 17

Find the sum of all 0 to 9 pandigital numbers with this property.

子串的可整除性

1406357289是一个0至9全数字数，因为它由0到9这十个数字排列而成；但除此之外，它还有一个有趣的性质：子串的可整除性。

记d1是它的第一个数字，d2是第二个数字，依此类推，我们注意到：

    d2d3d4=406能被2整除
    d3d4d5=063能被3整除
    d4d5d6=635能被5整除
    d5d6d7=357能被7整除
    d6d7d8=572能被11整除
    d7d8d9=728能被13整除
    d8d9d10=289能被17整除

找出所有满足同样性质的0至9全数字数，并求它们的和。

## 分析
1. 0-9全排列
2. 3-3取位
3. 判断是否为素数


