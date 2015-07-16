

import javax.servlet.ServletContext

import org.scalatra._
class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {

    // Mount servlets.
    context.mount(new MainServlet, "/*")


  }
}
