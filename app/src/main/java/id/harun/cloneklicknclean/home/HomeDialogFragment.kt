package id.harun.cloneklicknclean.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import id.harun.cloneklicknclean.R
import id.harun.cloneklicknclean.databinding.FragmentHomeDialogBinding

class HomeDialogFragment(val itemClick: OnItemClick) : BottomSheetDialogFragment() {

    private lateinit var binding: FragmentHomeDialogBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentHomeDialogBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    interface OnItemClick {
        fun onItemClick()
    }
}