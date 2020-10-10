package com.vektorel

import android.media.Image
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast


class Notifications : Fragment() {

    lateinit var img: ImageView
    var DU: Int = 22
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle? ): View? {
       var view = inflater.inflate(R.layout.fragment_notifications, container, false)
        img = view.findViewById(R.id.imgButton)
        img.setOnClickListener {
            gotoHome()
        }
        return view
    }

    fun gotoHome(){
        Toast.makeText(this.context,"Selam",DU)
    }

}