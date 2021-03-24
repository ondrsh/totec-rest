/**
 * Created by ndrsh on 6/17/20
 */

package com.totec.trading.network.restclients.bitmex

import dagger.Module
import dagger.Provides

@Module
class BitmexRestClientModule {
	@Provides fun provideAddress(): String = "bitmex.com"
}
