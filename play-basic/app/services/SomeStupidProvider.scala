package services

/**
  * Created by hoppel on 23.02.17.
  */
trait StupidProvider {
  def stupid(): String
}

class SomeStupidProvider extends StupidProvider {
  override def stupid(): String = "it is stupid, isn't it!"
}
