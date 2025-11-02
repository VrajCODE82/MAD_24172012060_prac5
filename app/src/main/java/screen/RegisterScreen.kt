package screen


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.mad_24172012060_prac5.R
import com.example.mad_24172012060_prac5.ui.theme.Pink80

@Composable
fun RegisterUI(navController: NavController? = null) {
    var name by remember { mutableStateOf("") }
    var phoneNumber by remember { mutableStateOf("") }
    var city by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp)) {
        Spacer(modifier = Modifier.height(10.dp))
        Image(
            painter = painterResource(R.drawable.guni_pink_logo),
            contentDescription = "Guni Pink Logo",
            modifier = Modifier
                .height(130.dp)
                .align(Alignment.CenterHorizontally),
            contentScale = ContentScale.Fit
        )
        Card(
            elevation = CardDefaults.cardElevation(defaultElevation = 20.dp),
            shape = MaterialTheme.shapes.medium,
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp))
            {
                FormField(
                    label = "Name", textState = name,
                    onTextChange = { name = it })
                FormField(
                    label = "Phone Number", textState = phoneNumber,
                    onTextChange = { phoneNumber = it }
                )
                FormField(
                    label = "City", textState = city,
                    onTextChange = { city = it }
                )
                FormField(
                    label = "email", textState = email,
                    onTextChange = { email = it }
                )
                FormField(
                    label = "Password", textState = password,
                    onTextChange = { password = it }
                )
                FormField(
                    label = "Confirm Password", textState = confirmPassword,
                    onTextChange = { confirmPassword = it }
                )

                Button(onClick = {

                }, modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.CenterHorizontally))
                {
                    Text("Register", fontSize = 18.sp)
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Do you have an account?", fontSize = 16.sp)
            Spacer(modifier = Modifier.width(5.dp))
            TextButton(onClick = {
                navController?.navigate("login")
            }) {
                Text("LOGIN", color = Pink80, fontSize = 18.sp, fontWeight = FontWeight.Bold)
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun RegisterActivityPreview() {
    RegisterUI()
}