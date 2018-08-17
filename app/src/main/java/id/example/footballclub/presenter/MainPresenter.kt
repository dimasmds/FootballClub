package id.example.footballclub.presenter

import com.google.gson.Gson
import id.example.footballclub.`interface`.MainView
import id.example.footballclub.api.APIRepository
import id.example.footballclub.api.TheSportDBApi
import id.example.footballclub.model.TeamResponse
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

/**
 * Created by dimassaputra on 8/13/18.
 */
class MainPresenter(private val view : MainView,
                    private val apiRepository: APIRepository,
                    private val gson: Gson) {

    fun getTeamList(league: String?){
        view.showLoading()
        doAsync {
            val data = gson.fromJson(apiRepository.doRequest(TheSportDBApi.getTeams(league)),
                    TeamResponse::class.java
            )

            uiThread {
                view.hideLoading()
                view.showTeamList(data.teams)
            }
        }
    }
}