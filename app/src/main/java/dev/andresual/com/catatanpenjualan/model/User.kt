package dev.andresual.com.catatanpenjualan.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Andresual on 01/05/2020.
 */
data class User (

    @field:SerializedName("password")
    var password:String? = null,

    @field:SerializedName("hp")
    var hp:String? = null,

    @field:SerializedName("id_user")
    var iduser:Int? = null,

    @field:SerializedName("create_date")
    var createDate:String? = null,

    @field:SerializedName("email")
    var email:String? = null,

    @field:SerializedName("username")
    var username:String? = null
)