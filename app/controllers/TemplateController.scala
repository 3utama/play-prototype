package controllers

import play.api._
import play.api.mvc._
import views.html.show

object TemplateController extends Controller {

  def show = Action {
    val list = List[String]("lemon", "mikan", "nanao")
    Ok(views.html.show("Hellow Scala Templates", list))
  }
  
}