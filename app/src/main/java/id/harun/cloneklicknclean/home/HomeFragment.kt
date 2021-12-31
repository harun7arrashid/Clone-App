package id.harun.cloneklicknclean.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import id.harun.cloneklicknclean.R
import id.harun.cloneklicknclean.databinding.FragmentHomeBinding
import id.harun.cloneklicknclean.model.ServiceModel
import id.harun.cloneklicknclean.viewModel.HomeViewModel

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding

    private lateinit var listServices: List<ServiceModel>
    private lateinit var viewModel: HomeViewModel

    private val imageList = ArrayList<SlideModel>()


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if(activity != null) {

            viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[HomeViewModel::class.java]
            listServices = viewModel.services

            setupRecyclerView()
            imageSlider()
            setupChip()
        }
    }

    private fun setupRecyclerView() {
        binding?.rvHome?.apply {
            setHasFixedSize(true)
            adapter = HomeAdapter(listServices, object : HomeAdapter.OnItemClick {
                override fun clickDetail(service: ServiceModel?) {
                    Toast.makeText(activity, "${service?.titleDesc}", Toast.LENGTH_SHORT).show()
                }
            })
        }
    }

    private fun setupChip() {
        val imgSlider = binding?.imgSlider

        val all = binding?.chipAll
        val promo = binding?.chipPromo
        val partner = binding?.chipPartnership

        all?.setOnClickListener {
            imageList.clear()
            imageList.add(SlideModel("https://s3-ap-southeast-1.amazonaws.com/kliknclean/vouchers/promoapp_promo50.png"))
            imageList.add(SlideModel("https://s3-ap-southeast-1.amazonaws.com/kliknclean/vouchers/promoapp_Des2021.png"))

            imgSlider?.setImageList(imageList, ScaleTypes.CENTER_CROP)
        }

        promo?.setOnClickListener {
            imageList.clear()
            imageList.add(SlideModel("https://s3-ap-southeast-1.amazonaws.com/kliknclean/vouchers/promoapp_promo50.png"))

            imgSlider?.setImageList(imageList, ScaleTypes.CENTER_CROP)
        }

        partner?.setOnClickListener {
            imageList.clear()
            imageList.add(SlideModel("https://s3-ap-southeast-1.amazonaws.com/kliknclean/vouchers/promoapp_Des2021.png"))

            imgSlider?.setImageList(imageList, ScaleTypes.CENTER_CROP)
        }
    }

    private fun imageSlider() {
        val imgSlider = binding?.imgSlider

        imageList.add(SlideModel("https://s3-ap-southeast-1.amazonaws.com/kliknclean/vouchers/promoapp_promo50.png"))
        imageList.add(SlideModel("https://s3-ap-southeast-1.amazonaws.com/kliknclean/vouchers/promoapp_Des2021.png"))

        imgSlider?.setImageList(imageList, ScaleTypes.CENTER_CROP)
    }
}