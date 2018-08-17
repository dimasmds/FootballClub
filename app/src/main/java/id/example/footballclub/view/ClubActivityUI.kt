package id.example.footballclub.view

import android.view.Gravity
import android.widget.ImageView
import android.widget.TextView
import id.example.footballclub.activity.ClubActivity
import org.jetbrains.anko.*

/**
* Created by dimassaputra on 8/9/18.
*/

class ClubActivityUI : AnkoComponent<ClubActivity> {

    lateinit var imgView : ImageView
    lateinit var txtName : TextView
    lateinit var txtDesc : TextView

    override fun createView(ui: AnkoContext<ClubActivity>) = with(ui) {
        verticalLayout {
            padding = dip(10)
            verticalLayout {
                imgView = imageView{
                }.lparams(width = dip(80), height = dip(80)){
                    gravity = Gravity.CENTER
                }
                txtName = textView{
                    textSize = 16f
                }.lparams(wrapContent, wrapContent) {
                    topMargin = dip(5)
                    gravity = Gravity.CENTER
                }
            }.lparams(matchParent, wrapContent)

            txtDesc = textView{
            }.lparams(matchParent, wrapContent){
                topMargin = dip(10)
            }
        }
    }

}