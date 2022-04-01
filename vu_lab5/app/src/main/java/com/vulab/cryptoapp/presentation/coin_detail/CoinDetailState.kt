package com.vulab.cryptoapp.presentation.coin_detail

import com.vulab.cryptoapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail ?= null,
    val error: String = ""
)
