package com.example.spiel17und4

import androidx.lifecycle.ViewModel
import java.util.*

class Game17Und4ViewModel : ViewModel() {

    private val randomGenerator = Random()
    var sum : Int = 0
    var gameState : Int = 0
    private var numberOfDrawnCards = 0
    private lateinit var cards : Array<FrenchCards>

    fun drawNewCard() : FrenchCards {
        if(numberOfDrawnCards==0) newGame()
        var card: FrenchCards
        do {
            val cardIndex = randomGenerator.nextInt(cards.size)
            card = cards[cardIndex]
            cards[cardIndex] = FrenchCards.NULLCARD
        } while (card.cardVal == 0)
        sum += card.cardVal
        changeGameState()
        numberOfDrawnCards++
        return card
    }

    private fun changeGameState()  {
        gameState = if(sum<22) {
            if(sum==21) 2 // game won
            else if(sum>19) 0 // surrendered
            else 1 // game still running
        }else {
            -1 // game lost
        }
    }

    fun checkGameOver() : Boolean {
        return !((gameState > 0 && gameState != 2) || numberOfDrawnCards == 0)
    }

    fun newGame(){
        cards = FrenchCards.arrayOfCards()
        sum = 0
        gameState = 1
        numberOfDrawnCards = 0
    }
}