package nacc.sergey.testforrentateam.domain.model

import java.io.Serializable

data class User(
        val id: Int,
        val first_name: String,
        val last_name: String,
        val full_name: String,
        val email: String,
        val avatarUrl: Int,

) : Serializable
