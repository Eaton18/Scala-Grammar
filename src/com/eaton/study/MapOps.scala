package com.eaton.study

/**
  * Created by eaton on 11/2/2017.
  */
object MapOps {
    def main(args: Array[String]): Unit = {

        // 1. Map初始化及访问元素
        if(false){
            val ages = Map("Java" -> 4, "Scala" -> 5)

            // 遍历map
            for((k,v) <- ages)
                println("Key is " + k + ",value is " + v)

            // 只访问一个值，另一个用占位符(placeholder)
            for((k,_) <- ages)
                println("Key is " + k)

            // 访问某一个元素
            println(ages("Java"))
        }


        // 2. 可变集合
        if(false){
            // 用如下方法可以实例化一个可变集合
            val scores = scala.collection.mutable.Map("Scala" -> 7, "Hadoop" -> 8, "Spark" -> 10 )
            scores += ("R" -> 9)    // 集合中添加一个键值对
            scores -= "Hadoop"    // 集合中删除键为"Hadoop"的键值对

            // getOrElse()方法，Map访问，如果Map中有"Hadoop"这个键，则返回其元素值，否则返回0
            val hadoopScore = scores.getOrElse("R", 0)
            println(hadoopScore)
        }


        // 3. Map转换
        if(false){

            val map = Map("book"->10, "gun"->18, "ipad"->1000)
            val mapTrans = for((k,v) <- map) yield (k,v * 0.9)
            println(mapTrans)

            // Map是不可变的(即默认申请的是一个: scala.collection.immutable.Map)，所以如下操作编译不通过
            // 要么把map变为var类型，要么实例化为: scala.collection.mutable.Map
            // map += ("iOS" -> 100)
            // map -= "book"

        }


        // 4. Map排序
        if(false){
            // SortedMap可以自动对Map的key的排序
            val sortedScore = scala.collection.immutable.SortedMap("C++" -> 12, "PHP" -> 9 ,"Java" -> 32, "Scala" -> 8)

            println(sortedScore)
        }

    }

}

