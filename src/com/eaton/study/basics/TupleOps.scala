package com.eaton.study.basics

/**
  * Created by eaton on 11/2/2017.
  */
object TupleOps {
    def main(args: Array[String]): Unit = {

        // 1. Tuple初始化及访问
        if(false){
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


        // 2. Tuple 赋值
        if(false){

            val tuple =(1,2,3.14,"Rocky","Spark","Flink")
            val elem3 = tuple._3

            // Tuple可以给另一个tuple赋值
            // 通过这种方式，将Tuple类型的元素作为函数返回值，可以实现同事返回多种不同类型的元素值
            val (first,second,third,fourth,fifth,sixth) = tuple
            println("first: " + first)
            println("third: " + third)
            println("sixth: " + sixth)

            // 不需要赋值的元素需要输入占位符
            val (one, two, _, _, _,_) = tuple
            println("one: " + one)
            println("two: " + two)
        }

        // 3. partition操作生成元祖
        if(false){
            // 将"Rocky Spark"字符串中的大写字母提出来组成一个元素，剩余的是另一个元素，结果存放在Tuple中
            val pt = "Rocky Spark".partition(_.isUpper)

            println(pt)
        }


        // 4. zip操作
        if(false){
            val symbols = Array("[", "-", "]")
            val counts = Array(2,5,2)

            // zip操作将数组对应的元素组合成Tuple然后最终结果存在Array中，Array中每个元素是一个Tuple
            val pairs: Array[(String, Int)] = symbols.zip(counts)
            for (elem <- pairs) println(elem)

            for ((x,y) <- pairs) print(x*y)
        }


    }

}
