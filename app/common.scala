import play.api.Application
import play.api.GlobalSettings
import play.api.Logger

object Global extends GlobalSettings {

  override def onStart(app: Application) {

    Logger.info("Application has started for " + app.mode + "mode.")

    app.mode.toString() match {

      case "Prod" => Logger.info("Prod mode.")

      case "Dev" => Logger.info("Dev mode.")

      case "Test" => Logger.info("Test mode.")

      case _ => Logger.info("Unknown mode.")
    }
  }

  override def onStop(app: Application) {

    Logger.info("Application shutdown...")
  }
}