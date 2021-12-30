package id.harun.cloneklicknclean.model

data class ServiceModel(
    val id: Int? = 0,
    val title: String? = "",
    val imgUrl: String? = "",
    val disinfektan: Boolean? = false,
    val titleYoutube: String? = "",
    val titleDesc: String? = "",
    val desc: String? = "",
    val estimasi: String? = "",
    val urlYoutube: String? = ""
)