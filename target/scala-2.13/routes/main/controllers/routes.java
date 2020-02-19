// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/vtahelya/Workspace/Projects/playframework-docker-image/play-java-rest-api-example/conf/routes
// @DATE:Wed Feb 19 21:20:03 IST 2020

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
  }

}
