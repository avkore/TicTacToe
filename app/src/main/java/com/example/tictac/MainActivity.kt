package com.example.tictac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


private var isPlayerOne = true
val listButton = arrayListOf<Button>()

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init() }

     private fun init(){
        button00.setOnClickListener {
            playerChanger(button00) }
        button01.setOnClickListener {
            playerChanger(button01) }
        button02.setOnClickListener {
            playerChanger(button02) }
        button10.setOnClickListener {
            playerChanger(button10) }
        button11.setOnClickListener {
            playerChanger(button11) }
        button12.setOnClickListener {
            playerChanger(button12) }
        button20.setOnClickListener {
            playerChanger(button20) }
        button21.setOnClickListener {
            playerChanger(button21) }
        button22.setOnClickListener {
          playerChanger(button22) }
         button_try.setOnClickListener {
             newGame(button00)
             newGame(button01)
             newGame(button02)
             newGame(button10)
             newGame(button11)
             newGame(button12)
             newGame(button20)
             newGame(button21)
             newGame(button22)
         }

    }

    private fun playerChanger(button: Button){
        if(isPlayerOne)
            button.text = "X"
        else
            button.text = "O"
        button.isClickable = false
        isPlayerOne = !isPlayerOne
        winCheck()

    }
    private fun winCheck(){
        if (button00.text.toString().isNotEmpty() && button00.text.toString() == button01.text.toString() && button01.text.toString() == button02.text.toString())
            showToast(button00.text.toString())
        if (button10.text.toString().isNotEmpty() && button10.text.toString() == button11.text.toString() && button11.text.toString() == button12.text.toString())
            showToast(button10.text.toString())
        if (button20.text.toString().isNotEmpty() && button20.text.toString() == button21.text.toString() && button21.text.toString() == button22.text.toString())
            showToast(button20.text.toString())
        if (button00.text.toString().isNotEmpty() && button00.text.toString() == button10.text.toString() && button10.text.toString() == button20.text.toString())
            showToast(button00.text.toString())
        if (button01.text.toString().isNotEmpty() && button01.text.toString() == button11.text.toString() && button11.text.toString() == button21.text.toString())
            showToast(button01.text.toString())
        if (button02.text.toString().isNotEmpty() && button02.text.toString() == button12.text.toString() && button12.text.toString() == button22.text.toString())
            showToast(button02.text.toString())
        if (button00.text.toString().isNotEmpty() && button00.text.toString() == button11.text.toString() && button11.text.toString() == button22.text.toString())
            showToast(button00.text.toString())
        if (button20.text.toString().isNotEmpty() && button20.text.toString() == button11.text.toString() && button11.text.toString() == button02.text.toString())
            showToast(button20.text.toString())
        if (button20.text.toString().isNotEmpty() && button21.text.toString().isNotEmpty() && button22.text.toString().isNotEmpty() && button00.text.toString().isNotEmpty() && button01.text.toString().isNotEmpty() && button02.text.toString().isNotEmpty() && button10.text.toString().isNotEmpty() && button11.text.toString().isNotEmpty() && button12.text.toString().isNotEmpty())
            Toast.makeText(this, "it is Tie", Toast.LENGTH_SHORT).show()


    }
    private fun showToast(message: String){
        Toast.makeText(this, "Winner is $message", Toast.LENGTH_SHORT).show()
        clicking()
    }
    private fun newGame(button: Button){
        button.text =  ""
        button.isClickable = true
    }
    private fun clicking(){
        if(listButton.isEmpty()){
            button00.isClickable = false
            button01.isClickable = false
            button02.isClickable = false
            button10.isClickable = false
            button11.isClickable = false
            button12.isClickable = false
            button20.isClickable = false
            button21.isClickable = false
            button22.isClickable = false
        }
    }

}




