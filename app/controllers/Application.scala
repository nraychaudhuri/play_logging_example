package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    val log = org.slf4j.LoggerFactory.getLogger("logging.Appender")
    log.info("hey there")
    log.debug("hey there in debug mode")
    Ok(views.html.index("Your new application is ready."))
  }
  
}