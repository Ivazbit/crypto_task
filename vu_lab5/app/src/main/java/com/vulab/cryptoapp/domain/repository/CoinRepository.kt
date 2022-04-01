package com.vulab.cryptoapp.domain.repository

import com.vulab.cryptoapp.data.remote.dto.CoinDetailDto
import com.vulab.cryptoapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}