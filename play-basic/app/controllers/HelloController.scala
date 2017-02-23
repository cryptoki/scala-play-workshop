package controllers

import javax.inject.{Inject, Singleton}

import play.api.mvc.{Action, Controller}
import services.{MessageService, StupidProvider}

/**
  * This controller creates an `Action` to handle HTTP requests to the
  * application's home page.
  */
class HelloController @Inject() (messageService: MessageService, stupidProvider: StupidProvider) extends Controller {

  /**
    * Create an Action to render an HTML page with a welcome message.
    * The configuration in the `routes` file means that this method
    * will be called when the application receives a `GET` request with
    * a path of `/`.
    */
  def index = Action {
    Ok(views.html.index("hello world! ;-)"))
  }

  def another = Action {
    Ok(views.html.index(messageService.reply("hello world! ;-)")))
  }

  def stupid = Action {
    Ok(views.html.index(stupidProvider.stupid()))
  }
}