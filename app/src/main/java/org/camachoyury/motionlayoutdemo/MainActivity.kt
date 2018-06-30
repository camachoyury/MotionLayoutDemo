package org.camachoyury.motionlayoutdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.motion.MotionLayout
import android.view.View


class MainActivity : AppCompatActivity() {
    var toggle = true
    var motionLayout : View? = null
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun changeState(view: View?) {
        val layout = view?.parent as MotionLayout

        if (toggle) {
            layout.transitionToEnd()

        } else {
            layout.transitionToStart()
        }
        toggle = !toggle
    }
}

