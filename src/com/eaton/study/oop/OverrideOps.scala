package com.eaton.study.oop

/**
  * Created by yitgeng on 11/6/2017.
  */
class PersonOverrideOps(val name: String, var age: Int) { //name和age是该类的属性

    println("The primary constructor of Person")
    val language = "Java"

    def coding = "5 hours"

    override def toString = "I am a Person!" //重写toString()方法，所有对象都有toString()，类似Java类extends Object。
}

class StudentOverrideOps(name: String, age: Int, val salary: Long) extends PersonOverrideOps(name, age) {
    // 子类相比父类多了salary字段
    // 子类传入的参数name、age也会传入父类主构造器中，把父类主构造器所有参数都填充满。
    // 所以子类构造函数应该含有父类构造函数所有的字段
    // 而Java中，用super()调用父类构造器
    println("This is the subClass of Person, Primary constructor of Worker")
    override val language = "JavaScript"    //重写字段

    //重写toString()方法 这里"super."可以去掉
    override def toString = "I am a Student, I coding " + super.coding + "every day."
}

object OverrideOps {

    def main(args: Array[String]): Unit = {

        val w = new StudentOverrideOps("Jack", 18, 100000)
        println("School :" + w.language)
        println("Salary :" + w.salary)
        println(w.toString())

    }

}

