package nacc.sergey.testforrentateam.data.dto

import com.google.gson.annotations.SerializedName

data class UsersResponse (

        @field:SerializedName("page")
        val page: Int,

        @field:SerializedName("perPage")
        val perPage: Int,

        @field:SerializedName("total")
        val total: Int,

        @field:SerializedName("total_pages")
        val totalPages: Int,

        @field:SerializedName("data")
        val users: List<UserResponse> = emptyList()

)