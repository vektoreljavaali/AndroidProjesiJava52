package com.vektorel.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment
import com.vektorel.Adaters.MyListAdapterTwo
import com.vektorel.R

class BaslikBirFragment() : Fragment() {

    var gunler = arrayOf("Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar",
        "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar",
        "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar",
        "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar")
    var resimler = arrayOf("resim1","resim2","resim3")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
       // Soru: Bu Sınıfın layout içindeki bir tasarımı kullanacağı
       // bilgisini nerede veriyorsunuz?
        var view = inflater.inflate(R.layout.fragment_baslik_bir, container, false);

        var listview = view.findViewById<ListView>(R.id.list_musteri)
        // ArrayAdapter
        // Bu frament içinde, hazır text yapısı ile bizim vermiş olduğumuz listeyi
        // adapter listessi olarak tanımlası
        var listadapter = MyListAdapterTwo(requireContext(),gunler.toList(),resimler.toList())

        listview.adapter = listadapter
        return view
    }

}