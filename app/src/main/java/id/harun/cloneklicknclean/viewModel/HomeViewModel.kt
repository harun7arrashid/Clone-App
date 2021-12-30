package id.harun.cloneklicknclean.viewModel

import androidx.lifecycle.ViewModel
import id.harun.cloneklicknclean.model.DataDummy
import id.harun.cloneklicknclean.model.ServiceModel

class HomeViewModel: ViewModel() {

    val services: List<ServiceModel> = DataDummy.getServices()

}