package org.ubu_improve.ui.clock

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

var currentTime = mutableStateOf("")
var isRunning = false

fun updateTime(){
    if (!isRunning){
        Thread.ofVirtual().start {
            isRunning = true
            while(true){
                Thread.sleep(500)
                currentTime.value = java.time.LocalTime.now().toString()
            }
        }
    }
}