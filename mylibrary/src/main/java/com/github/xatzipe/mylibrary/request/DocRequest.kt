package com.github.xatzipe.mylibrary.request

//this is a test remote pr
import io.github.xatzipe.xtzplib.MyNewClass
import java.security.cert.X509Certificate

class DocRequest(val docType: String,
                 val requestItems: List<DocItem>,
                 val encodedRequestItems: ByteArray,
                 val readerAuth: ReaderAuth?)

/**
 * 
 */
data class DocItem(val namespace: String,
                   val elementIdentifier: String)

/**
 *
 */
class ReaderAuth(val readerAuth: ByteArray,
                 val readerSignIsValid: Boolean,
                 val readerCertificateChain: List<X509Certificate>,
                 val readerCertificatedIsTrusted: Boolean,
                 val readerCommonName: String) {
    fun isSuccess(): Boolean {
        MyNewClass("test")
        return readerSignIsValid &&
                readerCertificatedIsTrusted
    }
}