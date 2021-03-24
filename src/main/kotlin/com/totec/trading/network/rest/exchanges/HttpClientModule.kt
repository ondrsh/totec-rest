/**
 * Created by ndrsh on 6/18/20
 */

package com.totec.trading.network.restclients

import dagger.Module
import dagger.Provides
import org.apache.http.client.config.CookieSpecs
import org.apache.http.client.config.RequestConfig
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient
import org.apache.http.impl.nio.client.HttpAsyncClients

@Module
class HttpClientModule {
	
	@Provides fun httpClient(): CloseableHttpAsyncClient = HttpAsyncClients.custom()
		.setDefaultRequestConfig(RequestConfig.custom()
			                         .setCookieSpec(CookieSpecs.STANDARD)
			                         .build())
		.setMaxConnPerRoute(100)
		.setMaxConnTotal(100)
		.build()
}
