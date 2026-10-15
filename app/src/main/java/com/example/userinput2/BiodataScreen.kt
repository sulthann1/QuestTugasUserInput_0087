package com.example.userinput2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource

@Composable
fun BiodataScreen(modifier: Modifier = Modifier, snackbarHostState: SnackbarHostState) {
    var textNamaDepan by remember { mutableStateOf("") }
    var textNamaBelakang by remember { mutableStateOf("") }
    var textEmail by remember { mutableStateOf("") }
    var textTglLahir by remember { mutableStateOf("") }
    var textExperience by remember { mutableStateOf("") }

    var checkAndroid by remember { mutableStateOf(false) }
    var checkUiUx by remember { mutableStateOf(false) }
    var checkWeb by remember { mutableStateOf(false) }

    val coroutineScope = rememberCoroutineScope()

    Box(modifier = modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.spider_bg),
            contentDescription = stringResource(id = R.string.cd_background),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(fraction = 0.4f)
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = dimensionResource(id = R.dimen.box_top_margin))
                .background(
                    color = colorResource(id = R.color.white_background),
                    shape = RoundedCornerShape(
                        topStart = dimensionResource(id = R.dimen.corner_radius_box),
                        topEnd = dimensionResource(id = R.dimen.corner_radius_box)
                    )
                )
                .padding(dimensionResource(id = R.dimen.padding_large))
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(id = R.string.form_title),
                    fontSize = dimensionResource(id = R.dimen.font_title).value.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(id = R.color.purple_title)
                )
                Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacer_small)))

                Text(
                    text = stringResource(id = R.string.form_subtitle),
                    fontSize = dimensionResource(id = R.dimen.font_subtitle).value.sp,
                    color = colorResource(id = R.color.gray_subtitle)
                )
                Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacer_large)))