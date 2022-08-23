package com.se7sopro.firstdaychallenge.utils

import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by solvpro on 8/22/2022.
 * Copyright (c) 2022 . All rights reserved.
 * Last modified 8/22/2022 10:43 PM
 */
object DateUtils {
    fun getCurrentDate() : String {
        val calender = Calendar.getInstance().time
        val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
        return dateFormat.format(calender)
    }
}