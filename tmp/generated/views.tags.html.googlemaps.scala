
                    package views.tags.html

                    import play.templates._
                    import play.templates.TemplateMagic._
                    import views.html._

                    object googlemaps extends BaseScalaTemplate[Html,Format[Html]](HtmlFormat) {

                        def apply/*1.2*/(filterBy: filters.SearchFilters):Html = {
                            try {
                                _display_ {

format.raw/*1.35*/("""

<div id="map_canvas"></div>""")}
                            } catch {
                                case e:TemplateExecutionError => throw e
                                case e => throw Reporter.toHumanException(e)
                            }
                        }

                    }

                
                /*
                    -- GENERATED --
                    DATE: Wed Feb 01 20:59:49 CET 2012
                    SOURCE: /app/views/tags/googlemaps.scala.html
                    HASH: 0e1eee55a080438cad4741d76d5e3c2f01720f06
                    MATRIX: 327->1|467->34
                    LINES: 10->1|14->1
                    -- GENERATED --
                */
            
