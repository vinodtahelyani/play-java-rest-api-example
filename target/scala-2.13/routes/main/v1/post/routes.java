// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/vtahelya/Workspace/Projects/playframework-docker-image/play-java-rest-api-example/conf/posts.routes
// @DATE:Wed Feb 19 21:20:03 IST 2020

package v1.post;

import posts.RoutesPrefix;

public class routes {
  
  public static final v1.post.ReversePostController PostController = new v1.post.ReversePostController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final v1.post.javascript.ReversePostController PostController = new v1.post.javascript.ReversePostController(RoutesPrefix.byNamePrefix());
  }

}
