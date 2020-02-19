// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/vtahelya/Workspace/Projects/playframework-docker-image/play-java-rest-api-example/conf/posts.routes
// @DATE:Wed Feb 19 21:20:03 IST 2020


package posts {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
