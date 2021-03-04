package controllers

import javax.inject._

import play.api.mvc._

@Singleton
class CompletedTasks @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def taskList = Action {
    val tasks = List("Created a new controller", "Added a new twirl template", "Connected a new route for the new controller to render the new twirl template")
      Ok(views.html.TaskList(tasks))
  }

}
