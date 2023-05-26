package com.example.part3_chapter3.model

import java.util.*

data class DetailItem(

    val id: Long,
    val date: Date,
    val content: String,
    val amount: Long,
    val type: Type
)

enum class Type{
    PAY, CANCEL, POINT
}