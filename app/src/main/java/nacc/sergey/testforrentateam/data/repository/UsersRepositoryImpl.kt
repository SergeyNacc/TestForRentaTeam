package nacc.sergey.testforrentateam.data.repository

import io.reactivex.Single
import nacc.sergey.testforrentateam.data.dto.UserResponse
import nacc.sergey.testforrentateam.data.dto.UsersResponse
import nacc.sergey.testforrentateam.data.source.UsersApi
import nacc.sergey.testforrentateam.domain.mapper.UsersMapper
import nacc.sergey.testforrentateam.domain.model.User
import nacc.sergey.testforrentateam.domain.repository.UsersRepository
import javax.inject.Inject

class UsersRepositoryImpl
@Inject constructor(private val api: UsersApi,
                    private val mapper: UsersMapper<UsersResponse, UserResponse>
                    ) : UsersRepository {

    override fun getUsers(): Single<List<User>> {
        return api.getUsers().map { mapper.map(it) }
    }
}