package id.example.footballclub.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import id.example.footballclub.view.ClubActivityUI
import org.jetbrains.anko.*

class ClubActivity : AppCompatActivity() {

    private lateinit var clubUI : ClubActivityUI

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = intent
        val name = intent.getStringExtra("name")
        val image = intent.getIntExtra("image", 0)
        val desc = intent.getStringExtra("desc")

        clubUI = ClubActivityUI()
        clubUI.setContentView(this)

        clubUI.txtName.text = name
        clubUI.txtDesc.text = desc
        Picasso.get().load(image).fit().into(clubUI.imgView)

    }
}

