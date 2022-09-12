package com.example.figmademo.enumtype

import androidx.annotation.ColorInt
import androidx.annotation.DrawableRes
import androidx.annotation.FontRes
import com.example.figmademo.R

enum class CardHomeData(
        @DrawableRes
        val imgResId: Int,
        val titleResId: String,
        @ColorInt
        val textColorResId: Int,
        @FontRes
        val titleFontResId: Int) {

    EVENING(imgResId = R.drawable.bg_recommended,
            titleResId = "Evening Meditation",
            textColorResId = R.color.grey,
            titleFontResId = R.font.syne),

    EVENING1(imgResId = R.drawable.bg_recommended,
            titleResId = "Evening Meditation",
            textColorResId = R.color.grey,
            titleFontResId = R.font.syne),

    EVENING2(imgResId = R.drawable.bg_recommended,
            titleResId = "Evening Meditation",
            textColorResId = R.color.grey,
            titleFontResId = R.font.syne),

    EVENING3(imgResId = R.drawable.bg_recommended,
            titleResId = "Evening Meditation",
            textColorResId = R.color.grey,
            titleFontResId = R.font.syne)

}