package com.eaton.study

import scala.io.Source

/**
  * Created by yitgeng on 11/3/2017.
  */
object LazyOps {
    def main(args: Array[String]): Unit = {
        // lazy 关键字可以让变量延迟执行，等到第一次用到该变量的时候才实例化。
        lazy val file = Source.fromFile("D:\\hahahaha.txt")
        println("Scala")

        // 可以输出上边的Scala，下边的语句报错。
        for (line <- file.getLines) println(line)
    }
}
