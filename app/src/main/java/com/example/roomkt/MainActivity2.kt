package com.example.roomkt

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonArrayRequest
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.lang.Exception


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var x = ApiCalling()
        var v: ArrayList<String> = ArrayList()
        var rcy2 = findViewById<RecyclerView>(R.id.rcy2)
        rcy2.layoutManager = LinearLayoutManager(this)
        var adapter = ApiAdapter(v, this)
        rcy2.adapter = adapter
        // x.fetchdata(adapter, this)
        var context: Context = this
        x.fetchdata(adapter, context)

    }
    //In Android networking libraries, such as Volley, the callbacks (Response.Listener and Response.ErrorListener)
    // are typically invoked on the main thread by default.

    fun onItemClicked(currItem: String) {
        var intent = Intent(this, MainActivity::class.java)
        intent.putExtra("key", currItem)
        startActivity(intent)
    }
}