package com.eaton.study.oop

/**
  * Created by eaton on 11/7/2017.
  */
trait LoggerTraitOps{
    def log(msg : String) //没有花括号，抽象方法。
    // 在Java中，接口interface只能有抽象方法
    // 在scala的接口trait中，可以有抽象的方法，也可以有具体的方法。
}

class ConcreteLoggerTraitOps extends LoggerTraitOps{

    // 此处override可以省略，但最好保留。
    override def log(msg : String) = println("Log = " + msg)
    // 若trait中的方法是抽象的，那么override可以省略
    // 若trait中的方法是具体的，那么override必须写

    def concreteLog = log("It's me !!")
}

trait LoggerTraitOps2{
    def log(msg : String){} //这里有个空的实现
}

class ConcreteLoggerTraitOps2 extends LoggerTraitOps2{

    // override def log(msg : String) = println("Log = " + msg)  //这里注释掉
    def concreteLog = log("It's me !!")
}

trait TraitLogger2 extends LoggerTraitOps2{   //Logger的子trait
    override def log(msg : String){
        println("TraitLogger log content is "+ msg)
    }
}

object TraitOps {
    def main(args: Array[String]): Unit = {
        // 1. 作为接口的Trait
        if(false){
            val logger = new ConcreteLoggerTraitOps
            logger.concreteLog
        }

        // 2. 在对象中混入Trait
        if(true){
            // 这里混入TraitLogger。但是要求ConcreteLogger和TraitLogger必须都继承自同一个Trait，是同一类型。
            val logger = new ConcreteLoggerTraitOps2 with TraitLogger2
            // 把这个trait中对log()的复写混入其中
            // 随着程序运行的动态情况而混入具体更符合当时上下文的实现。这也得益于：在trait中可以做很多工具方法（有具体实现）
            // 与Java一样，scala也只能继承一个类或者一个抽象类，但可以继承很多个接口，scala可以混入很多trait。
            // 所以我们可以把各种各样的工具方法混入到具体的类或者对象中，这对于我们构造大型工程或复杂的上下文环境是非常重要的。

            logger.concreteLog
        }

    }

}


