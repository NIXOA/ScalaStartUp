package main.scala.test.util

/**
  * @Author yekai
  * @Date 2018/9/20 19:50
  */
class StringUtil {

  /**def关键字定义函数
    *StringTest方法名
    *小括号中为参数
    *Unit类似void  返回值为空
    * scala默认最后一条语句为返回值，自动进行推断
    */
  def StringTest(str1:String,str2:String): Unit ={
      if (str1 equals (str2))
           true
      else
           false
  }



}
