package com.calcuate.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() , View.OnClickListener{
    lateinit var btnStart: Button
    lateinit var btnReset: Button
    lateinit var imageView1: ImageView
    lateinit var imageView2: ImageView
    lateinit var imageView3: ImageView
    lateinit var imageView4: ImageView
    lateinit var imageView5: ImageView
    lateinit var imageView6: ImageView
    lateinit var imageView7: ImageView
    lateinit var imageView8: ImageView
    lateinit var imageView9: ImageView
    lateinit var listImageView:MutableList<ImageView>
    lateinit var listTypeSymbol:List<Int>
    lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStart = findViewById(R.id.btn_start)
        btnReset = findViewById(R.id.btn_reset)

        imageView1 = findViewById(R.id.imageView1)
        imageView2 = findViewById(R.id.imageView2)
        imageView3 = findViewById(R.id.imageView3)
        imageView4 = findViewById(R.id.imageView4)
        imageView5 = findViewById(R.id.imageView5)
        imageView6 = findViewById(R.id.imageView6)
        imageView7 = findViewById(R.id.imageView7)
        imageView8 = findViewById(R.id.imageView8)
        imageView9 = findViewById(R.id.imageView9)
        imageView = findViewById(R.id.imageView)

        listImageView = mutableListOf(imageView1,imageView2,imageView3,imageView4,imageView5,
            imageView6,imageView7,imageView8,imageView9)
        listTypeSymbol = listOf(1,2)
        btnStart.setOnClickListener(this)
        btnReset.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        var count = 0


        when(view.id){
            btnStart.id ->{
                val listChecked:MutableList<ImageView> = mutableListOf()
                while (count < 9){
                    val randomImageView = listImageView.random()
                    val randomType = listTypeSymbol.random()


                    when(randomType) {
                       1 ->    {randomImageView.setBackgroundResource(R.drawable.iks)
                           listChecked.add(randomImageView)
                       listImageView.remove(randomImageView)

                       }
                        2 -> {randomImageView.setBackgroundResource(R.drawable.noll)
                            listChecked.add(randomImageView)
                            listImageView.remove(randomImageView)
                            }
                    }
                    count++

                }
                listImageView = mutableListOf(imageView1,imageView2,imageView3,imageView4,
                                            imageView5,imageView6,imageView7,imageView8,imageView9)
            }
            btnReset.id -> { for (i in listImageView.indices)
                listImageView[i].setBackgroundResource(R.color.colorWhite)

            }
        }
    }
}