package id.example.footballclub.presenter

import com.google.gson.Gson
import id.example.footballclub.`interface`.TeamDetailView
import id.example.footballclub.api.APIRepository
import id.example.footballclub.api.TheSportDBApi
import id.example.footballclub.model.TeamResponse
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
        doAsync {
            val data = gson.fromJson(apiRepository
                    .doRequest(TheSportDBApi.getTeamDetail(teamId)),
                    TeamResponse::class.java
            )

            uiThread {
                view.hideLoading()
                view.showTeamDetail(data.teams)
            }
        }
    }

}