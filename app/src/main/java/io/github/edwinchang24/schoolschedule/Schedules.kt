package io.github.edwinchang24.schoolschedule

import java.util.Calendar.*

private val normal = linkedMapOf(
    "1" to ("8:30" to "9:18"),
    "2" to ("9:24" to "10:12"),
    "Break" to ("10:18" to "10:22"),
    "3" to ("10:22" to "11:10"),
    "4" to ("11:16" to "12:06"),
    "Lunch" to ("12:06" to "12:48"),
    "5" to ("12:54" to "1:42"),
    "6" to ("1:48" to "2:36"),
    "7" to ("2:42" to "3:30"),
)

val schedules = mapOf(

    MONDAY to normal,

    TUESDAY to linkedMapOf(
        "1" to ("8:30" to "9:40"),
        "Break" to ("9:40" to "9:45"),
        "2" to ("9:50" to "11:00"),
        "5" to ("11:06" to "12:16"),
        "Lunch" to ("12:16" to "12:58"),
        "6" to ("1:04" to "2:14"),
        "7" to ("2:20" to "3:30"),
    ),

    WEDNESDAY to linkedMapOf(
        "3" to ("8:30" to "9:40"),
        "Break" to ("9:40" to "9:45"),
        "4 (Ext.)" to ("9:50" to "10:24"),
        "4" to ("10:28" to "11:38"),
        "Lunch" to ("11:38" to "12:22"),
        "5" to ("12:27" to "1:37"),
        "6" to ("1:43" to "2:53"),
    ),

    THURSDAY to linkedMapOf(
        "1" to ("8:30" to "9:40"),
        "Break" to ("9:40" to "9:45"),
        "2" to ("9:50" to "11:00"),
        "3" to ("11:06" to "12:16"),
        "Lunch" to ("12:16" to "12:58"),
        "4" to ("1:04" to "2:14"),
        "7" to ("2:20" to "3:30"),
    ),

    FRIDAY to normal,

    SATURDAY to null,

    SUNDAY to null

)