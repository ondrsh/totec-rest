/**
 * Created by ndrsh on 6/17/20
 */

package com.totec.trading.network.restclients.bitmex

import com.totec.trading.core.networking.RestClientComponent
import com.totec.trading.network.restclients.HttpClientModule
import com.totec.trading.network.restclients.LiveRestClient
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [BitmexRestClientModule::class, HttpClientModule::class])
interface BitmexRestClientComponent : RestClientComponent {
	
	@Singleton override fun restClient(): LiveRestClient
	// @Singleton override fun instrumentRestDeserializer(): InstrumentRestDeserializer
	
	@Component.Factory
	interface Factory {
		fun create(httpClientModule: HttpClientModule): BitmexRestClientComponent
	}
}