package com.didik.gameplay.ui.moreGames

import com.airbnb.epoxy.AsyncEpoxyController
import com.airbnb.paris.extensions.layoutMarginBottomDp
import com.airbnb.paris.extensions.style
import com.didik.gameplay.domain.model.Game
import com.didik.gameplay.ui.home.components.header

class MoreGamesController : AsyncEpoxyController() {

    var games: List<Game> = emptyList()
        set(value) {
            field = value
            requestModelBuild()
        }

    override fun buildModels() {
        header {
            id("popular_games")
            title("Popular Games")
            subtitle("Have fun with popular games")
            onBind { _, view, _ ->
                view.containerView.style {
                    layoutMarginBottomDp(20)
                }
            }
        }

        games.forEach { game ->
            smallSection {
                id(game.hashCode())
                name(game.name)
                genre(game.genres.first())
                rating(game.rating.toString())
                onBind { _, view, _ ->
                    view.containerView.style {
                        layoutMarginBottomDp(24)
                    }
                }
            }
        }
    }
}