package com.project.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerview: RecyclerView
    private lateinit var adapter : RecyclerAdapter // 본인이 만든 어댑터

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = ArrayList<Model>()
        var contact = Model("Add ","00000","https://picsum.photos/200")
        for(i: Int in 1..10)
            list.add(contact)

        recyclerview = findViewById(R.id.recyclerView)

        adapter = RecyclerAdapter(list)
        recyclerview.adapter = adapter // 리사이클러뷰 어댑터를 본인이 만든 어댑터로 설정
        recyclerview.layoutManager = LinearLayoutManager(this)
    }
}