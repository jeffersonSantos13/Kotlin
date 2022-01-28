package com.mercadolivro.controller.response

import com.mercadolivro.enums.CustomerStatus
import com.mercadolivro.model.BookModel
import com.mercadolivro.model.CustomerModel

data class CustomerBookPurchaseResponse(
    var customer: CustomerModel,

    var books: List<BookModel>
)