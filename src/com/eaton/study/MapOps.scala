package com.eaton.study

/**
  * Created by yitgeng on 11/2/2017.
  */
object MapOps {
    def main(args: Array[String]): Unit = {

        val ages = Map("Java" -> 4, "Scala" -> 5)

        // 遍历map
        for((k,v) <- ages){
            println("Key is " + k + ",value is " + v)
        }

        // 只访问一个值，另一个用占位符
        for((k,_) <- ages){ //placeholder
            println("Key is " + k)
        }
    }
}

