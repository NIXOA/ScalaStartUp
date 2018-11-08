package main.scala.workingwthobject

/**
  * 参数化类型
  * @Author yekai
  * @Date 2018/11/8 19:46
  */
class Parameterized {
   def echo[T](input1:T,input2:T): Unit ={
     println(s"got  $input1(${input1.getClass}) $input2 (${input2.getClass})")
   }

  echo("hello","there")
  echo(1,5)
}
