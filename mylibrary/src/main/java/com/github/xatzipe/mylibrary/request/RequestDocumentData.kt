package com.github.xatzipe.mylibrary.request

data class RequestDocumentData(
    /**
     *
     */
    val identityCredentialName: String,
    /**
     *
     */
    val docType: String,
    val docName: String,
    val userAuthentication: Boolean,
    val docRequest: DocRequest
)