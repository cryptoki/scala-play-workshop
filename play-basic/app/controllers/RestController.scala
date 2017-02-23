package controllers

import com.google.inject.Inject
import play.api.libs.json.{JsSuccess, Json}
import play.api.mvc.{Action, Controller}

class RestController @Inject() extends Controller {
  case class CreateMyMessage(message: String)
  case class MyMessage(id: Int, message: String)

  implicit val createMyMessageReads = Json.reads[CreateMyMessage]
  implicit val myMessageWrites = Json.writes[MyMessage]


  def create = Action { implicit request =>
    request.body.asJson.map(_.validate[CreateMyMessage]) match {
      case Some(JsSuccess(createMessage: CreateMyMessage, _)) =>
        Created(Json.toJson(MyMessage(1, createMessage.message)))
      case _ =>
        BadRequest
    }
  }

  def get(id: Int) = Action {
    Ok(Json.toJson(MyMessage(id, "bla")))
  }
}
