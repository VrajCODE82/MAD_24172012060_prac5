package screen

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mad_24172012060_prac5.ui.theme.MAD_24172012060_prac5Theme

@Composable
    fun FormField(
    label: String,
    textState: String,
    onTextChange: (String) -> Unit,
    isPasswordField: Boolean = false,
    isNumber: Boolean = false
) {
    Row(modifier = Modifier.fillMaxWidth().padding(10.dp)) {
        if (!isNumber) {
            OutlinedTextField(
                value = textState,
                onValueChange = onTextChange,
                modifier = Modifier.padding(start = 16.dp),
                textStyle = LocalTextStyle.current.copy(fontSize = 20.sp),
                visualTransformation = if (isPasswordField)
                    PasswordVisualTransformation()
                else
                    VisualTransformation.None,
                label = { Text("Enter $label") },
                placeholder = { Text("enter $label") }
            )
        } else {
            NumericOutlinedTextField(
                label = label,
                value = textState,
                modifier = Modifier.padding(start = 16.dp),
                onValueChange = onTextChange
            )
        }
    }
}

@Composable
fun NumericOutlinedTextField(
    label: String,
    value: String,
    modifier: Modifier,
    onValueChange: (String) -> Unit
) {
    OutlinedTextField(
        value = value,
        onValueChange = { newText ->
            if (newText.all { it.isDigit() }) {
                onValueChange(newText)
            }
        },
        modifier = modifier,
        label = { Text("Enter $label") },
        textStyle = LocalTextStyle.current.copy(fontSize = 18.sp),
        placeholder = { Text("Enter $label") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        visualTransformation = VisualTransformation.None
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MAD_24172012060_prac5Theme {
        FormField("Android", "", {})
    }
}
