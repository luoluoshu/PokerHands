# poker hands
a TDD project about the poker
## task
![task](https://github.com/luoluoshu/gradle-empty-stack-2019-7-5-15-58-18-862/blob/master/poker.jpg)
## TDD
1. 首先，我们需要能比出两个扑克牌的大小。输出大的牌。
    given 2C and 4H ,
    when call compare,
    then return 4H.
 2. 现在开始我们考虑有5张牌，找出五张牌里面点数最大的一张。在实现上，我们可以通过构建一个长度为13的int
 数组来存储这些牌，每个牌的点数是几就在该数组对应下标下++。然后从尾部开始遍历
 数组遇到不是0的就是它最大的点数。given 2C 3H
  4C 8H 9D, when call compare, then return 9D.
  3. 现在我们只考虑high card一种情况，可以开始比大小了。given 2C 3H
              4C 8H 9D,  4C 5D 8H 9S QC, when call compare, then return 4C 5D 8H 9S QC.