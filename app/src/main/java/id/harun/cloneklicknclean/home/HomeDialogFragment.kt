package id.harun.cloneklicknclean.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import id.harun.cloneklicknclean.R
import id.harun.cloneklicknclean.databinding.FragmentHomeDialogBinding

class HomeDialogFragment() : BottomSheetDialogFragment() {

    private lateinit var binding: FragmentHomeDialogBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentHomeDialogBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        val youtube = binding.youtubePlayer
//        activity?.lifecycle?.addObserver(youtube)
//        youtube.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
//            override fun onReady(youTubePlayer: YouTubePlayer) {
//                youTubePlayer.loadVideo("P8iLMHtzjJA", 0F)
//            }
//        })
//
//        binding.btnOrderNow.setOnClickListener {
//            Toast.makeText(activity, "Pesanan sedang diproses", Toast.LENGTH_SHORT).show()
//            this.dismiss()
//        }
    }
}