package app

import contact.contactNav
import kotlinx.css.*
import kotlinx.html.style
import react.*
import react.dom.*
import logo.*
import styled.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("container") {
            logo()
            contactNav()

            styledDiv {
                css {
                    paddingTop = 225.px
                }
                div("row") {
                    div("col-1") { }
                    div("col-6 text-left") {
                        styledH2 {
                            css {
                                color = Color.white
                            }
                            +"BallBoy Corp."
                        }
                        styledP {
                            css {
                                paddingTop = 20.px
                                color = Color.white
                                opacity = .9
                            }
                            +"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
                        }
                    }
                }
            }
        }
    }
}

fun RBuilder.wrapper() {
    styledDiv {
        css {
            paddingLeft = 135.px
            paddingTop = 225.px
            paddingBottom = 200.px
            position = Position.relative
            boxSizing = BoxSizing.borderBox
        }
        textContainer()
    }
}

fun RBuilder.textContainer() {
    styledDiv {
        css {
            maxWidth = 600.px
            paddingRight = 50.px
        }

        styledH1 {
            css {
                color = Color.white
            }
            +"BallBoy Corp."
        }
    }
}

fun RBuilder.app() = child(App::class) {}
