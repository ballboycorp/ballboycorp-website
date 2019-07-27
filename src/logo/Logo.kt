package logo

import react.*
import react.dom.*
import kotlinext.js.*
import kotlinx.css.*
import kotlinx.html.style
import styled.css
import styled.styledDiv
import styled.styledImg

@JsModule("src/logo/ballboy-logo-simple.png")
external val ballboyLogo: dynamic

fun RBuilder.logo() {
    styledDiv {
        styledImg(src = ballboyLogo) {
            css {
                height = 34.px
                width = 100.px
                color = Color.transparent
                position = Position.absolute
                top = 27.px
                left =  36.px
                zIndex = 999
            }
        }
    }
}
