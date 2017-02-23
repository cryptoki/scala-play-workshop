package controllers

import controllers.RestController.{CreateMessage, Message}
import play.api.libs.json.{JsSuccess, Json}
import play.api.mvc.{Action, Controller}

class RestController extends Controller {
  def create = Action { implicit request =>
    request.body.asJson.map(_.validate[CreateMessage]) match {
      case Some(JsSuccess(createMessage: CreateMessage, _)) =>
        Created(Message(1, createMessage.message))
      case _ =>
        BadRequest
    }
  }

  def get = Action {
    Ok(Message(1, "bla"))
  }
}

object RestController {
  case class CreateMessage(message: String)
  case class Message(id: Int, message: String)
  object CreateMessage {
    implicit val messageWrites = Json.writes[Message]
    implicit val messageReads = Json.reads[Message]
  }
  object Message {
    implicit val messageWrites = Json.writes[Message]
    implicit val messageReads = Json.reads[Message]
  }
}
