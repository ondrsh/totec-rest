/**
 * Created by ndrsh on 6/26/20
 */

package com.totec.trading.network.restclients.coinbase

import dagger.Module
import dagger.Provides

@Module
class CoinbaseRestClientModule {
	@Provides fun provideAddress(): String = "coinbase.com"
}
