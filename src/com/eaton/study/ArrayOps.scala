package com.eaton.study

/**
  * Created by yitgeng on 11/2/2017.
  */
object ArrayOps {
    def main(args: Array[String]): Unit = {
        val valArray = Array(1,2,3,4,5)

        // for 循环中的i可以不写数据类型
        for(i <- 0 until valArray.length){
            println(valArray(i))
        }

        // 上边也可以写成
        for(elem <- valArray) println(elem)
    }
}
