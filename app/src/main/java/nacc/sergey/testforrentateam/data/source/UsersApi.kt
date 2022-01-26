package nacc.sergey.testforrentateam.data.source

import io.reactivex.Single
import nacc.sergey.testforrentateam.data.dto.UsersResponse
import retrofit2.http.GET

interface UsersApi {

    @GET ("users")
    fun getUsers(): Single<UsersResponse>
}