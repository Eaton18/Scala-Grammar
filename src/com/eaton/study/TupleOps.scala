package com.eaton.study

/**
  * Created by eaton on 11/2/2017.
  */
object TupleOps {
    def main(args: Array[String]): Unit = {

        // Tuple 可以将不同类型的元素放到一起
        val valTuple = (10086, "Hello", ',' , "World")
        println(valTuple.getClass)

        // 访问Tuple 中的元素的方式，注意编号是从1开始的
        println(valTuple._1)
        println(valTuple._2)
        println(valTuple._3)
        println(valTuple._4)

        // 下面的这种遍历方式不行，因为元祖中的数据类型不一致
        //for (elem <- valTuple) println(elem)

    }
}
