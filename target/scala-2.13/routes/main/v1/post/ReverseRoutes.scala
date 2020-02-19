// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/vtahelya/Workspace/Projects/playframework-docker-image/play-java-rest-api-example/conf/posts.routes
// @DATE:Wed Feb 19 21:20:03 IST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:2
package v1.post {

  // @LINE:2
  class ReversePostController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def update(id:String): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:2
    def list(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:5
    def show(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:3
    def create(): Call = {
      
      Call("POST", _prefix)
    }
  
  }


}
