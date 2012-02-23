
package views.html.tags

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object googlemaps extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[filters.SearchFilters,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(filterBy: filters.SearchFilters):play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.35*/("""

<div id="map_canvas"></div>"""))}
    }
    
    def render(filterBy:filters.SearchFilters) = apply(filterBy)
    
    def f:((filters.SearchFilters) => play.api.templates.Html) = (filterBy) => apply(filterBy)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Feb 02 00:52:50 CET 2012
                    SOURCE: F:/app/play-2.0-beta/maps/app/views/tags/googlemaps.scala.html
                    HASH: 0e1eee55a080438cad4741d76d5e3c2f01720f06
                    MATRIX: 530->1|635->34
                    LINES: 19->1|22->1
                    -- GENERATED --
                */
            