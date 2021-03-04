package controllers

import javax.inject._

import shared.SharedMessages
import play.api.mvc._

@Singleton
class PlayTest @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def test = Action {
    Ok(views.html.PlayTest(SharedMessages.testMessage))
  }

}
