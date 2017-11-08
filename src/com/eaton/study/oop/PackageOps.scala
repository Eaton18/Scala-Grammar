package com.eaton.study.oop //作用域在整个代码块，省略了花括号

// 3. 隐式引入的包
// Scala通常会隐式引入一些基本的包
import java.lang._  //java.lang包的所以东西
import scala._  //scala包的所以东西
import Predef._  //Predef对象的所以东西
// 后面引入的类会覆盖掉前面引入的类。
// eg：scala.StringBuilder会覆盖掉java.lang.StringBuilder

// 4. 重命名和隐藏方法
import java.awt.{Color, Font} //只引入这两个类
import java.util.{HashMap => JavaHashMap}  //起个别名。scala和Java中类名有冲突，因为在scala中可以使用Java的所以内容
import scala.{StringBuilder => _}  //隐藏这个类，不要引入这个类

/**
  * Created by yitgeng on 11/8/2017.
  */

// 2. 包对象、包引用
package com.scala.spark
package object people { //包对象
    val defaultName = "scala"
}

package people {

    class people {
        var name = defaultName //package里所有的类成员可以直接访问包对象里的成员变量和方法。言外之意：包本身不能定义成员变量和方法
    }

}


// 1. 包的定义
package spark.naivgation { //链式结构
abstract class Navigator {
    def act
}

    package tests { //测试的代码放在一个包里
    class NavigatorSuite

    }

    package impls { //实现的代码放在一个包里
    class Action extends Navigator {
        def act = println("action")
    }

    }

}

package hadoop {
    package navigation {

        class Navigator

    }

    package launch {

        class Booster {
            val nav = new navigation.Navigator //不用加hadoop前缀，因为都在一个包里
        }

    }

}


object PackageOps {

    def main(args: Array[String]): Unit = {

    }

}

