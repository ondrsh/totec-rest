/**
 * Created by ndrsh on 7/2/20
 */

package com.totec.trading.network.rest.exchanges.bitmex

import org.apache.commons.codec.binary.Hex
import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec

@Suppress("unused")
object BitmexAuth {
	private val secret = System.getenv("BITMEX_SECRET") ?: ""
	val apiID = System.getenv("BITMEX_API_ID") ?: ""
	private val mac: Mac = Mac.getInstance("HmacSHA256")

	
	// data should be a json string
	private fun getSignature(verb: String, endpoint: String, expires: Long, data: String = ""): String {
		val message = verb + endpoint + expires.toString() + data
		val secretkey = SecretKeySpec(secret.toByteArray(), "HmacSHA256")
		mac.init(secretkey)
		return Hex.encodeHexString(mac.doFinal(message.toByteArray()))
	}
	
	// for websocket, use verb = "GET", endpoint = "/realtime"
	fun getWebsocketSignature(expires: Long): String = getSignature("GET", "/realtime", expires)
}
