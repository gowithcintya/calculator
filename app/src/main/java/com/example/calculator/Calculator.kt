package com.example.calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculator.ui.theme.LightGray
import com.example.calculator.ui.theme.MediumGray
import com.example.calculator.ui.theme.Orange

val BUTTON_SPACING = 8.dp
const val FIRST_WEIGHT = 1f
const val SECOND_WEIGHT = 2f

@Composable
fun Calculator(
    state: CalculatorState,
    onAction: (CalculatorAction) -> Unit,
    modifier: Modifier = Modifier,
    buttonSpacing: Dp = 8.dp,
) {
    Box(modifier = modifier) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {
            Text(
                text = state.number1 + (state.operation?.symbol ?: "") + state.number2,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                fontWeight = FontWeight.Light,
                fontSize = 80.sp,
                color = Color.White,
                maxLines = 2
            )
            FirstRow(onAction)
            SecondRow(onAction)
            ThirdRow(onAction)
            FourthRow(onAction)
            FifthRow(onAction)
        }
    }
}

@Composable
fun FirstRow(
    onAction: (CalculatorAction) -> Unit,
    buttonSpacing: Dp = BUTTON_SPACING
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
    ) {
        CalculatorButton(
            symbol = "AC",
            modifier = Modifier
                .background(LightGray)
                .aspectRatio(SECOND_WEIGHT)
                .weight(SECOND_WEIGHT),
            onClick = {
                onAction(CalculatorAction.Clear)
            }
        )

        CalculatorButton(
            symbol = "Del",
            modifier = Modifier
                .background(LightGray)
                .aspectRatio(FIRST_WEIGHT)
                .weight(FIRST_WEIGHT),
            onClick = {
                onAction(CalculatorAction.Delete)
            }
        )

        CalculatorButton(
            symbol = "/",
            modifier = Modifier
                .background(Orange)
                .aspectRatio(FIRST_WEIGHT)
                .weight(FIRST_WEIGHT),
            onClick = {
                onAction(CalculatorAction.Operation(CalculatorOperation.Divide))
            }
        )
    }
}

@Composable
fun SecondRow(
    onAction: (CalculatorAction) -> Unit,
    buttonSpacing: Dp = BUTTON_SPACING
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
    ) {
        CalculatorButton(
            symbol = "7",
            modifier = Modifier
                .background(MediumGray)
                .aspectRatio(FIRST_WEIGHT)
                .weight(FIRST_WEIGHT),
            onClick = {
                onAction(CalculatorAction.Number(7))
            }
        )

        CalculatorButton(
            symbol = "8",
            modifier = Modifier
                .background(MediumGray)
                .aspectRatio(FIRST_WEIGHT)
                .weight(FIRST_WEIGHT),
            onClick = {
                onAction(CalculatorAction.Number(8))
            }
        )

        CalculatorButton(
            symbol = "9",
            modifier = Modifier
                .background(MediumGray)
                .aspectRatio(FIRST_WEIGHT)
                .weight(FIRST_WEIGHT),
            onClick = {
                onAction(CalculatorAction.Number(9))
            }
        )

        CalculatorButton(
            symbol = "x",
            modifier = Modifier
                .background(Orange)
                .aspectRatio(FIRST_WEIGHT)
                .weight(FIRST_WEIGHT),
            onClick = {
                onAction(CalculatorAction.Operation(CalculatorOperation.Multiply))
            }
        )
    }
}

@Composable
fun ThirdRow(
    onAction: (CalculatorAction) -> Unit,
    buttonSpacing: Dp = BUTTON_SPACING
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
    ) {
        CalculatorButton(
            symbol = "4",
            modifier = Modifier
                .background(MediumGray)
                .aspectRatio(FIRST_WEIGHT)
                .weight(FIRST_WEIGHT),
            onClick = {
                onAction(CalculatorAction.Number(4))
            }
        )

        CalculatorButton(
            symbol = "5",
            modifier = Modifier
                .background(MediumGray)
                .aspectRatio(FIRST_WEIGHT)
                .weight(FIRST_WEIGHT),
            onClick = {
                onAction(CalculatorAction.Number(5))
            }
        )

        CalculatorButton(
            symbol = "5",
            modifier = Modifier
                .background(MediumGray)
                .aspectRatio(FIRST_WEIGHT)
                .weight(FIRST_WEIGHT),
            onClick = {
                onAction(CalculatorAction.Number(6))
            }
        )

        CalculatorButton(
            symbol = "-",
            modifier = Modifier
                .background(Orange)
                .aspectRatio(FIRST_WEIGHT)
                .weight(FIRST_WEIGHT),
            onClick = {
                onAction(CalculatorAction.Operation(CalculatorOperation.Subtract))
            }
        )
    }
}

@Composable
fun FourthRow(
    onAction: (CalculatorAction) -> Unit,
    buttonSpacing: Dp = BUTTON_SPACING
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
    ) {
        CalculatorButton(
            symbol = "1",
            modifier = Modifier
                .background(MediumGray)
                .aspectRatio(FIRST_WEIGHT)
                .weight(FIRST_WEIGHT),
            onClick = {
                onAction(CalculatorAction.Number(1))
            }
        )

        CalculatorButton(
            symbol = "2",
            modifier = Modifier
                .background(MediumGray)
                .aspectRatio(FIRST_WEIGHT)
                .weight(FIRST_WEIGHT),
            onClick = {
                onAction(CalculatorAction.Number(2))
            }
        )

        CalculatorButton(
            symbol = "3",
            modifier = Modifier
                .background(MediumGray)
                .aspectRatio(FIRST_WEIGHT)
                .weight(FIRST_WEIGHT),
            onClick = {
                onAction(CalculatorAction.Number(3))
            }
        )

        CalculatorButton(
            symbol = "+",
            modifier = Modifier
                .background(Orange)
                .aspectRatio(FIRST_WEIGHT)
                .weight(FIRST_WEIGHT),
            onClick = {
                onAction(CalculatorAction.Operation(CalculatorOperation.Add))
            }
        )
    }
}

@Composable
fun FifthRow(
    onAction: (CalculatorAction) -> Unit,
    buttonSpacing: Dp = BUTTON_SPACING
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
    ) {
        CalculatorButton(
            symbol = "0",
            modifier = Modifier
                .background(MediumGray)
                .aspectRatio(SECOND_WEIGHT)
                .weight(SECOND_WEIGHT),
            onClick = {
                onAction(CalculatorAction.Number(0))
            }
        )

        CalculatorButton(
            symbol = ".",
            modifier = Modifier
                .background(MediumGray)
                .aspectRatio(FIRST_WEIGHT)
                .weight(FIRST_WEIGHT),
            onClick = {
                onAction(CalculatorAction.Decimal)
            }
        )

        CalculatorButton(
            symbol = "=",
            modifier = Modifier
                .background(Orange)
                .aspectRatio(FIRST_WEIGHT)
                .weight(FIRST_WEIGHT),
            onClick = {
                onAction(CalculatorAction.Calculate)
            }
        )
    }
}

@Composable
@Preview
fun CalculatorPreview() {
    Calculator(
        state = CalculatorState(),
        onAction = {}
    )
}
