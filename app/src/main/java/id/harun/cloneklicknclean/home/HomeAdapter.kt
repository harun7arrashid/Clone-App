package id.harun.cloneklicknclean.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import id.harun.cloneklicknclean.databinding.ListItemServiceBinding
import id.harun.cloneklicknclean.model.ServiceModel

class HomeAdapter(private val listService: List<ServiceModel>?, val onItemClick: OnItemClick): RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val view = ListItemServiceBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HomeViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        listService?.get(position)?.let { holder.bind(it) }
    }

    override fun getItemCount(): Int = listService?.size ?: 0

    inner class HomeViewHolder(private val binding: ListItemServiceBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(service: ServiceModel) {
            with(binding) {
                tvListTitle.text = service.title
                Glide.with(itemView.context).load(service.imgUrl).into(imgList)

                if (service.disinfektan != false) btnDisinfektan.visibility = View.VISIBLE
                else btnDisinfektan.visibility = View.GONE

                itemView.setOnClickListener {
                    onItemClick.clickDetail(service)
                }
            }
        }
    }

    interface OnItemClick {
        fun clickDetail(service: ServiceModel?)
    }
}