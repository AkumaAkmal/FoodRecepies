package com.example.foodrecepies

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {
    var TAG:String = "main Activity"
    var random_number:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //button click listener
        collected_btn.setOnClickListener {
            startActivity(Intent(this, Collected()::class.java))

        }

        //button click listener
        discover_btn.setOnClickListener {
            startActivity(Intent(this, Collected()::class.java))

        }
        //button click listener
        add_btn.setOnClickListener {
            startActivity(Intent(this, Collected()::class.java))

        }
        //button click listener
        random_btn.setOnClickListener {
            startActivity(Intent(this, Collected()::class.java))

        }


        suprize_me_btn.setOnClickListener {



            random_number = (1..5).random()

            when (random_number) {
                1 -> {
                    suprize_me_btn.setImageResource(R.drawable.ayam_goreng)

                }
                2 -> {
                    suprize_me_btn.setImageResource(R.drawable.ayam_kari)

                }
                3 -> {
                    suprize_me_btn.setImageResource(R.drawable.ikan_goreng)

                }
                4 -> {
                    suprize_me_btn.setImageResource(R.drawable.daging_merah)

                }
                5 -> {
                    suprize_me_btn.setImageResource(R.drawable.sup_sayur)

                }

            }

            //show the random number in our log
            Log.e(TAG,random_number.toString())


        }
    }

}