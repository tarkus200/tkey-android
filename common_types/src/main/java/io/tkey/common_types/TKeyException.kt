package io.tkey.common_types

import com.google.gson.Gson

class TKeyException(val code: Int, message: String) : Exception(message) {
    companion object {
        private val gson = Gson()
    }

    fun toJson() = TKeyError(code, message ?: "")

    override fun toString(): String = gson.toJson(this.toJson())
}
