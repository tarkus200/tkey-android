package io.tkey.types

import com.google.gson.Gson

class TKeyException(val code: Int, message: String? = null) : Exception(message) {
    companion object {
        private val gson = Gson()
    }

    override fun toString(): String = gson.toJson(TKeyError(code, message))
}