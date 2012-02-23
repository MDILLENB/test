
package views.html.Application

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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[filters.SearchFilters,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(filterBy: filters.SearchFilters):play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.35*/("""

"""),_display_(Seq(/*3.2*/main(filterBy)/*3.16*/ {_display_(Seq(format.raw/*3.18*/("""

	<div class="column-l">
		"""),_display_(Seq(/*6.4*/views/*6.9*/.html.tags.googlemaps(filterBy))),format.raw/*6.40*/("""
	</div>

""")))})))}
    }
    
    def render(filterBy:filters.SearchFilters) = apply(filterBy)
    
    def f:((filters.SearchFilters) => play.api.templates.Html) = (filterBy) => apply(filterBy)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Feb 02 00:52:50 CET 2012
                    SOURCE: F:/app/play-2.0-beta/maps/app/views/Application/index.scala.html
                    HASH: c54081646f1b9fb4281747881edc8be64bcd28a3
                    MATRIX: 532->1|637->34|669->37|691->51|725->53|783->82|795->87|847->118
                    LINES: 19->1|22->1|24->3|24->3|24->3|27->6|27->6|27->6
                    -- GENERATED --
                */
            