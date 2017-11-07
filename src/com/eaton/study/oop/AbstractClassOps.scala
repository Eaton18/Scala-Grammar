package com.eaton.study.oop

/**
  * Created by eaton on 11/7/2017.
  */
/*
*  抽象类在Scala中很重要。
*  Spark中的RDD是抽象的，可以有很多具体实现的RDD。eg：操作数据库的RDD，JDBC的RDD，Hadoop的RDD
*  虽然scala中也有接口trait，但面向对象的面向接口编程中，绝大多数用的是抽象类。
*  eg:spark中的机器学习啊，图计算啊，流处理啊，都有具体的实现RDD
* */
class AbstractClassOps {
    var id: Int = _
}

abstract class SuperTeacher(val name: String) { //声明一个类为抽象类用abstract关键字
    var id: Int // 不给字段赋值，即表明是抽象字段。
    var age: Int // 具体的类里的字段必须赋值（值可以是具体值或者字段是var类型时占位符_也可以）
    def teach // 不需要实现方法体，即表明是抽象方法
}

class TeacherForMaths(name: String) extends SuperTeacher(name) { //实现抽象类用extends关键字

    // 实现字段和方法时override关键字可用可不用，但在spark中，一般都会用。
    // 所以通常也加上，更直观地表明这是从父类继承来的字段
    override var id = name.hashCode()
    override var age = 29

    override def teach {
        println("Teaching!!!")
    }
}


object AbstractClassOps {
    def main(args: Array[String]) {
        val teacher = new TeacherForMaths("Spark")
        teacher.teach

        println("teacher.id" + ":" + teacher.id)
        println(teacher.name + ":" + teacher.age)

    }
}
