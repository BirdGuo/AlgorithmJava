Lattice paths
Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.


How many such routes are there through a 20×20 grid?

网格路径
从一个2×2方阵的左上角出发，只允许向右或向下移动，则恰好有6条通往右下角的路径。


对于20×20方阵来说，这样的路径有多少条？

## 分析
数了半天，网上查了点资料，发现居然是杨辉三角

又找了几天，杨辉三角第n行第m个数居然是组合数 C(n-1,m-1)