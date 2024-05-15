package com.example.lazy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lazy.data.Contact

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Data()
        }
    }
}

@Composable
fun ContactCard(modifier: Modifier = Modifier, contactObjects: Contact){

    Card(modifier = Modifier
        .fillMaxWidth()
        .wrapContentHeight()
        .padding(4.dp),
        colors = CardDefaults.cardColors(Color(0xFFFFFFFF)),
        elevation = CardDefaults.cardElevation(1.dp)
        ) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(4.dp)) {

           Card(modifier = Modifier.wrapContentSize(),
               shape = RoundedCornerShape(488.dp)) {


            Image(
                painter = painterResource(contactObjects.picId),
                contentDescription = null,
                modifier
                    .width(84.dp)
                    .fillMaxHeight(),
                contentScale =  ContentScale.Crop,


            )
        }
            Column(verticalArrangement = Arrangement.SpaceBetween, horizontalAlignment = Alignment.Start, modifier = Modifier.fillMaxHeight()) {
                Text(
                    text = stringResource(contactObjects.nameId),
                    fontSize = 24.sp,
                    textAlign = TextAlign.Left,
                    modifier = Modifier.padding(start = 12.dp)
                )
                Row(verticalAlignment = Alignment.Bottom, horizontalArrangement = Arrangement.SpaceBetween ,modifier = Modifier
                    .padding(start = 12.dp)
                    .fillMaxWidth()

                   ) {
                    Text(text = contactObjects.messageId,

                      )
                    Text(text = "Ph:${contactObjects.phoneId}",

                        modifier = Modifier.padding(end = 8.dp)
                       )
                }
            }

        }
    }
}
@Composable
fun Data(){
    val a = Contact(R.drawable.a1,R.string.a1,"hey whatsup", "9094986984")
    val b = Contact(R.drawable.a2,R.string.a2,"okay", "909493434")
    val c = Contact(R.drawable.a3,R.string.a3,"fine", "9094934354")
    val d = Contact(R.drawable.a4,R.string.a4,"yes", "9094986446")
    val e = Contact(R.drawable.a5,R.string.a5,"Hello", "909467567")
    val f = Contact(R.drawable.a6,R.string.a6,"waiting", "9094675674")
    val g = Contact(R.drawable.a7,R.string.a7,"looking", "9094964444")
    val h = Contact(R.drawable.a8,R.string.a8,"hey buddy", "9094986894")
    val i = Contact(R.drawable.a9,R.string.a9,"john whatsup", "90923523984")
    val j = Contact(R.drawable.a10,R.string.a10,"hey ajf ", "909232484")
    val k = Contact(R.drawable.a11,R.string.a11,"coolp", "909454554")
    val l = Contact(R.drawable.a12,R.string.a12,"tomorrow", "45435986984")
    val m = Contact(R.drawable.a13,R.string.a13,"hey be ", "909545584")
    val n = Contact(R.drawable.a14,R.string.a14,"hey darling", "90949875676")
    val o = Contact(R.drawable.a15,R.string.a15,"stop", "9094986454")
    val p = Contact(R.drawable.a16,R.string.a16," whatsup", "9094456984")
    val q = Contact(R.drawable.a17,R.string.a17,"no  whatsup", "9092316984")
    val r = Contact(R.drawable.a18,R.string.a18,"hey cll me", "9034386984")
    val s = Contact(R.drawable.a19,R.string.a19,"hey urgent", "909445544")
    val t = Contact(R.drawable.a20,R.string.a20,"chill out", "905656984")

    val contactList: List<Contact> = listOf(a,b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t)

    LazyColumn(){
        items(contactList){contactList->
            ContactCard(contactObjects = contactList)



        }

    }


}