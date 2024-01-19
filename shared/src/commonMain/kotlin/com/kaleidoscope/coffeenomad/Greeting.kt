package com.kaleidoscope.coffeenomad

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import com.kaleidoscope.coffeenomad.ui.theme.CoffeeNomadTheme
import dev.icerock.moko.resources.compose.colorResource
import dev.icerock.moko.resources.compose.stringResource
import org.jetbrains.compose.resources.ExperimentalResourceApi

@OptIn(ExperimentalResourceApi::class)
@Composable
fun App() {
    CoffeeNomadTheme {
        val string: String = stringResource(MR.strings.home)
        val string2: String = stringResource(MR.strings.setting)
        val color: Color = colorResource(MR.colors.valueColor)
        var greetingText by remember { mutableStateOf(string) }
        var showImage by remember { mutableStateOf(false) }

        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = {
                greetingText = string2
                showImage = !showImage
            }) {
                Text(greetingText)
            }
//            AnimatedVisibility(showImage) {
//                Image(
//                    painterResource(ResourcesCompat.getDrawable()),
//                    null
//                )
//            }
        }
    }
}