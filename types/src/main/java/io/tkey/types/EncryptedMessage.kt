package io.tkey.types

data class EncryptedMessage(
    val cipher: String,
    val ephemPublicKey: String,
    val iv: String,
    val mac: String
)
