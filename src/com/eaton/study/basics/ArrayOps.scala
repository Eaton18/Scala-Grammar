package com.eaton.study.basics

import scala.collection.mutable.ArrayBuffer

/**
  * Created by yitgeng on 11/2/2017.
  */
object ArrayOps {
    def main(args: Array[String]): Unit = {

        // Example 1: 遍历数组
        if(false){
            val valArray = Array(1,2,3,4,5)
            // for 循环中的i可以不写数据类型
            for(i <- 0 until valArray.length){
                println(valArray(i))
            }

            // 上边也可以写成
            for(elem <- valArray) println(elem)
        }

        // Example 2: 数组初始化
        if(false){
            val nums = new Array[Int](10)
            val a = new Array[String](10)

            val s = Array("Hello", "World")
            for (elem <- s) println(elem)

            s(0) = "Goodbye"
            for (elem <- s) println(elem)
        }

        // Example 3: 变长数组
        // 用ArrayBuffer
        if(false){
            val b = ArrayBuffer[Int]()
            b += 1
            b += (1, 2, 3, 5)
            b ++= Array(8, 13, 21)
            b.trimEnd(5)
            b.insert(2, 6)    // 在索引为2的位置插入元素6
            b.insert(2, 7, 8, 9)    // 在索引为2的位置插入元素7,8,9
            b.remove(2)    // 删除索引为2的元素
            b.remove(2, 3)    // 删除元素：从索引为2的元素开始向后删除3个元素
            b.toArray
            println(b)
        }

        // Example 4: 集合转换为字符串
        if(false){
            val a = new Array[String](10)
            for (i <- 0 until a.length)
                println(i + ": " + a(i))
            println(a.mkString("<", ",", ">"))
        }

        // Example 5: 数组操作
        if(false){
            val c = Array(2, 3, 5, 7, 11)
            val result1 = for (elem <- c) yield 2 * elem    // 所有元素乘以2，yield-带返回值的for循环
            val result2 = for (elem <- c if elem % 2 == 0) yield 2 * elem   // 所有偶数元素乘以2
            val result3 = c.filter(_ % 2 == 0).map(2 * _)    //功能同上

            for(elem <- result1) print(elem + " ")
            println
            for(elem <- result2) print(elem + " ")
            println
            for(elem <- result3) print(elem + " ")
        }

        // Example 6: 数组运算
        if(false){
            println(Array(1, 7, 2, 9).sum)    // 数组求和
            println(ArrayBuffer("Mary", "had", "a", "little", "lamb").max)    // 找最长的元素
        }

        // Example 7: 数组排序
        // 两种排序方式
        if(false){
            val d = ArrayBuffer(1, 7, 2, 9)
            val bSorted = d.sorted
            println(bSorted.mkString(sep = ", "))

            val e = Array(1, 7, 2, 9)
            scala.util.Sorting.quickSort(e)    // 将数组e在数组内部排序了
            println(e.mkString(", "))
        }

        // Example 8: 二维数组
        if(false){
            val matrix = Array.ofDim[Double](3, 4)    // 申请一个3行4列的二维数组
            matrix(2)(1) = 42    // 为二维数组

            val triangle = new Array[Array[Int]](10)    // 申请一个有10个元素的数组，每个元素又是一个长度不确定的数组
            for (i <- 0 until triangle.length)
                triangle(i) = new Array[Int](i + 1)

            println()
        }

    }
}
