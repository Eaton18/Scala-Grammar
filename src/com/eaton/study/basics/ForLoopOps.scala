package com.eaton.study.basics

/**
  * Created by eaton on 11/3/2017.
  */
object ForLoopOps {
    def main(args: Array[String]): Unit = {

        // for 循环操作
        for(i <- 1 to 2; j <- 1 to 2) print((100*i + j) + "  ")
        println

        // for 循环增加判断语句
        for(i <- 1 to 2; j <- 1 to 2 if i != j) print((100*i + j) + "  ")
        println
    }
}
