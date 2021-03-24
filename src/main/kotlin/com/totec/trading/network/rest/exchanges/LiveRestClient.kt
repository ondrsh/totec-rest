/**
 * Created by ndrsh on 6/17/20
 */

package com.totec.trading.network.restclients

import com.totec.trading.core.networking.RestClient
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LiveRestClient @Inject constructor(val address: String,
                                         val httpAsyncClient: CloseableHttpAsyncClient) : RestClient
