package main.scala.workingwthobject

import scala.collection.mutable

/**
  * scala独立对象和伴生对象
 *
  * @Author yekai
  * @Date 2018/11/8 20:09
  */
class Marker private(val color:String){

  println(s"Creating $this")

  override def toString: String = s"marker color ${color}"

  object Marker{
   private val markers = mutable.Map(
     "red"->new Marker("red"),
     "blue"->new Marker("blue"),
     "yellow"->new Marker("yellow"))

    def getMarker(color:String):Marker={
      markers.getOrElseUpdate(color,new Marker(color))
    }

    println(Marker getMarker("blue"))
    println(Marker getMarker("blue"))
    println(Marker getMarker("red"))
    println(Marker getMarker("red"))
    println(Marker getMarker("green"))
  }

}
