package com.example.sellbuy

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val show_video = findViewById(R.id.ShowVideo) as TextView
        show_video.setOnClickListener{
            //Toast.makeText(this, "You clicked", Toast.LENGTH_LONG).show()
            val intent = Intent(this, VideoRecycler::class.java)
            startActivity(intent)
        }

        val show_youtube_api_video = findViewById<TextView>(R.id.ShowYoutubeVideo)
        show_youtube_api_video.setOnClickListener{
            val videoIntent = Intent(this, VideoRecyclerApi::class.java)
            startActivity(videoIntent)
        }


    }
}
