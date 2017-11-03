package com.eaton.study

/**
  * Created by eaton on 11/3/2017.
  * Scala中的函数操作
  */
object FunctionOps {



    def main(args: Array[String]): Unit = {

        // Example 1: 函数与匿名函数
        if(false){
            def addA(x : Int) = x + 100
            val add = (x : Int) => x + 200    // 匿名函数
            println("The result from a function is : " + addA(2))
            println("The result from a val is : " + add(2))
        }

        // Example 2: 递归函数
        if(false){
            def fac(n:Int):Int = if (n <= 0) 1 else n * fac(n - 1)    // 递归函数必须要指明返回值的类型
            println("The result from a fac is : " + fac(10))
        }

        // Example 3: 函数默认参数
        if(false){
            def combine(content:String, left: String = "[", right: String = "]") = left + content +right
            println("The result from a combine is : " + combine("Hello Scala"))
            println("The result from a combine is : " + combine("Hello Scala", "<"))
            println("The result from a combine is : " + combine("Hello Scala", "<", ">"))
        }

        // Example 4: 可变长度参数
        // Scala 通过在参数的类型之后放一个星号来设置可变参数
        if(false){
            def connected(args: String*) = {
                for(arg <- args) println("I Love " + arg + '.')
            }

            println("The result from a connected is : ")
            connected("C++", "Java", "Scala", "Python", "PHP")
        }
    }

}
