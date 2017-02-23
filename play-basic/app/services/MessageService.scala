package services

import java.util.concurrent.atomic.AtomicInteger
import javax.inject.Singleton

@Singleton
class MessageService {
  val counter = new AtomicInteger

  def reply(message: String) = s"$message [the ${counter.getAndIncrement()} times]"
}
