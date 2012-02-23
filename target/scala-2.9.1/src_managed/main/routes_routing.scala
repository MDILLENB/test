// @SOURCE:F:/app/play-2.0-beta/maps/conf/routes
// @HASH:addaaec86f30ea472c6fdd84680899f5d6cc5c90
// @DATE:Thu Feb 02 00:53:24 CET 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:8
val controllers_Geo_mapOverlay1 = Route("GET", PathPattern(List(StaticPart("/mapOverlay"))))
                    

// @LINE:12
val controllers_Assets_at2 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.index()"""),("""GET""","""/mapOverlay""","""controllers.Geo.mapOverlay()"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:8
case controllers_Geo_mapOverlay1(params) => {
   call { 
        invokeHandler(_root_.controllers.Geo.mapOverlay(), HandlerDef(this, "controllers.Geo", "mapOverlay", Nil))
   }
}
                    

// @LINE:12
case controllers_Assets_at2(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                