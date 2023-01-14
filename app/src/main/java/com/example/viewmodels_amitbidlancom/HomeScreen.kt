package com.example.viewmodels_amitbidlancom

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun HomeScreen(modifier: Modifier = Modifier,dataClassViewModel: DataClassViewModel = viewModel()) {

     LazyColumn(){
         items(items = dataClassViewModel._tasks){
             Task ->
             listcard(label = Task.label)
         }
     }
}


@Composable
fun listcard(label: String, modifier: Modifier = Modifier) {
    Card(
        Modifier
            .height(70.dp)
            .fillMaxWidth()
            .padding(6.dp)
            .clip(shape = RoundedCornerShape(10.dp)), backgroundColor = Color.Gray) {

            Text(text = label, modifier = Modifier.padding(10.dp), color = Color.White)

    }
}
@Preview(showBackground = true)
@Composable
fun Preview() {
    HomeScreen()
}