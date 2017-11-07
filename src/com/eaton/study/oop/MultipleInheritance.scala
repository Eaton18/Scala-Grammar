package com.eaton.study.oop

/**
  * Created by eaton on 11/7/2017.
  */
class Person_MI {
    println("I'm a human")
}

trait Teacher_MI extends Person_MI {
    println("I'm a teacher")

    def teach
}

trait PianoPlayer_MI extends Person_MI {
    println("I'm a piano player")

    def playPiano = {
        println("I'm playing piano")
    }
}

class PianoTeacher_MI extends Person_MI with Teacher_MI with PianoPlayer_MI {
    override def teach = {
        println("I can play piano and I teaching students.")
    }
}


trait Action_MI {
    def doAction // 定义一个抽象方法
}

trait ActionBeforeAfter_MI extends Action_MI {
    abstract override def doAction { //注意这里的修饰符abstract和override，因为下面的super.doAction是抽象的
        println("Initialization")
        super.doAction
        println("Destroyed")
    }
}

class Work_MI extends Action_MI {
    override def doAction = {
        println("Working......")
    }
}


object MultipleInheritance {

    def main(args: Array[String]): Unit = {

        // 1. 多重继承的构造器执行顺序
        if (false) {
            // 按照继承的顺序从左往右执行构造器
            val t1 = new PianoTeacher_MI
            t1.playPiano
            t1.teach
        }

        // 2. 基于trait的AOP实现
        if (false) {
            val work = new Work_MI with ActionBeforeAfter_MI
            work.doAction
        }

    }

}

