package main.scala.toScala

/**
  * scala的构造函数，除了def定义的成员函数之外
  * 的所有操作都可以看做是构造函数的行为部分
  * @Author yekai
  * @Date 2018/11/1 19:41
  */
class Wifi(name:String) {
    override def toString:String =name;

  /**
    * 当没有参数传入的时候，调用隐式参数
    * @param user  常规参数
    * @param wifi  隐式参数
    */
  def  connectionToNetWork(user : String)(implicit wifi : Wifi): Unit={
      println(s"User: $user connected to Wifi $wifi")

    }

 /* def atOffice(): Unit={
    println("-----at the office----")
    implicitly def officeNetWork: Wifi=new Wifi("office-network")
    val cafeteriaNetwork=new Wifi("cafe-connect")

    connectionToNetWork("gueset")(cafeteriaNetwork)
    connectionToNetWork("Jill Coder")
    connectionToNetWork("John Hacker")
  }*/


}



