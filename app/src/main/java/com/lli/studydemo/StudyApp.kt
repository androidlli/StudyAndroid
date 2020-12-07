package com.lli.studydemo

import android.app.Application
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.BuildConfig
import com.orhanobut.logger.Logger

/**
 * <pre>
 *     author : cango
 *     e-mail : lili92823@163.com
 *     time   : 2020/11/17
 *     desc   :
 * </pre>
 */
class StudyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Logger.addLogAdapter( object : AndroidLogAdapter() {
            override fun isLoggable(priority: Int, tag: String?): Boolean {
                return BuildConfig.DEBUG
            }
        })
    }
}