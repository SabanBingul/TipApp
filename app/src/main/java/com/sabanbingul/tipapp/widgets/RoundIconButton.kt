package com.sabanbingul.tipapp.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

val IconButtonSizeModifier = Modifier.size(48.dp)
@Composable
fun RoundIconButton(
    modifier: Modifier = Modifier,
    imageVector : ImageVector,
    onClick : () -> Unit,
    tint : Color = Color.Black.copy(alpha = 0.8f),
    backgroundColor : Color = MaterialTheme.colorScheme.background,
    elevation : Dp = 4.dp
){
    Card(modifier = modifier
        .padding(all = 4.dp)
        .size(48.dp)
        .shadow(elevation, shape = CircleShape)
        .clickable { onClick.invoke() }
        .then(IconButtonSizeModifier),
        shape = CircleShape

    ) {
        Box(modifier = Modifier
            .background(color = backgroundColor, shape = CircleShape)
            .size(48.dp),
            contentAlignment = Alignment.Center) {
            Icon(imageVector = imageVector,
                contentDescription = "Plus or minus icon",
                tint = tint,
                modifier = Modifier.size(24.dp))
        }
    }
}