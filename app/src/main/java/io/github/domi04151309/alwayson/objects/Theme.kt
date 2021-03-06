package io.github.domi04151309.alwayson.objects

import android.app.Activity
import android.app.ActivityManager
import android.content.Context
import android.graphics.BitmapFactory
import androidx.preference.PreferenceManager
import androidx.core.content.ContextCompat
import io.github.domi04151309.alwayson.R

internal object Theme {

    fun set(context: Context) {
        if (PreferenceManager.getDefaultSharedPreferences(context).getBoolean("light_mode", false)) {
            context.setTheme(R.style.AppTheme_Light)
            val taskDescription = ActivityManager.TaskDescription(
                    context.getString(R.string.app_name),
                    BitmapFactory.decodeResource(context.resources, R.mipmap.ic_launcher),
                    ContextCompat.getColor(context, android.R.color.white)
            )
            (context as Activity).setTaskDescription(taskDescription)
        }
    }
}
