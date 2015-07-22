package $ {
package

}

import org.scalatra.ScalatraServlet
import org.scalatra.scalate.ScalateSupport


class MainServlet extends ScalatraServlet with ScalateSupport {
  before() {
    contentType = "text/html"
  }

  get("/") {
    layoutTemplate("/WEB-INF/templates/views/index.ssp")
  }
}