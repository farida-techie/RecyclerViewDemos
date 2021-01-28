package com.malkinfo.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.malkinfo.recyclerviewdemo.model.FruitsData
import com.malkinfo.recyclerviewdemo.uitle.FruitsAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var fruitsAdapter:FruitsAdapter
    private lateinit var fruitsData:ArrayList<FruitsData>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /**set init*/
        fruitsData = ArrayList<FruitsData>()
        fruitsAdapter = FruitsAdapter(fruitsData)
        fruitsRecycler.layoutManager = LinearLayoutManager(this)
        fruitsRecycler.adapter = fruitsAdapter
          /**set list*/
        listFruits()
    }
   /**ok now we set dummy data*/
    fun listFruits(){
       fruitsData.add(FruitsData(R.drawable.watermelon,"1. Watermelon:","2 ½ cups diced (350 grams): 100 calories and 25 grams sugar"))
       fruitsData.add(FruitsData(R.drawable.strawberry,"2. Strawberry:","About 2 cups or 16 medium berries (294 grams): 100 calories and 14.3 grams sugar"))
       fruitsData.add(FruitsData(R.drawable.cantaloupe,"3. Cantaloupe:","About half a medium melon (268 grams): 100 calories and 22 grams sugar"))
       fruitsData.add(FruitsData(R.drawable.peach,"4. Peach: ","1 ¾ peaches (245 grams): 100 calories and 26.67 grams sugar"))
       fruitsData.add(FruitsData(R.drawable.blackberry,"5. Blackberry:","About 1 ½ cups (232.3 grams): 100 calories and 11.3 grams sugar"))
       fruitsData.add(FruitsData(R.drawable.pineapple,"6. Pineapple: ","1 ⅓ cups of chunks (224 grams): 100 calories and 20 grams sugar"))
       fruitsData.add(FruitsData(R.drawable.plum,"7. Plum: ","About two small plums (215.7 grams): 100 calories and 22.8 grams sugar"))
       fruitsData.add(FruitsData(R.drawable.orange,"8. Orange: ","About 1 ¼ oranges (192.5 grams): 100 calories and 17.5 grams sugar"))
       fruitsData.add(FruitsData(R.drawable.raspberry,"9. Raspberry:","About 1 ½ cups (190 grams): 100 calories and 7.8 grams sugar"))
       fruitsData.add(FruitsData(R.drawable.apples,"10. Apples:","About one medium apple (186 grams): 100 calories and19.23 grams sugar"))
       fruitsData.add(FruitsData(R.drawable.blueberry,"11. Blueberry:","About 1 ⅕ cups (174 grams): 100 calories and 17.64 grams sugar"))
       fruitsData.add(FruitsData(R.drawable.pear,"12. Pear:","One medium pear (166 grams): 100 calories and 16 grams sugar"))
       fruitsData.add(FruitsData(R.drawable.kiwi,"13. Kiwi:","About three small-to-medium kiwis (164.4 grams): 100 calories and 14.44 grams sugar"))
       fruitsData.add(FruitsData(R.drawable.cherry,"14. Cherry: ","1 cup or about 21 cherries (140 grams): 100 calories and 6 grams sugar"))
       fruitsData.add(FruitsData(R.drawable.grape,"15. Grape:","About 24 grapes or ¾ cup (140 grams): 100 calories and 22.2 grams sugar"))
       fruitsData.add(FruitsData(R.drawable.banana,"16. Banana: ","About four-fifths of one medium banana (114.55 grams): 100 calories and 17.27 grams sugar"))
       fruitsData.add(FruitsData(R.drawable.avocado,"17. Avocado: ","About three-fifths of one small avocado (60 grams): 100 calories and 0 grams sugar"))
    }

}