package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import models._

object UserController extends Controller {

  /** Form定義 */
  val userForm = Form(
      mapping(
          "name" -> nonEmptyText,
          "email" -> email)(User.apply)(User.unapply))
  /** initial screen function */
  def entryInit = Action {
    val filledForm = userForm.fill(User("user name", "email address"))
    Ok(views.html.user.entry(filledForm))
  }

  /** function for registration user */
  def entrySubmit = Action { implicit request =>
    userForm.bindFromRequest.fold(
      errors => {
        println("error")
        BadRequest(views.html.user.entry(errors))
      },
      success => {
        println("success")
        val user = userForm.bindFromRequest.get
        println("UserName:" + user.name)
        println("MailAddress:" + user.email)
        Ok(views.html.user.entrySubmit())
      }
    )
  }


}
