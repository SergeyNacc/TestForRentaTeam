package nacc.sergey.testforrentateam.presentation.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import nacc.sergey.testforrentateam.domain.model.User
import javax.inject.Inject


@HiltViewModel
class ListViewModel
    @Inject constructor(): ViewModel() {

        private var users = MutableLiveData<List<User>>()

    fun getUsers(): LiveData<List<User>> {
        return users
    }
}