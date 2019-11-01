package com.example.candi

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListCandiAdapter(private val listcandi: ArrayList<Candi>): RecyclerView.Adapter<ListCandiAdapter.ListViewHolder>() {
    private lateinit var onItemCallback: OnItemCallBack

    interface OnItemCallBack{
        fun onItemClicked(data: Candi)
    }

    fun setOnClickCallBack(onItemCallBack: OnItemCallBack){
        this.onItemCallback = onItemCallBack
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.list_candi, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listcandi.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val candi = listcandi[position]
        Glide.with(holder.itemView.context)
            .load(candi.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.ViewName.text = candi.name
        holder.ViewDetail.text = candi.detail
        holder.itemView.setOnClickListener {
            onItemCallback.onItemClicked(listcandi[holder.adapterPosition])
            val movedata = Intent(holder.itemView.context, ShowPosting::class.java)
            movedata.putExtra("get_name", listcandi[holder.adapterPosition].name)
            movedata.putExtra("get_detail", listcandi[holder.adapterPosition].detail)
            movedata.putExtra("get_photo",listcandi[holder.adapterPosition].photo)
            holder.itemView.context.startActivity(movedata)
        }
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var ViewName: TextView = itemView.findViewById(R.id.k_name)
        var ViewDetail: TextView = itemView.findViewById(R.id.k_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_candi)
    }
}
