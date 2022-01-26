package nacc.sergey.testforrentateam.domain.mapper

import nacc.sergey.testforrentateam.domain.model.User

interface UsersMapper<in LIST, in USER> {

    fun map(items: LIST) : List<User>

    fun map(item: USER) : User
}