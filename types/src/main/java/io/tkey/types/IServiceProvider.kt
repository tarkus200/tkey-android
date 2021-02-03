package io.tkey.types

import java.math.BigInteger
import java.security.spec.EllipticCurve
import java.util.concurrent.CompletableFuture

interface IServiceProvider {
    val ec: EllipticCurve
    val postboxKey: BigInteger

    fun encrypt(msg: ByteArray): CompletableFuture<EncryptedMessage>
    fun decrypt(msg: EncryptedMessage): CompletableFuture<ByteArray>
    fun sign(msg: BigInteger): String
    fun sign(msg: String): String
}