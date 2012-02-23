
                    package views.Application.html

                    import play.templates._
                    import play.templates.TemplateMagic._
                    import views.html._

                    object index extends BaseScalaTemplate[Html,Format[Html]](HtmlFormat) {

                        def apply/*1.2*/(filterBy: filters.SearchFilters):Html = {
                            try {
                                _display_ {

format.raw/*1.35*/("""

""")+_display_(/*3.2*/main(filterBy)/*3.16*/ {format.raw/*3.18*/("""

	<div class="column-l">
		""")+_display_(/*6.4*/views/*6.9*/.html.tags.googlemaps(filterBy))+format.raw/*6.40*/("""
	</div>

""")})}
                            } catch {
                                case e:TemplateExecutionError => throw e
                                case e => throw Reporter.toHumanException(e)
                            }
                        }

                    }

                
                /*
                    -- GENERATED --
                    DATE: Wed Feb 01 20:59:49 CET 2012
                    SOURCE: /app/views/Application/index.scala.html
                    HASH: c54081646f1b9fb4281747881edc8be64bcd28a3
                    MATRIX: 329->1|469->34|497->37|519->51|539->53|593->82|605->87|656->118
                    LINES: 10->1|14->1|16->3|16->3|16->3|19->6|19->6|19->6
                    -- GENERATED --
                */
            
