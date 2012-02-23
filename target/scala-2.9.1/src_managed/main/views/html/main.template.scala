
package views.html

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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[filters.SearchFilters,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(filterBy: filters.SearchFilters)(body: => Html):play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.50*/("""

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Where's Felipe?</title>
    <meta name="description" content="Where's Felipe 2?">
    <meta name="author" content="Felipe Oliveira">
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no" />

    <!-- Le HTML5 shim, for IE6-8 support of HTML elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
    
    <!-- Favicon -->
    <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq(/*18.55*/routes/*18.61*/.Assets.at("images/favicon.ico"))),format.raw/*18.93*/("""">

	<!-- Styles -->
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq(/*21.50*/routes/*21.56*/.Assets.at("stylesheets/main.css"))),format.raw/*21.90*/("""">
    
    <!-- JS -->
    <script type="text/javascript" src=""""),_display_(Seq(/*24.42*/routes/*24.48*/.Assets.at("javascripts/jquery-1.7.1.min.js"))),format.raw/*24.93*/(""""></script>
    <script type="text/javascript" src="http://maps.googleapis.com/maps/api/js?sensor=false&language=en&region=US"></script>
    <script type="text/javascript" src=""""),_display_(Seq(/*26.42*/routes/*26.48*/.Assets.at("javascripts/markerclusterer_compiled.js"))),format.raw/*26.101*/(""""></script>
    <script type="text/javascript" src=""""),_display_(Seq(/*27.42*/routes/*27.48*/.Assets.at("javascripts/livemap.js"))),format.raw/*27.84*/(""""></script>
  </head>

  <body>

    <div class="topbar">
       <div class="container-nav">
          <img src="http://geeks.aretotally.in/wp-content/uploads/2011/03/html5_geek_matt_32.png"> <a class="brand" href="/">Where's Felipe?</a>
          <ul class="nav">
            <li class="active"><a href="/">Home</a></li>
            <li><a href="http://geeks.aretotally.in">Blog</a></li>
            <li><a href="http://twitter.com/_felipera">Twitter</a></li>
          </ul>
       </div>
    </div>

    <div class="container-fluid">
		"""),_display_(Seq(/*44.4*/body)),format.raw/*44.8*/("""
    </div>

  </body>
</html>
"""))}
    }
    
    def render(filterBy:filters.SearchFilters,body:Html) = apply(filterBy)(body)
    
    def f:((filters.SearchFilters) => ( => Html) => play.api.templates.Html) = (filterBy) => (body) => apply(filterBy)(body)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Feb 02 00:52:50 CET 2012
                    SOURCE: F:/app/play-2.0-beta/maps/app/views/main.scala.html
                    HASH: 8b97d7968f08a984539a1df1b98025d1c03720c4
                    MATRIX: 524->1|644->49|1229->603|1244->609|1298->641|1399->711|1414->717|1470->751|1566->816|1581->822|1648->867|1857->1045|1872->1051|1948->1104|2032->1157|2047->1163|2105->1199|2675->1739|2700->1743
                    LINES: 19->1|22->1|39->18|39->18|39->18|42->21|42->21|42->21|45->24|45->24|45->24|47->26|47->26|47->26|48->27|48->27|48->27|65->44|65->44
                    -- GENERATED --
                */
            