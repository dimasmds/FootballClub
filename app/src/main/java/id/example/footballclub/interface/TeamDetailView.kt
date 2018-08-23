package id.example.footballclub.`interface`

import id.example.footballclub.model.Team

/**
 * Created by dimassaputra on 8/23/18.
 */
interface TeamDetailView {

    fun showLoading()
    fun hideLoading()
    fun showTeamDetail(data : List<Team>)

}