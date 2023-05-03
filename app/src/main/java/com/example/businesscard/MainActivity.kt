package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard(
                        frontText = stringResource(R.string.front_text),
                        backText = stringResource(R.string.back_text),
                        companyName = stringResource(R.string.company_name),
                        faceImage = painterResource(R.drawable.no_image_man),
                        faceImageDescription = stringResource(R.string.face_image_description),
                        position = stringResource(R.string.position),
                        yourName = stringResource(R.string.your_name),
                        addressText = stringResource(R.string.address_text),
                        yourAddress = stringResource(R.string.your_address),
                        faxText = stringResource(R.string.fax_text),
                        yourFax = stringResource(R.string.your_fax),
                        phoneNumberText = stringResource(R.string.phone_number_text),
                        yourPhoneNumber = stringResource(R.string.your_phone_number),
                        emailText = stringResource(R.string.email_text),
                        yourEmail = stringResource(R.string.your_email),
                        companyDescriptionHeadLine = stringResource(R.string.company_description_head_line),
                        companyImage = painterResource(R.drawable.your_company_image),
                        companyImageDescription = stringResource(R.string.company_image_description),
                        companyDescription = stringResource(R.string.company_description),
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCard(
    frontText: String,
    backText: String,
    companyName: String,
    faceImage: Painter,
    faceImageDescription: String,
    position: String,
    yourName: String,
    addressText: String,
    yourAddress: String,
    faxText: String,
    yourFax: String,
    phoneNumberText: String,
    yourPhoneNumber: String,
    emailText: String,
    yourEmail: String,
    companyDescriptionHeadLine: String,
    companyImage: Painter,
    companyImageDescription: String,
    companyDescription: String,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.LightGray)
    ) {
        // Front side
        Column (
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .background(color = Color.LightGray)
        ) {
            Text(
                text = frontText,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                modifier = modifier
                    .align(alignment = Alignment.Start)
                    .padding(start = 30.dp, bottom = 5.dp)
            )
            Column(
                verticalArrangement = Arrangement.SpaceBetween,
                modifier = modifier
                    .background(color = Color.White)
                    .height(200.dp)
                    .width(320.dp)
                    .padding(10.dp)
            ) {
                Text(
                    text = companyName,
                    fontWeight = FontWeight.Bold,
                    modifier = modifier.align(alignment = Alignment.Start)
                )
                Row(modifier = modifier.fillMaxWidth()) {
                    Image(
                        painter = faceImage,
                        contentDescription = faceImageDescription,
                        modifier = modifier
                            .weight(0.4F)
                            .height(100.dp)
                            .width(60.dp)
                    )
                    Column(
                        modifier = modifier
                            .align(Alignment.CenterVertically)
                            .weight(0.6F)
                    ) {
                        Text(
                            text = position,
                            modifier = modifier
                                .align(alignment = Alignment.CenterHorizontally)
                        )
                        Text(
                            text = yourName,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = modifier
                                .align(alignment = Alignment.CenterHorizontally)
                        )
                    }
                }
                Column() {
                    Row() {
                        Row(modifier = modifier.weight(0.5F)) {
                            Text(
                                text = addressText,
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = modifier.padding(end = 7.dp)
                            )
                            Text(
                                text = yourAddress,
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = modifier
                            )
                        }
                        Row(modifier = modifier.weight(0.5F)){
                            Text(
                                text = faxText,
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = modifier.padding(end = 7.dp)
                            )
                            Text(
                                text = yourFax,
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = modifier
                            )
                        }
                    }
                    Row() {
                        Row(modifier = modifier.weight(0.5F)) {
                            Text(
                                text = phoneNumberText,
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = modifier.padding(end = 7.dp)
                            )
                            Text(
                                text = yourPhoneNumber,
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = modifier
                            )
                        }
                        Row(modifier = modifier.weight(0.5F)) {
                            Text(
                                text = emailText,
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = modifier.padding(end = 7.dp)
                            )
                            Text(
                                text = yourEmail,
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = modifier
                            )
                        }
                    }
                }
            }
        }

        // Back side
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .background(color = Color.LightGray)
        ){
            Text(
                text = backText,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                modifier = modifier
                    .align(alignment = Alignment.Start)
                    .padding(start = 30.dp)
            )
            Column(
                verticalArrangement = Arrangement.SpaceAround,
                modifier = modifier
                    .background(color = Color.White)
                    .height(200.dp)
                    .width(320.dp)
                    .padding(10.dp)
            ) {
                Text(
                    text = companyDescriptionHeadLine,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = modifier.align(Alignment.CenterHorizontally)
                )
                Row() {
                    Image(
                        painter = companyImage,
                        contentDescription = companyImageDescription,
                        modifier = modifier
                            .height(100.dp)
                            .width(100.dp)
                            .padding(end = 10.dp)
                            .align(alignment = Alignment.CenterVertically)
                    )
                    Text(
                        text = companyDescription,
                        textAlign = TextAlign.Justify,
                        fontSize = 12.sp,
                        style = LocalTextStyle.current.merge(
                            TextStyle(
                                lineHeight = 1.5.em,
                                platformStyle = PlatformTextStyle(
                                    includeFontPadding = false)
                            )
                        )
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        BusinessCard(
            frontText = stringResource(R.string.front_text),
            backText = stringResource(R.string.back_text),
            companyName = stringResource(R.string.company_name),
            faceImage = painterResource(R.drawable.no_image_man),
            faceImageDescription = stringResource(R.string.face_image_description),
            position = stringResource(R.string.position),
            yourName = stringResource(R.string.your_name),
            addressText = stringResource(R.string.address_text),
            yourAddress = stringResource(R.string.your_address),
            faxText = stringResource(R.string.fax_text),
            yourFax = stringResource(R.string.your_fax),
            phoneNumberText = stringResource(R.string.phone_number_text),
            yourPhoneNumber = stringResource(R.string.your_phone_number),
            emailText = stringResource(R.string.email_text),
            yourEmail = stringResource(R.string.your_email),
            companyDescriptionHeadLine = stringResource(R.string.company_description_head_line),
            companyImage = painterResource(R.drawable.your_company_image),
            companyImageDescription = stringResource(R.string.company_image_description),
            companyDescription = stringResource(R.string.company_description),
        )
    }
}