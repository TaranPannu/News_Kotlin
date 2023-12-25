package com.example.roomkt

import android.content.Context
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonArrayRequest
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ApiCalling {
    fun fetchdata(adapter: ApiAdapter, context: Context) {
        GlobalScope.launch(Dispatchers.IO)
        {
            var url = "https://type.fit/api/quotes"
            var json = JsonArrayRequest(Request.Method.GET, url, null, Response.Listener {
                for (i in 0 until it.length()) {
                    val text = it.getJSONObject(i).getString("text").toString()
                    adapter.update(text)
                }
            }, Response.ErrorListener {
            }) //Hello
            
            MySingleton.getInstance(context).addToRequestQueue(json)
        }
    }
}