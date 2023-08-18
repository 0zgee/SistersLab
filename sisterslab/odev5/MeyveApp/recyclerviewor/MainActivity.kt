package com.example.recyclerviewor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.recyclerviewor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var adapter: MeyveAdapter

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rv.setHasFixedSize(true) //görünüm sabit boyutunu (fixed size) ayarlar
        binding.rv.layoutManager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.HORIZONTAL)



        val meyve = arrayListOf<Meyveler>() //Meyveler sınıfından nesneleri içerebilen bir ArrayList olan meyve adlı bir değişken oluşturuyor.

        meyve.add(Meyveler(R.drawable.cilek, "Çilek",5 ))
        meyve.add(Meyveler(R.drawable.elma,"Elma",3))
        meyve.add(Meyveler(R.drawable.karpuz, "Karpuz",2))
        meyve.add(Meyveler(R.drawable.kayisi, "Kayısı",4))
        meyve.add(Meyveler(R.drawable.seftali, "Şeftali",6 ))
        meyve.add(Meyveler(R.drawable.uzum, "Üzüm",1))

        adapter = MeyveAdapter(meyve)
        binding.rv.adapter = adapter



    }

}