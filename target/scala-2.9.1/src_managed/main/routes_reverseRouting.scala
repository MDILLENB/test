// @SOURCE:F:/app/play-2.0-beta/maps/conf/routes
// @HASH:addaaec86f30ea472c6fdd84680899f5d6cc5c90
// @DATE:Thu Feb 02 00:53:24 CET 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:12
// @LINE:8
// @LINE:6
package controllers {

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index() = {
   Call("GET", "/")
}
                                                        

                      
    
}
                            

// @LINE:12
class ReverseAssets {
    


 
// @LINE:12
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            

// @LINE:8
class ReverseGeo {
    


 
// @LINE:8
def mapOverlay() = {
   Call("GET", "/mapOverlay")
}
                                                        

                      
    
}
                            
}
                    


// @LINE:12
// @LINE:8
// @LINE:6
package controllers.javascript {

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:12
class ReverseAssets {
    


 
// @LINE:12
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:8
class ReverseGeo {
    


 
// @LINE:8
def mapOverlay = JavascriptReverseRoute(
   "controllers.Geo.mapOverlay",
   """
      function() {
      return _wA({method:"GET", url:"/mapOverlay"})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:12
// @LINE:8
// @LINE:6
package controllers.ref {

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              

                      
    
}
                            

// @LINE:12
class ReverseAssets {
    


 
// @LINE:12
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            

// @LINE:8
class ReverseGeo {
    


 
// @LINE:8
def mapOverlay() = new play.api.mvc.HandlerRef(
   controllers.Geo.mapOverlay(), HandlerDef(this, "controllers.Geo", "mapOverlay", Seq())
)
                              

                      
    
}
                            
}
                    
                