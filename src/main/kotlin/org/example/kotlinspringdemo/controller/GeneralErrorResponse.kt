package org.example.kotlinspringdemo.controller

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
data class GeneralErrorResponse (
    val message: String? = null,
    val error: String? = null,
    val requestUrl: String? = null,
)