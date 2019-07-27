package contact

import kotlinx.css.*
import kotlinx.html.js.onClickFunction
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.button
import styled.css
import styled.styledDiv
import styled.styledH1
import styled.styledP

class Contact: RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        styledH1 {
            css {
                color = Color.white
            }
            +"Contact Us"
        }
    }

}

fun RBuilder.contactNav() {
    styledDiv {
        css {
            top = 27.px
            right =  36.px
            position = Position.absolute
        }
        styledP {
            css {
                color = Color.white
            }
            css.hover {
                opacity = .8
            }
            attrs.apply {
                onClickFunction = {
                    // redirect to contact page
                }
            }
            +"Contact Us"
        }
    }
}