package com.lli.studydemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.orhanobut.logger.Logger
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        //1.得到缩略图对应的rect和大图的rect，计算两者的X和Y得到平移的距离,取得缩略图最大边，得到比例，当成缩放比例
        //2.执行动画放大，大图点击后反效果执行缩小
        iv_thumb.post {
            Logger.d("iv_thumb.x = ${iv_thumb.x}; iv_thumb.y = ${iv_thumb.y}")
            Logger.d("iv_max.x = ${iv_max.x}; iv_max.y = ${iv_max.y}")
        }
    }
}