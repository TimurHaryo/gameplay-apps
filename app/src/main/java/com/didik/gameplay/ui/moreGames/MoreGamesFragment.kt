package com.didik.gameplay.ui.moreGames

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.didik.gameplay.databinding.FragmentMoreGamesBinding
import com.didik.gameplay.domain.model.Game

class MoreGamesFragment : Fragment() {

    private lateinit var binding: FragmentMoreGamesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMoreGamesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val homeController = MoreGamesController()
        binding.moreGamesRecyclerView.setController(homeController)

        val popularGames = listOf(
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
        homeController.games = popularGames
    }
}