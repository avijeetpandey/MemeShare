package com.avijeet.memeshare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadMeme()
    }

    // function to load meme
    private fun loadMeme(){
        val queue = Volley.newRequestQueue(this)
        val url = "https://meme-api.herokuapp.com/gimme"

        // Request a string response from the provided url
        val jsonObjectRequest = JsonObjectRequest(
            Request.Method.GET,
            url,null,
            { response ->
                val url = response.getString("url")
                Glide.with(this).load(url).into(memeImage)
            },
            {  })

        // add the request to the queue
        queue.add(jsonObjectRequest)
    }

    // function to get nextMeme
    fun nextMeme(view: View) {
        loadMeme()
    }


    // function to share meme
    fun shareMeme(view: View) {

    }
}