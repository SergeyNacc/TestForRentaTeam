package nacc.sergey.testforrentateam.data.mapper

import nacc.sergey.testforrentateam.data.dto.UserResponse
import nacc.sergey.testforrentateam.data.dto.UsersResponse
import nacc.sergey.testforrentateam.domain.mapper.UsersMapper
import nacc.sergey.testforrentateam.domain.model.User
import javax.inject.Inject

class UsersMapperImpl
@Inject constructor() : UsersMapper<UsersResponse, UserResponse> {

    override fun map(items: UsersResponse): List<User> {
        return items.users.map {
            map(it)
        }
    }

    override fun map(item: UserResponse): User {
        return with(item) {
            User(
                id,
                firstName,
                lastName,
                "$firstName $lastName",
                email,
                avatarUrl
            )
        }
    }
}