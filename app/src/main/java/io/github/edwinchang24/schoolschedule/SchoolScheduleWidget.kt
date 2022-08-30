package io.github.edwinchang24.schoolschedule

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.glance.GlanceModifier
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.GlanceAppWidgetReceiver
import androidx.glance.background
import androidx.glance.layout.*
import androidx.glance.state.GlanceStateDefinition
import androidx.glance.state.PreferencesGlanceStateDefinition
import androidx.glance.text.Text
import androidx.glance.text.TextStyle
import java.util.Calendar.*

class SchoolScheduleWidget : GlanceAppWidget() {

    override val stateDefinition: GlanceStateDefinition<*> = PreferencesGlanceStateDefinition

    @Composable
    override fun Content() = WidgetContent()

    @Composable
    fun WidgetContent() {
        Box(modifier = GlanceModifier.fillMaxSize().background(Color(0, 0, 0))) {
            val dayOfWeek = getInstance().get(DAY_OF_WEEK)
            if (schedules[dayOfWeek] == null) Text("no school today")
            else Schedule(dayOfWeek)
        }
    }

    @Composable
    fun Schedule(dayOfWeek: Int) {
        Column(modifier = GlanceModifier.padding(all = 10.dp)) {
            Text(
                text = when (dayOfWeek) {
                    MONDAY -> "monday"
                    TUESDAY -> "tuesday"
                    WEDNESDAY -> "wednesday"
                    THURSDAY -> "thursday"
                    FRIDAY -> "friday"
                    else -> "???"
                }
            )
            Row(modifier = GlanceModifier.padding(vertical = 10.dp)) {
                schedules[dayOfWeek]?.forEach {
                    Column(modifier = GlanceModifier.padding(horizontal = 4.dp)) {
                        Text(
                            text = it.key,
                            style = TextStyle(fontSize = if (it.key.length == 1) 14.sp else 10.sp),
                            modifier = GlanceModifier.height(20.dp)
                        )
                        Text(text = it.value.first, style = TextStyle(fontSize = 12.sp))
                        Text(text = it.value.second, style = TextStyle(fontSize = 12.sp))
                    }
                }
            }
        }
    }
}

class SchoolScheduleWidgetReceiver : GlanceAppWidgetReceiver() {
    override val glanceAppWidget: GlanceAppWidget = SchoolScheduleWidget()
}
