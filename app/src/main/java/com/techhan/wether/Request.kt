package com.techhan.wether

import android.util.Log
import java.net.URL

/**
 * Created by jackie on 2017/4/21.
 */
public class Request (val url: String){
    public fun run() {
        val forecastJsonStr = URL(url).readText()
        Log.d(javaClass.simpleName, forecastJsonStr)
    }

}