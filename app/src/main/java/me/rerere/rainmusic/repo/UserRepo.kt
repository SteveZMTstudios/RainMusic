package me.rerere.rainmusic.repo

import com.soywiz.krypto.md5
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import me.rerere.rainmusic.retrofit.weapi.NeteaseMusicWeApi
import me.rerere.rainmusic.retrofit.weapi.response.LoginResponse
import me.rerere.rainmusic.util.DataState
import me.rerere.rainmusic.util.encrypt.encryptWeAPI
import javax.inject.Inject

class UserRepo @Inject constructor(
    private val weApi: NeteaseMusicWeApi
) {
    fun loginCellPhone(
        phone: String,
        password: String
    ): Flow<DataState<LoginResponse>> = flow {
        emit(DataState.Loading)
        kotlinx.coroutines.delay(500) // 等待1秒，防止登录对话框来不及显示
        try {
            val result = weApi.loginCellphone(
                encryptWeAPI(
                    mapOf(
                        "phone" to phone,
                        "countrycode" to "86",
                        "password" to password.toByteArray().md5().hex,
                        "rememberLogin" to "true"
                    )
                )
            )
            emit(DataState.Success(result))
        } catch (e: Exception) {
            e.printStackTrace()
            emit(DataState.Error(e))
        }
    }
}