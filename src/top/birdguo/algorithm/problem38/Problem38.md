Pandigital multiples

Take the number 192 and multiply it by each of 1, 2, and 3:

    192 × 1 = 192
    192 × 2 = 384
    192 × 3 = 576

By concatenating each product we get the 1 to 9 pandigital, 192384576. We will call 192384576 the concatenated product of 192 and (1,2,3)

The same can be achieved by starting with 9 and multiplying by 1, 2, 3, 4, and 5, giving the pandigital, 918273645, which is the concatenated product of 9 and (1,2,3,4,5).

What is the largest 1 to 9 pandigital 9-digit number that can be formed as the concatenated product of an integer with (1,2, … ,n) where n > 1?

全数字的倍数

将192分别与1、2、3相乘：

    192 × 1 = 192
    192 × 2 = 384
    192 × 3 = 576

连接这些乘积，我们得到一个1至9全数字的数192384576。我们称192384576为192和(1,2,3)的连接乘积。

同样地，将9分别与1、2、3、4、5相乘，得到1至9全数字的数918273645，即是9和(1,2,3,4,5)的连接乘积。

对于n > 1，所有某个整数和(1,2, … ,n)的连接乘积所构成的数中，最大的1至9全数字的数是多少？

答案：932718654

注：共有18个全景列，记录如下（192(3)表示192乘到3）

1(9);9(5);192(3);219(3);273(3);327(3);6729(2);6792(2);6927(2);

7269(2);7293(2);7329(2);7692(2);7923(2);7932(2);9267(2);9273(2);9327(2).

## 分析
1. 1乘1到9
2. 乘数中必须有3或者9，不然产生不了
3. a*b[i] a不能超过10000，不然乘积就会超过9位