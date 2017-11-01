package com.eaton.study

import java.io.{FileNotFoundException, FileReader, IOException}
import scala.io.StdIn

/**
  * Created by yitgeng on 11/1/2017.
  */
object BasicGrammar {

    def looper(x : Long, y : Long) : Long = {

        var a = x
        var b = y
        while(a != 0){
            val temp = a
            a = b % a
            b = temp
        }
        b    // b为返回值，可以不用写return关键字
    }

    def doWhile(){
        var line = ""
        do {
            // line = readLine()    // readLine()函数已经弃用了
            line = StdIn.readLine()
            println("Read: " + line)
        } while (line != "")
    }

    def main(args: Array[String]): Unit = {

        // Example 1
        if(false){
            var file = "scala.txt"
            if (!args.isEmpty) file = args(0)
            // val file = if(!args.isEmpty) args(0) else "scala.xml"
            println(file)
        }


        // Example 2: do...while循环/函数调用
        // Scala设计思想：尽量少写代码，所以在每行结尾可以少敲一个分号，以及下边的例子。
        // 对于没有返回值的函数，Scala可以不用输入()，直接输入函数名来调用函数。
        if(false){
            doWhile    // 此处调用了doWhile方法
        }


        // Example 3: 函数返回值的写法
        if(false){
            println(looper(100, 298))    //看函数looper()的返回值写法，也符合Scala的精简代码的设计思想
        }


        // Example 4: for循环
        // Scala有着彻底的一切皆对象的思想
        if(false){
            for (i <- 1 to 10) {
                println("Number is :" + i)
            }

            // 1 to 10 即为 1.to(10) ，一切皆对象，1是对象，to()是他的方法
            // 和上边的循环是同样的意思
            for (i <- 1.to(10)){
                println("Number is :" + i)
            }
        }

        // Example 5: 异常处理
        if(false){
            // 和Java一样， try...catch...finally
            // 借用了模式匹配的思想来做异常处理，在catch中是各种case匹配异常类型
            try {
                val f = new FileReader("input.txt")
            } catch {
                case ex: FileNotFoundException => {
                    println("Missing file exception")
                }
                case ex: IOException => {
                    println("IO Exception")
                }
            } finally {
                println("Exiting finally...")
            }
        }

    }

    // Example 6: Object 中的代码块
    // Object 是静态的，所以其中的没有被封装在函数中的代码块都会被执行
    println("This is a Code Block.")
}
