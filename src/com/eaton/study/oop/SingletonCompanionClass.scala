package com.eaton.study.oop

/**
  * Created by eaton on 11/6/2017.
  * 单例对象、伴生对象
  */
// 在Scala中，没有像Java中的静态类、静态成员、静态方法，但提供了Object对象
// 类似Java中的静态类，它里面的所以成员（变量、方法）都是静态的
object University {
    println("hello")
    private var studentNo = 1000

    def newStudentNo = {
        studentNo += 1
        studentNo
    }
}


// 当类和对象有相同的名字时，我们称为其为对方的伴生类、伴生对象。
// 它们必须定义在同一个源文件中。
// 当类class和对象object的名字相同时
// 如class University是object University的伴生类，object University是class University的伴生对象
// 伴生类可以访问伴生对象的所有成员，包括其私有的成员。反过来亦如此。即伴生类和对象可相互访问其私有成员。
class University {
    // object University并不是在class University的作用域内，所以newStudentNo前需要用University。
    var id = University.newStudentNo

    private var number = 0

    def aClass(number: Int) {
        this.number += number
    }
}


object SingletonCompanionClass {
    def main(args: Array[String]): Unit = {
        /* Java中，类里的静态模块当类被加载进来就会被执行
         * scala中，object里除了方法的代码，只有在第一次使用时才会被执行
         * object可作为静态方法、静态成员、公共变量的集合区
         * eg：一些配置属性初始化可放在object里
         */
        if (false) {
            println(University.newStudentNo)
            println(University.newStudentNo)
        }


        if (false) {
            val university = new University
            println(university.id)
        }


        // apply属于object Array
        // 新构建一个对象时，如果不写new某个类，就是用伴生对象object Array的apply()方法来构建的
        if(false){
            val array = Array(1,2,3,4)
            for (elem <- array) print(elem + "\t")
        }

    }
}
