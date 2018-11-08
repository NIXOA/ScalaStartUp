package main.scala.workingwthobject

/**
  * @Author yekai
  * @Date 2018/11/6 20:19
  */
class Veichle(val id:Int,val year: Int) {
  override def toString: String = s"ID: $id Year: $year"
}

/*class Car(override val id: Int, override val year: Int,var fullLevel : Int)extends Veichle(id,year){
  override def toString: String = s"${super.toString} Fuel Level: $fullLevel"
  var car=new Car(100,2015,100)
  println(car)

}*/
