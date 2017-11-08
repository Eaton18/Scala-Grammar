package com.eaton.study.oop

/**
  * Created by yitgeng on 11/8/2017.
  */
// 1.包、类、对象、成员访问权限实战
package spark {
    package navigation {

        private[spark] class Navigator { //private[spark]限定了类Navigator的可见度，可扩展到spark这个包里的所有类和对象（当然也包含其子包里的所有类和对象）

            protected[navigation] def useStarChart() {} //protected[navigation] 类Navigator和其子类以及包navigation里所有代码都可以访问这个方法

            class LefOfJourney {
                private[Navigator] val distance = 100 //private[Navigator]对这个类内部所有成员、方法都可见
            }

            private[this] var speed = 200 //private[this] 只有当前对象可访问，是对象私有的。即使那个对象也是属于这个类的，也不能访问。当然更不能被其它类型的对象访问
        }

    }

    package launch {

        import navigation._

        object Vehicle {
            private[launch] val guide = new Navigator //launch包中所有内容都可以访问这个成员
        }

    }

}


// 2.伴生类、伴生对象访问权限实战
class PackageAccessControl {

    import PackageAccessControl.power //伴生对象中的私有成员变量
    private def canMakeItTrue = power > 100001
}

object PackageAccessControl {
    private def power = 10000

    def makeItTrue(p: PackageAccessControl): Boolean = {
        var result = p.canMakeItTrue //伴生类中的私有成员方法
        result
    }
}

//伴生类中有protected成员，那么其子类都可以访问
//若伴生对象中有protected成员，因为伴生对象无子类，所以也无法谈了。

