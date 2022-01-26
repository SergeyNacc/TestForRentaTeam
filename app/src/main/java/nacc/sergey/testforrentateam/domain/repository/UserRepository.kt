package nacc.sergey.testforrentateam.domain.repository

import io.reactivex.Single
import nacc.sergey.testforrentateam.domain.model.User

interface UserRepository {

    fun getUsers(): Single<List<User>>
}