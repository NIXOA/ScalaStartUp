package main.scala.toScala

/**Java中的原始类型对应的Scala的类
  * @Author yekai
  * @Date 2018/10/31 19:38
  */
class ScalaInt {


  /**
    * 使用scala中的Int实例，调用java.util.ArrayList的ensureCapacity()
    */
  def playWithInt(): Unit={
      val capacity: Int = 10;
      val list = new java.util.ArrayList[String]
      list.ensureCapacity(capacity)

    }


  /**
    * 使用元祖和多重赋值返回多个值
    * @param primaryKey
    * @return
    */
  def getPersonInfo(primaryKey: Int)={
    ("Venkat","Subrananiam","venkats@gmail.com")
  }
  //如果方法的结果赋值更多或者更少的值，编译器会直接报错,使用getPersonInfo(1)中的1可以访问数组中的第一个元素
  //于集合不同，元组从索引为1开始
  //val info=getPersonInfo(1) val firstName=info._1
  val (firstName,lastName,emailAddress)=getPersonInfo(1)

  println(s"First Name: $firstName")
  println(s"LastName: $lastName")
  println(s"EmailAddress: $emailAddress")


}
