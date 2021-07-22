package com.avijeet.memeshare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // function to load meme
    private fun loadMeme(){
        val queue = Volley.newRequestQueue(this)
        val url = "https://meme-api.herokuapp.com/gimme"

        // Request a string response from the provided url
        val stringRequest = StringRequest(Request.Method.GET,url, Response.Listener <String>{ response ->

        },
            Response.ErrorListener {  })

        // add the rquest to the queue
        queue.add(stringRequest)
    }

    // function to get nextMeme
    fun nextMeme(view: View) {}


    // function to share meme
    fun shareMeme(view: View) {}
}