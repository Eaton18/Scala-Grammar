package com.eaton.study.oop

/**
  * Created by eaton on 11/6/2017.
  */
class Teacher { //这里省略了()主构造器。构造器的定义和类定义交织在一起
    //默认为私有字段，生成公有的getter和setter
    //必须要初始化，否则报错，这里可以用一个占位符赋初值
    var name: String = _

    // 私有字段，生成私有的getter和setter
    private var age = 27

    // 对象私有字段，不生成getter和setter
    private[this] var gender = "male"

    // 重载构造器，也叫附属构造器。任何一个重载构造器都必须调用其他的重载构造器或主构造器
    // 重载构造器最上层一定是调用的主构造器
    def this(name: String) {
        this //实际上是this()，省略了括号，这里调用主构造器
        this.name = name
    }

    def sayHello() {
        println(this.name + "," + this.age + "," + this.gender)
    }

}


class StudentCons(var name: String, var age: Int) { //主构造器，传入的参数以var或val来说明，那么这个参数会成为类的字段
    // 如果不想让别人使用主构造器，那么就在类名后面加一个private，调用时候就只能使用辅助构造器了
    // class Student private (var name : String, var age : Int)  { ... }


    println("This is a primary constructor!")

    var gender: String = _

    println("gender: " + gender)

    def this(name: String, age: Int, gender: String) { //附属构造器、辅助构造器，或重载构造器
        this(name, age) //每一个辅助构造器都必须以一个对（先前已定义的其他辅助构造器或主构造器）的调用开始！
        this.gender = gender
    }

}


object ScalaConstructor {
    def main(args: Array[String]): Unit = {

        // 1. 构造器的使用
        if (false) {
            var p = new Teacher("Jack")
            p.sayHello
            p.name = "spark"
            p.sayHello

            // 报错！age为私有属性，生成私有的setter()方法，只有该类中的方法可以调用该setter()方法
            // p.age
            // 报错！ 因为这个属性是对象私有字段，不会生成setter()
            // p.gender = "female"
        }


        // 2. 私有构造器
        if (false) {
            var s = new StudentCons("John", 12)
            println(s.name)
        }

    }
}
