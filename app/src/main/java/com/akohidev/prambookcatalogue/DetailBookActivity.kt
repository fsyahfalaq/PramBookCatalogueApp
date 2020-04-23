package com.akohidev.prambookcatalogue

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail_book.*


class DetailBookActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        const val EXTRA_TITLE = "extra_title"
        const val EXTRA_RATING = "extra_rating"
        const val EXTRA_ISBN = "extra_isbn"
        const val EXTRA_SYNOPSIS = "extra_synopsis"
        const val EXTRA_PUBLISHER = "extra_publisher"
        const val EXTRA_PHOTO = "extra_photo"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_book)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val title = intent.getStringExtra(EXTRA_TITLE)
        val rating = intent.getStringExtra(EXTRA_RATING).toFloat()
        val isbn = "ISBN: " + intent.getStringExtra(EXTRA_ISBN)
        val synopsis = "Synopsis: \n" + intent.getStringExtra(EXTRA_SYNOPSIS)
        val publisher = "Published by " + intent.getStringExtra(EXTRA_PUBLISHER)
        val photo = intent.getIntExtra(EXTRA_PHOTO, 0)

        supportActionBar?.title = title

        Glide.with(card_view.context)
            .load(photo)
            .into(img_detail_photo)

        tv_detail_title.text = title
        rt_bar_detail.rating = rating
        tv_detail_isbn.text = isbn
        tv_detail_synopsis.text = synopsis
        tv_detail_publisher.text = publisher

        val imgAboutBlibli: ImageView = findViewById(R.id.img_about_blibli)
        imgAboutBlibli.setOnClickListener(this)

        val imgAboutBukalapak: ImageView = findViewById(R.id.img_about_bukalapak)
        imgAboutBukalapak.setOnClickListener(this)

        val imgAboutshopee: ImageView = findViewById(R.id.img_about_shopee)
        imgAboutshopee.setOnClickListener(this)

        val imgAboutTokopedia: ImageView = findViewById(R.id.img_about_tokopedia)
        imgAboutTokopedia.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.img_about_blibli -> {
                openECommerce("https://blibli.com/jual/" + title.replace(" ".toRegex(),"-"))
            }

            R.id.img_about_bukalapak -> {
                openECommerce("https://www.bukalapak.com/products/s/" + title)
            }

            R.id.img_about_shopee -> {
                openECommerce("https://shopee.co.id/search?keyword=" + title)
            }

            R.id.img_about_tokopedia -> {
                openECommerce("https://www.tokopedia.com/search?st=product&q=" + title)
            }

        }
    }

    private fun openECommerce(link: String) {
        val uri = Uri.parse(link).let { uri ->
            Intent(Intent.ACTION_VIEW, uri)
        }
        startActivity(uri)
    }
}
