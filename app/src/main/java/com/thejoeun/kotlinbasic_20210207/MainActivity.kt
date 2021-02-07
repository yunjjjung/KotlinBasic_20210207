package com.thejoeun.kotlinbasic_20210207

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        전송버튼이 눌렷을 때 할 일
        sendBtn.setOnClickListener {
//            ctrl + / 로 이 줄을 주석으로 만듬.
//            sendBtn이 눌리면 실행해줄 코드.
            Log.d("메인화면", "전송버튼 눌림")

            Toast.makeText(this,"전송버튼 클릭됨",Toast.LENGTH_SHORT).show()

        }

//        로그 버튼이 눌리면 할 일
        logBtn.setOnClickListener {
            Log.d("메인화면","로그버튼 눌림")
            Log.e("메인화면","실행되면 안되는데 실행되는지 체크")

//            로그버튼 눌림 토스트 출력
            Toast.makeText(this,"로그버튼 눌림", Toast.LENGTH_SHORT).show()
        }






    }
}