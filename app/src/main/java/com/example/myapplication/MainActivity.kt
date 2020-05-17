package com.example.myapplication

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvName.text = "Name Binding"
        binding.tvName.setOnClickListener {
            (0..100).forEach { _ ->
                val args = Any()
            }
        }

//        val options = BitmapFactory.Options().apply {
//            inMutable = true
//        }
//        var bitmap = BitmapFactory.decodeResource(resources, R.mipmap.ic_launcher,options)
//        options.inJustDecodeBounds = true
//        val outWidth = options.outWidth
//        val outHeight = options.outHeight
//
//        options.inJustDecodeBounds = false
//        //内存缓存
//        BitmapFactory.decodeResource(resources,R.mipmap.ic_launcher,options)//对图片进行缩放
        //活动缓存->内存缓存->磁盘缓存
        // 3.0以下  3.0-8.0 8.0以后

        //数据被GC扫到之后 就会被放置到引用队列中
        //GC算法   标记整理 复制算法
        // 1. 空间分为2个部分,优点： 只需要移动存活的部分，但是空间的利用率会少一半，适合新生代这种存活率的情况
        // 2. 老年代存活率高，只需要移动数据到特定的空间上去，没有额外的空间牺牲，老年代这种没有额外空间担保的情况很适合
        // 3 分代算法
    }

}
