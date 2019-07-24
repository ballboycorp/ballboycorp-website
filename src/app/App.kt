package app

import react.*
import react.dom.*
import logo.*
import ticker.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("App-header") {
            logo()
            h2 {
                +"BallBoy Corp."
            }
        }
        p("App-intro") {
            +"Under development"
        }
    }
}

fun RBuilder.app() = child(App::class) {}
