// object 表示一个伴生对象，这里我们可以简单的理解就是一个对象
// HelloWorld 就是对象名字，它底层真正对应的类名是HelloWorld$,对象是HelloWorld$类型的一个静态对象MODULE$
// 当我们编写一个object HelloWorld底层会生成两个.class文件，分别是HelloWorld 和HelloWorld$
object HelloWorld
{
    def main(args: Array[String]): Unit = {
        println("Hello World")
    }
}