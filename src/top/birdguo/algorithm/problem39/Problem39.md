Problem 39

Integer right triangles

If p is the perimeter of a right angle triangle with integral length sides, {a,b,c}, there are exactly three solutions for p = 120.
{20,48,52}, {24,45,51}, {30,40,50}

For which value of p ≤ 1000, is the number of solutions maximised?

整数边长直角三角形

若三边长{a,b,c}均为整数的直角三角形周长为p，当p = 120时，恰好存在三个不同的解：
{20,48,52}, {24,45,51}, {30,40,50}

在所有的p ≤ 1000中，p取何值时有解的数目最多？

## 分析
1. x²+y²=z²
2. x+y+z=k
3. y=(2*k*x-k²)/2(x-k)   ; z=k-x-((2*k*x-k²)/2(x-k))
4. z<500
5. x=(k²-(k-z)²)½
6. y=k-z-(k²-(k-z)²)½
