package controllers

import play.api._
import play.api.db._
import play.api.mvc._
import play.api.Play.current

object SampleController1 extends Controller {

  def sample1 = Action {
    Ok(views.html.index("Hellow Scala!"))
    Ok(views.html.index("some body else!"))
  }

  DB.withConnection { implicit conn =>

  }

}