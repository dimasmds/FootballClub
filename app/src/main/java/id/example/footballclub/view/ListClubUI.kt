package id.example.footballclub.view

import android.view.Gravity
import android.view.ViewGroup
import org.jetbrains.anko.*

/**
* Created by dimassaputra on 8/9/18.
*/
class ListClubUI : AnkoComponent<ViewGroup> {

    companion object {
        val imageViewLogo = 1
        val textViewName = 2
    }

    override fun createView(ui: AnkoContext<ViewGroup>) = with(ui) {
        linearLayout {
            padding = dip(16)
            imageView{
                id = imageViewLogo
            }.lparams(width = dip(50), height = dip(50))
            textView{
                id = textViewName
            }.lparams(wrapContent, wrapContent){
                gravity = Gravity.CENTER_VERTICAL
                margin = dip(10)
            }
        }
    }
}