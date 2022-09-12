package com.example.figmademo

import androidx.annotation.*

enum class CardData(
        val titleResId: String,
        @DrawableRes
        val imgResId: Int,
        @DrawableRes
        val bgResId: Int,
        @ColorInt
        val textColorResId: Int,
        @FontRes
        val titleFontResId: Int) {

    IMPROVE(titleResId = "Improve Performance\n without cup of coffee",
            imgResId = R.drawable._bgimprove,
            bgResId = R.drawable.ic_frame_2,
            textColorResId = R.color.yellow,
            titleFontResId = R.font.syne),

    REDUCE(titleResId = "Reduce Stress",
            imgResId = R.drawable.bg_stress,
            bgResId = R.drawable.ic_stress_bg,
            textColorResId = R.color.darkBlue,
            titleFontResId = R.font.syne_bold),

    HAPPINESS(titleResId = "Increase Happiness",
            imgResId = R.drawable.bg_happiness,
            bgResId = R.drawable.ic_happiness_bg,
            textColorResId = R.color.grey,
            titleFontResId = R.font.syne_bold),

    SLEEP(titleResId = "Better Sleep",
            imgResId = R.drawable.bg_sleep,
            bgResId = R.drawable.ic_sleep_bg,
            textColorResId = R.color.darkBlue,
            titleFontResId = R.font.syne_bold),

    GOALS(titleResId = "Achieve\n Your\n Goals",
            imgResId = R.drawable.bg_goals,
            bgResId = R.drawable.ic_goals_bg,
            textColorResId = R.color.darkBlue,
            titleFontResId=R.font.syne_bold),

    MUSIC(titleResId = "Listen to\n soothing\n music",
            imgResId = R.drawable.bg_music,
            bgResId = R.drawable.ic_music_bg,
            textColorResId = R.color.orange,
            titleFontResId=R.font.syne_bold)
}