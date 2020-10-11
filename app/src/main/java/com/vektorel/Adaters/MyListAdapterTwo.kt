package com.vektorel.Adaters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.vektorel.R
import java.util.zip.Inflater

class MyListAdapterTwo(context:Context,myarray: List<String>, myresim: List<String>): BaseAdapter() {

    var mylist = myarray
    var myresim = myresim
    var mycontext = context
    // Oluşacak Listenin boyutunu verir.
    override fun getCount(): Int {
       return  mylist.size
    }

    override fun getItem(p0: Int): Any {
        return mylist[p0]
    }

    override fun getItemId(p0: Int): Long {
        return 5L
    }

    override fun getView(position: Int, view: View?, parent: ViewGroup?): View {
        var myview = LayoutInflater.from(mycontext)
                .inflate(R.layout.list_in_images,parent,false)

        var txtgunler = myview.findViewById<TextView>(R.id.txtgun)
        var txtresimler = myview.findViewById<TextView>(R.id.txtresim)
         if(position<myresim.size) txtresimler.text = myresim[position]
        txtgunler.text = mylist[position]
        return myview
    }


}