package com.eaton.study.oop

/**
  * Created by eaton on 11/6/2017.
  * 通过伴生对象的apply来构造类的实例比较常用。
  */
class ApplyTest{

    println("new class ApplyTest")

    def apply() = println("class ApplyTest apply()")
    def haveATry = println("class ApplyTest haveATry()")

}

object ApplyTest{
    // 重写apply()方法
    def apply() = {  //这里必须写括号
        println("using object ApplyTest to generate a class.")
        new ApplyTest
    }
}

object ApplyOps {

    def main(args: Array[String]): Unit = {
        // 新构建一个对象时，如果不写new某个类，就是用伴生对象object Array的apply()方法来构建的
        val arr = Array(1,2,3,4,5,6,7,8,9)

        //并没有用new，是因为使用其伴生对象object ApplyTest的apply()方法
        val a = ApplyTest()
        a.haveATry

        println(a())    // 调用类class ApplyTest的apply()方法
    }

}
