package id.example.footballclub.presenter

import com.google.gson.Gson
import id.example.footballclub.`interface`.TeamDetailView
import id.example.footballclub.api.APIRepository
import id.example.footballclub.api.TheSportDBApi
import id.example.footballclub.model.TeamResponse
import kotlinx.coroutines.experimental.android.UI
import kotlinx.coroutines.experimental.async
import org.jetbrains.anko.coroutines.experimental.bg
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

/**
 * Created by dimassaputra on 8/23/18.
 */
class TeamDetailPresenter (private val view: TeamDetailView,
                           private val apiRepository: APIRepository,
                           private val gson : Gson) {


    fun getTeamDetail(teamId : String) {
        view.showLoading()
        async(UI){
            val data = bg {
                gson.fromJson(apiRepository
                        .doRequest(TheSportDBApi.getTeamDetail(teamId)),
                        TeamResponse::class.java
                )
            }

            view.showTeamDetail(data.await().teams)
            view.hideLoading()
        }
    }

}