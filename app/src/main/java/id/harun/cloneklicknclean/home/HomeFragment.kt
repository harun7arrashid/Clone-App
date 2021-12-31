package id.harun.cloneklicknclean.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import id.harun.cloneklicknclean.R
import id.harun.cloneklicknclean.databinding.FragmentHomeBinding
import id.harun.cloneklicknclean.model.ServiceModel
import id.harun.cloneklicknclean.viewModel.HomeViewModel

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding

    private lateinit var listServices: List<ServiceModel>
    private lateinit var viewModel: HomeViewModel

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
        val all = binding?.chipAll
        all?.isCheckable = true
    }
}