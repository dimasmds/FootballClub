package id.example.footballclub.`interface`

import id.example.footballclub.model.Team

/**
* Created by dimassaputra on 8/13/18.
*/
interface TeamView {
    fun showLoading()
    fun hideLoading()
    fun showTeamList(data : List<Team>)
}