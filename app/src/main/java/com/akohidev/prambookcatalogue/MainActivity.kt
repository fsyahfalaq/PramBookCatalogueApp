package com.akohidev.prambookcatalogue

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvBooks: RecyclerView
    private var list: ArrayList<Book> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "Pram Book Catalogue"

        rvBooks = findViewById(R.id.rv_books)
        rvBooks.setHasFixedSize(true)

        list.addAll(BooksData.listData)
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.action_about -> {
            moveToAbout()
            true
        }

        else -> super.onOptionsItemSelected(item)
    }

    private fun showRecyclerList() {
        rvBooks.layoutManager = LinearLayoutManager(this)
        val listBookAdapter = ListBookAdapter(list)
        rvBooks.adapter = listBookAdapter

        listBookAdapter.setOnItemClickCallback(object : ListBookAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Book) {
                moveToDetailBook(data)
            }
        })
    }

    private fun moveToDetailBook(book: Book) {
        val detailBookIntent = Intent(this@MainActivity, DetailBookActivity::class.java)
        detailBookIntent.putExtra(DetailBookActivity.EXTRA_TITLE, book.title)
        detailBookIntent.putExtra(DetailBookActivity.EXTRA_RATING, book.rating)
        detailBookIntent.putExtra(DetailBookActivity.EXTRA_ISBN, book.isbn)
        detailBookIntent.putExtra(DetailBookActivity.EXTRA_SYNOPSIS, book.synopsis)
        detailBookIntent.putExtra(DetailBookActivity.EXTRA_PUBLISHER, book.publisher)
        detailBookIntent.putExtra(DetailBookActivity.EXTRA_PHOTO, book.photo)
        startActivity(detailBookIntent)
    }

    private fun moveToAbout() {
        val aboutIntent = Intent(this@MainActivity, AboutActivity::class.java)
        startActivity(aboutIntent)
    }
}
