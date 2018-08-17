package id.example.footballclub.api

import java.net.URL

/**
 * Created by dimassaputra on 8/13/18.
 */
class APIRepository {

    fun doRequest(url: String) : String {
        return URL(url).readText()
    }

}