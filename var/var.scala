object varDemo{
    def main(args: Array[String]): Unit = {
        var name=2
        // isInstanceOf可以用来判断类型
        println(name.isInstanceOf[Int])

        // 类型确定后，就不能修改，说明scala 是强数据类型语言

        // 在声明/定义一个变量时，可以使用var 或者 val来修饰，var 修饰的变量可以改变，val修饰的变量不可修改  
        var age = 10
        age = 30 // ok

        val t = 1
        // t = 2 // false
        val dog = new Dog()
        // dog.name = "xx" // 不能修改
        dog.age = 12
    }
}

class Dog{
    val name:String = ""
    var age:Int = 13
}