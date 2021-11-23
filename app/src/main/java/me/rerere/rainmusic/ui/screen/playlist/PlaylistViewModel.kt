package me.rerere.rainmusic.ui.screen.playlist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import me.rerere.rainmusic.repo.MusicRepo
import me.rerere.rainmusic.retrofit.api.model.PlaylistDetail
import me.rerere.rainmusic.util.DataState
import javax.inject.Inject

@HiltViewModel
class PlaylistViewModel @Inject constructor(
    private val musicRepo: MusicRepo
) : ViewModel(){
    val playlistDetail : MutableStateFlow<DataState<PlaylistDetail>> = MutableStateFlow(DataState.Empty)

    fun loadPlaylist(id: Long){
        musicRepo.getPlaylistDetail(id)
            .onEach {
                playlistDetail.value = it
            }
            .launchIn(viewModelScope)
    }
}