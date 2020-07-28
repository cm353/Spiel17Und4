package com.example.spiel17und4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private val gameViewmodel : Game17Und4ViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
            updateUI()
        Log.d("TAG", "onRestoreInstanceState: gamestate = ${gameViewmodel.gameState}")
    }

    fun updateUI(){
        if(gameViewmodel.numberOfDrawnCards != 0) {
            tv_drawncard.text = gameViewmodel.card.cardVal.toString()
            tv_sum.text = gameViewmodel.sum.toString()
            tv_drawncardname.text = getString(
                R.string.card_drawnNameText,
                translateCardColorToStringResource(gameViewmodel.card.color),
                translateEnumToStringResource(gameViewmodel.card.cardName)
            )
            when (gameViewmodel.gameState) {
                2 -> tv_gameResult.text = getText(R.string.winMessage)
                0 -> tv_gameResult.text = getText(R.string.surrenderMessage)
                -1 -> tv_gameResult.text = getText(R.string.looseMessage)
            }
        }
    }

    fun drawCardClick(v : View) {
        gameViewmodel.drawNewCard()
        updateUI()
    }

    fun surrender(v : View) {
        gameViewmodel.surrender()
        tv_gameResult.text = getText(R.string.surrenderMessage)
    }

    fun newGame(v : View) {
        gameViewmodel.newGame()
        tv_drawncard.text = ""
        tv_sum.text = ""
        tv_gameResult.text = ""
        Toast.makeText(this,getText(R.string.btn_newGame),Toast.LENGTH_SHORT).show()
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

