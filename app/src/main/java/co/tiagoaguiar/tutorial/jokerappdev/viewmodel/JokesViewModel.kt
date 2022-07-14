package co.tiagoaguiar.tutorial.jokerappdev.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import co.tiagoaguiar.tutorial.jokerappdev.model.Category


class JokesViewModel : ViewModel() {

    private var jokeLiveData = MutableLiveData<List<Category>>()

}