package id.harun.cloneklicknclean.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ServiceModel(
    val id: Int? = 0,
    val title: String? = "",
    val imgUrl: String? = "",
    val disinfektan: Boolean? = false,
    val titleYoutube: String? = "",
    val titleDesc: String? = "",
    val desc: String? = "",
    val estimasi: String? = "",
    val urlYoutube: String? = null
) : Parcelable