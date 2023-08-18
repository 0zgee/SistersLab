package com.example.recyclerviewor

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.recyclerviewor.databinding.SatirBinding
import kotlinx.coroutines.NonDisposableHandle.parent

/*MeyveAdapter, Meyveler sınıfından oluşturulmuş bir liste alır ve bu meyveleri bir RecyclerView içinde
görüntülemek üzere tasarlanmıştır. Meyveler sınıfı, meyve verilerini temsil eden özel bir sınıftır.*/


/*MeyveAdapter sınıfı, RecyclerView'ın veri öğelerini görüntülemesi için kullanılan özel bir alt sınıf olan
RecyclerView.Adapter'dan türetilmiştir. MeyvelerViewHolder iç sınıfını içerir, bu da her bir film öğesinin
görünümünü tutacak olan ViewHolder'ı temsil eder.*/

class MeyveAdapter (private val meyve: List<Meyveler>) : RecyclerView.Adapter<MeyveAdapter.MeyvelerViewHolder>() {


    inner class MeyvelerViewHolder(val binding: SatirBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MeyvelerViewHolder {
        return MeyvelerViewHolder(SatirBinding.inflate(LayoutInflater.from(parent.context),parent,false))

    }

    override fun getItemCount(): Int {
        return meyve.size
    }

    override fun onBindViewHolder(holder: MeyvelerViewHolder, position: Int) {
        holder.binding.meyveAdi.text=meyve[position].meyveAdi
        holder.binding.meyveMiktari.text=meyve[position].meyveMiktari.toString()

        holder.binding.imageView.setImageResource(meyve[position].meyveResim)

        holder.itemView.setOnClickListener{  //onclickListener to the item
            Toast.makeText(holder.itemView.context, "${meyve[position].meyveAdi} ", Toast.LENGTH_SHORT).show()
        }


        holder.binding.sepeteEkle.setOnClickListener{
            val context = holder.binding.root.context
            Toast.makeText(context, "${meyve[position].meyveAdi} Sepete Eklendi", Toast.LENGTH_SHORT).show()

        }







    }

}

