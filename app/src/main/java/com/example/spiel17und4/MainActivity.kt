package com.example.spiel17und4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private val gameViewmodel : Game17Und4ViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun drawCardClick(v : View) {
        if(!gameViewmodel.checkGameOver()){
            val drawnCard = gameViewmodel.drawNewCard()
            tv_drawncard.text = drawnCard.cardVal.toString()
            tv_sum.text = gameViewmodel.sum.toString()
            tv_drawncardname.text = getString(R.string.card_drawnNameText,translateCardColorToStringResource(drawnCard.color), translateEnumToStringResource(drawnCard.cardName) )
            when (gameViewmodel.gameState) {
                2   ->    tv_gameResult.text = getText(R.string.winMessage)
                0   ->    tv_gameResult.text = getText(R.string.surrenderMessage)
                -1  ->   tv_gameResult.text = getText(R.string.looseMessage)
            }
        }
    }

    fun surrender(v : View) {
        gameViewmodel.gameState = 0
        tv_gameResult.text = getText(R.string.surrenderMessage)
    }

    fun newGame(v : View) {
        gameViewmodel.newGame()
        tv_drawncard.text = ""
        tv_sum.text = ""
        tv_gameResult.text = getText(R.string.btn_newGame)
    }

    private fun translateEnumToStringResource(value : String) : CharSequence {
       return when(value) {
            "NULL" ->  getText(R.string.NULL)
            "Two" ->  getText(R.string.Two)
            "Three" ->  getText(R.string.Three)
            "Four" ->  getText(R.string.Four)
            "Five" ->  getText(R.string.Five)
            "Six" ->  getText(R.string.Six)
            "Seven" ->  getText(R.string.Seven)
            "Eight" ->  getText(R.string.Eight)
            "Nine" ->  getText(R.string.Nine)
            "Ten" ->  getText(R.string.Ten)
            "Jack" ->  getText(R.string.Jack)
            "Lady" ->  getText(R.string.Lady)
            "King" ->  getText(R.string.King)
            "Ass" ->  getText(R.string.Ass)
            else ->  "no match"
        }
    }

  private fun translateCardColorToStringResource(value : String) : CharSequence {
      return when(value){
          "Heart" -> getText(R.string.Heart)
          "Tiles" -> getText(R.string.Tiles)
          "Clovers" -> getText(R.string.Clovers)
          "Pikes" -> getText(R.string.Pikes)
          else -> "no match"
      }
    }

}

