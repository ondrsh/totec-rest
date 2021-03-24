/**
 * Created by ndrsh on 6/18/20
 */

package com.totec.trading.network.restclients.coinbase

import com.totec.trading.core.networking.RestClientComponent
import com.totec.trading.network.restclients.HttpClientModule
import com.totec.trading.network.restclients.LiveRestClient
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [CoinbaseRestClientModule::class, HttpClientModule::class])
interface CoinbaseRestClientComponent : RestClientComponent {
	@Singleton override fun restClient(): LiveRestClient
	
	@Component.Factory
	interface Factory {
		fun create(httpClientModule: HttpClientModule): CoinbaseRestClientComponent
	}
}
