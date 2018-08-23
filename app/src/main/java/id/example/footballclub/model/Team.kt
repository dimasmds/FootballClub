package id.example.footballclub.model

import com.google.gson.annotations.SerializedName

/**
 * Created by dimassaputra on 8/13/18.
 */
data class Team(
        @SerializedName("idTeam")
        var teamId: String? =  null,

        @SerializedName("strTeam")
        var teamName : String? = null,

        @SerializedName("strTeamBadge")
        var teamBadge : String? = null,

        @SerializedName("intFormedYear")
        var teamFormedYear : String? = null,

        @SerializedName("strStadium")
        var teamStadium : String? = null,

        @SerializedName("strDescriptionEN")
        var teamDescription : String? = null
)