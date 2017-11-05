package com.eaton.study.oop

/**
  * Created by eaton on 11/4/2017.
  */

class Person {    //默认是public,一个scala源文件里可以有很多类
    private var age = 0    // age必须赋值，否则编译不过，会报错
    def increment(){age += 1}

    /*
    * 方法中若没有参数，那么括号可以省略。如果返回类型是Int时，函数定义时必须写上等号=
    * 一般的规则是：改值器,改变对象状态的方法使用()，取值器，不改变对象状态的方法可以取得()
    *  方法定义中若有括号，调用方法时括号可写可不写
    * 方法定义中若无括号，调用方法时括号必须没有
    * */
    def current = age

}

class Student{
    /*
    * 属性age默认是private类型的，默认会生成public类型的getter()和setter()。
    * 属性私有，方法公有
    * 当属性类型是val时，则scala会生成私有的final字段和getter()，但没有setter()
    * 如果你不需要任何getter和setter，可以将字段声明为private[this](如private[this] var age)
    * */
    var age = 0
}

class StudentPrivate{
    private var privateAge = 1
    val name = "Scala"
    def age = privateAge

    //类的方法可以访问这个类的所有对象的私有字段(或私有属性)
    //所以isYounger这个方法可以访问Student这个类的other对象的私有属性privateAge
    def isYounger(other: StudentPrivate) = privateAge < other.privateAge


    /*
    *  private[this]限定了这个类的方法只能访问自己对象的属性privateAge，不能访问其他对象（即使这个对象是根据这个类生成）的属性。
    *  即这个属性只能是当前对象私有，isYounger()不能访问别的对象的私有成员。
    *  即一个对象的属性只能被当前对象使用，不能被当前对象的类的方法使用
    * */
    // private[this] var privateThisAge = 0
    // def isYounger(other:StudentPrivate)= privateThisAge < other.privateThisAge//报错
}

object HelloOOP {

    def main(args: Array[String]): Unit = {
        // 1. 类的使用
        if(false){
            val person = new Person()
            person.increment()
            person.increment()
            println(person.current)
        }


        // 2. getter() setter()方法
        if(false){
            val student = new Student
            println(student.age)    //打印student.age时实际是调用getter() ----age()
            student.age = 10    //给student.age赋值时实际是调用setter() ----age_()
            println(student.age)
        }


        // 3. 对象私有属性
        if(true){
            val sp = new StudentPrivate
            println(sp.name + '\t' + sp.age)
        }

    }

}

