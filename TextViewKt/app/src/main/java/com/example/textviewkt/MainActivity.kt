package com.example.textviewkt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.textviewkt.databinding.ActivityMainBinding

//메인 액티비티
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {  //앱이 최초 실행했을 때 수행
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //val view = binding.root
        //setContentView(view) //바인딩한 화면 뷰를 연결

        binding.tvTitle.setText("밍드로이드")

    }
}