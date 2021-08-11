package com.didik.gameplay.ui.home

import com.airbnb.epoxy.AsyncEpoxyController
import com.airbnb.epoxy.Carousel
import com.airbnb.epoxy.carousel
import com.airbnb.paris.extensions.layoutMarginBottomDp
import com.airbnb.paris.extensions.layoutMarginEnd
import com.airbnb.paris.extensions.layoutMarginEndDp
import com.airbnb.paris.extensions.style
import com.didik.gameplay.domain.model.Game
import com.didik.gameplay.ui.home.components.MediumSectionModel.PosterSize
import com.didik.gameplay.ui.home.components.MediumSectionModel_
import com.didik.gameplay.ui.home.components.header
import com.didik.gameplay.ui.home.components.shimmerHome

class HomeController : AsyncEpoxyController() {

    var topRatedGames: List<Game> = emptyList()
        set(value) {
            field = value
            requestModelBuild()
        }

    var popularGames: List<Game> = emptyList()
        set(value) {
            field = value
            requestModelBuild()
        }

    var newGames: List<Game> = emptyList()
        set(value) {
            field = value
            requestModelBuild()
        }

    override fun buildModels() {
        if (topRatedGames.isNotEmpty()) {
            renderTopRatedGames()
        } else {
            renderTopRatedLoading()
        }

        if (popularGames.isNotEmpty()) {
            renderPopularGames()
        } else {
            renderPopularLoading()
        }

        if (newGames.isNotEmpty()) {
            renderNewGames()
        } else {
            renderNewGamesLoading()
        }
    }

    private fun renderTopRatedGames() {
        header {
            id(TOP_RATED_HEADER_ID)
            title("Top Rated Games")
            subtitle("Play top rated games for you")
            onSeeMoreClickListener {}
        }

        createCarousel(
            carouselId = TOP_RATED_CAROUSEL_ID,
            games = topRatedGames,
            posterSize = PosterSize.LARGE
        )
    }

    private fun renderTopRatedLoading() {
        shimmerHome {
            id("top_rated_shimmer")
            onBind { _, view, _ ->
                view.containerShimmer.style {
                    layoutMarginEndDp(-20)
                    layoutMarginBottomDp(32)
                }
            }
        }
    }

    private fun renderPopularGames() {
        header {
            id(POPULAR_HEADER_ID)
            title("Popular Games")
            onSeeMoreClickListener {}
        }

        createCarousel(
            carouselId = POPULAR_CAROUSEL_ID,
            games = popularGames,
        )
    }

    private fun renderPopularLoading() {
        // TODO
    }

    private fun renderNewGames() {
        header {
            id(NEW_HEADER_ID)
            title("New Games")
            subtitle("Fresh selection games everyday")
            onSeeMoreClickListener {}
        }

        createCarousel(
            carouselId = NEW_CAROUSEL_ID,
            games = newGames,
        )
    }

    private fun renderNewGamesLoading() {
        // TODO
    }

    private fun createCarousel(
        carouselId: String,
        games: List<Game>,
        posterSize: PosterSize = PosterSize.MEDIUM
    ) {
        val models = games.map { game ->
            MediumSectionModel_()
                .id(game.hashCode())
                .posterSize(posterSize)
                .name(game.name)
                .genre(game.genres.firstOrNull() ?: "Unknown")
                .rating(game.rating.toString())
        }
        carousel {
            id(carouselId)
            padding(Carousel.Padding.dp(0, 12, 0, 32, 12))
            models(models)
        }
    }

    companion object {
        private const val TOP_RATED_HEADER_ID = "top_rated_header"
        private const val TOP_RATED_CAROUSEL_ID = "top_rated_carousel"
        private const val POPULAR_HEADER_ID = "popular_header"
        private const val POPULAR_CAROUSEL_ID = "popular_carousel"
        private const val NEW_HEADER_ID = "new_header"
        private const val NEW_CAROUSEL_ID = "new_carousel"
    }
}