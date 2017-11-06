package com.eaton.study.oop

/**
  * Created by eaton on 11/6/2017.
  */
/*
* Scala的内部类和Java的不同
* Java内部类从属于外部类，scala内部类从属于对象
* 若构建了一个外部类，并new出后，外部类对象的内部类是不同的内容
* */
class Outer(val name: String) {

    outer => //外部类的this引用
    class Inner(val name: String) { //定义一个内部类
        def foo(b: Inner) = println("Outer: " + outer.name + "\t\tInner: " + b.name)
    }

}


object InnerClass {

    def main(args: Array[String]): Unit = {
        val outer1 = new Outer("Spark")
        val outer2 = new Outer("Hadoop")
        val inner1 = new outer1.Inner("Scala")  //内部类从属于外部类对象
        val inner2 = new outer2.Inner("Java")

        inner1.foo(inner1)   //括号里面换成inner2，会报错，编译通不过
        inner2.foo(inner2)
    }

}
