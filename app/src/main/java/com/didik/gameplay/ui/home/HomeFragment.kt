package com.didik.gameplay.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.airbnb.epoxy.Carousel
import com.didik.gameplay.databinding.FragmentHomeBinding
import com.didik.gameplay.domain.model.Game
import com.didik.gameplay.ui.moreGames.MoreGamesController

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val homeController = HomeController()
        binding.homeRecyclerView.setController(homeController)

        val popularGames = listOf(
            Game(
                id = 0,
                name = "eFootball PES 2021",
                genres = listOf(),
                rating = 4.5f
            ),
            Game(
                id = 1,
                name = "PUBG Mobile New State",
                genres = listOf("Battle Royale"),
                rating = 5.0f
            ),
            Game(
                id = 2,
                name = "Genshin Impact",
                genres = listOf("Adventure"),
                rating = 4.8f
            ),
            Game(
                id = 3,
                name = "Among US",
                genres = listOf("Multiplayer"),
                rating = 3.9f
            ),
            Game(
                id = 4,
                name = "Sausage Man",
                genres = listOf("Action"),
                rating = 4.0f
            ),
            Game(
                id = 5,
                name = "Call of Duty",
                genres = listOf("War"),
                rating = 4.7f
            ),
            Game(
                id = 6,
                name = "eFootball PES 2021",
                genres = listOf("Sports"),
                rating = 4.5f
            ),
            Game(
                id = 7,
                name = "PUBG Mobile New State",
                genres = listOf("Battle Royale"),
                rating = 5.0f
            ),
            Game(
                id = 8,
                name = "Genshin Impact",
                genres = listOf("Adventure"),
                rating = 4.8f
            ),
            Game(
                id = 9,
                name = "Among US",
                genres = listOf("Multiplayer"),
                rating = 3.9f
            ),
            Game(
                id = 10,
                name = "Sausage Man",
                genres = listOf("Action"),
                rating = 4.0f
            ),
            Game(
                id = 11,
                name = "Call of Duty",
                genres = listOf("War"),
                rating = 4.7f
            ),
            Game(
                id = 0,
                name = "eFootball PES 2021",
                genres = listOf("Sports"),
                rating = 4.5f
            ),
            Game(
                id = 1,
                name = "PUBG Mobile New State",
                genres = listOf("Battle Royale"),
                rating = 5.0f
            ),
            Game(
                id = 2,
                name = "Genshin Impact",
                genres = listOf("Adventure"),
                rating = 4.8f
            ),
            Game(
                id = 3,
                name = "Among US",
                genres = listOf("Multiplayer"),
                rating = 3.9f
            ),
            Game(
                id = 4,
                name = "Sausage Man",
                genres = listOf("Action"),
                rating = 4.0f
            ),
            Game(
                id = 5,
                name = "Call of Duty",
                genres = listOf("War"),
                rating = 4.7f
            ),
            Game(
                id = 6,
                name = "eFootball PES 2021",
                genres = listOf("Sports"),
                rating = 4.5f
            ),
            Game(
                id = 7,
                name = "PUBG Mobile New State",
                genres = listOf("Battle Royale"),
                rating = 5.0f
            ),
            Game(
                id = 8,
                name = "Genshin Impact",
                genres = listOf("Adventure"),
                rating = 4.8f
            ),
            Game(
                id = 9,
                name = "Among US",
                genres = listOf("Multiplayer"),
                rating = 3.9f
            ),
            Game(
                id = 10,
                name = "Sausage Man",
                genres = listOf("Action"),
                rating = 4.0f
            ),
            Game(
                id = 11,
                name = "Call of Duty",
                genres = listOf("War"),
                rating = 4.7f
            )
        )
        //homeController.topRatedGames = popularGames
        homeController.popularGames = popularGames
        homeController.newGames = popularGames
    }

}