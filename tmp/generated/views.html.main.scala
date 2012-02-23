
                    package views.html

                    import play.templates._
                    import play.templates.TemplateMagic._
                    import views.html._

                    object main extends BaseScalaTemplate[Html,Format[Html]](HtmlFormat) {

                        def apply/*1.2*/(filterBy: filters.SearchFilters)(body: => Html):Html = {
                            try {
                                _display_ {

format.raw/*1.50*/("""

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
    <link rel="shortcut icon" type="image/png" href="""")+_display_(/*18.55*/routes/*18.61*/.Assets.at("images/favicon.ico"))+format.raw/*18.93*/("""">

	<!-- Styles -->
    <link rel="stylesheet" media="screen" href="""")+_display_(/*21.50*/routes/*21.56*/.Assets.at("stylesheets/main.css"))+format.raw/*21.90*/("""">
    
    <!-- JS -->
    <script type="text/javascript" src="""")+_display_(/*24.42*/routes/*24.48*/.Assets.at("javascripts/jquery-1.7.1.min.js"))+format.raw/*24.93*/(""""></script>
    <script type="text/javascript" src="http://maps.googleapis.com/maps/api/js?sensor=false&language=en&region=US"></script>
    <script type="text/javascript" src="""")+_display_(/*26.42*/routes/*26.48*/.Assets.at("javascripts/markerclusterer_compiled.js"))+format.raw/*26.101*/(""""></script>
    <script type="text/javascript" src="""")+_display_(/*27.42*/routes/*27.48*/.Assets.at("javascripts/livemap.js"))+format.raw/*27.84*/(""""></script>
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
		""")+_display_(/*44.4*/body)+format.raw/*44.8*/("""
    </div>

  </body>
</html>
""")}
                            } catch {
                                case e:TemplateExecutionError => throw e
                                case e => throw Reporter.toHumanException(e)
                            }
                        }

                    }

                
                /*
                    -- GENERATED --
                    DATE: Wed Feb 01 20:59:49 CET 2012
                    SOURCE: /app/views/main.scala.html
                    HASH: 8b97d7968f08a984539a1df1b98025d1c03720c4
                    MATRIX: 316->1|471->49|1052->603|1067->609|1120->641|1217->711|1232->717|1287->751|1379->816|1394->822|1460->867|1665->1045|1680->1051|1755->1104|1835->1157|1850->1163|1907->1199|2473->1739|2497->1743
                    LINES: 10->1|14->1|31->18|31->18|31->18|34->21|34->21|34->21|37->24|37->24|37->24|39->26|39->26|39->26|40->27|40->27|40->27|57->44|57->44
                    -- GENERATED --
                */
            
