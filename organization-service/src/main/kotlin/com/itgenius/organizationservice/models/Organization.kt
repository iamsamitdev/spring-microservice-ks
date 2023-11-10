package com.itgenius.organizationservice.models

data class Organization(
    val organizationId: Int,
    val organizationName: String,
    val organizationAddress: String,
    val organizationCode: String
)
