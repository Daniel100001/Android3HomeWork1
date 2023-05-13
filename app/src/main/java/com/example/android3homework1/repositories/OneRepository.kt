package com.example.android3homework1.repositories

import androidx.lifecycle.MutableLiveData
import com.example.android3homework1.data.OneModel

class OneRepository {

    private val oneAddress: String = "https://http.cat/"
    private val oneModelList = ArrayList<OneModel>()

    fun getListOfData(): MutableLiveData<ArrayList<OneModel>> {
        oneModelList.add(
            OneModel(
                "${oneAddress}100", "Continue"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}101", "Switching Protocols"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}102", "Processing"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}103", "Early Hints"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}200", "Ok"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}201", "Created"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}202", "Accepted"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}203",
                "Non-Authoritative"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}204",
                "No Content"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}206",
                "Partial Content"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}207",
                "Multi-Status"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}300",
                "Multiple Choices"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}301",
                "Moved Permanently"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}302",
                "Found"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}303",
                "See Other"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}304",
                "Not Modified"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}305",
                "Use Proxy"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}307",
                "Temporary Redirect"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}308",
                "Permanent Redirect"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}400",
                "Bad Request"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}401",
                "Unauthorized"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}402",
                "Payment Required"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}403",
                "Forbidden"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}404",
                "Not Found"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}405",
                "Method Not Allowed"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}406",
                "Not Acceptable"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}407",
                "Proxy Authentication Required"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}408",
                "Request Timeout"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}409",
                "Conflict"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}410",
                "Gone"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}411",
                "Length Required"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}412",
                "Precondition Failed"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}413",
                "Payload Too Large"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}414",
                "URI Too Long"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}415",
                "Unsupported Media"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}416",
                "Range Not Satisfiable"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}418",
                "I'm a teapot"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}421",
                "Misdirected Request"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}423",
                "ExpectationFailed"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}424",
                "ExpectationFailed"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}425",
                "ExpectationFailed"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}426",
                "ExpectationFailed"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}417",
                "ExpectationFailed"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}417",
                "ExpectationFailed"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}417",
                "ExpectationFailed"
            )
        )
        oneModelList.add(
            OneModel(
                "${oneAddress}417",
                "ExpectationFailed"
            )
        )
        val liveData = MutableLiveData<ArrayList<OneModel>>()
        liveData.value = oneModelList
        return liveData

    }
}