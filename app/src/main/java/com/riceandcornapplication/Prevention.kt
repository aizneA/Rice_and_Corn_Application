package com.riceandcornapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class PreventionActivity : AppCompatActivity() {

    lateinit var prevent_disease : TextView
    lateinit var category_disease : TextView
    lateinit var category_method : TextView
    lateinit var category_image : ImageView
    lateinit var category_add : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prevention)

        //icon(?)
        val actionBar = supportActionBar
        actionBar!!.setDisplayShowHomeEnabled(true)
        actionBar.setIcon(R.mipmap.rac_launcher)

        category_disease = findViewById(R.id.disease_name)
        category_method = findViewById(R.id.mngmt_detail)
        category_image = findViewById(R.id.figure_1)
        category_add = findViewById(R.id.mngmt_detail_add)

        val name_view = intent.getStringExtra("dis_name")

        category_disease.text = ("Prevention of " + name_view)

        when (category_disease.text) {
            "Prevention of Corn Blight" -> {
                category_method.setText("\t Planting resistant hybrids is the most effective method for controlling NCLB. Partial resistance protects against all four of the known races of the fungus and reduces the rate of disease development by reducing the number and size of the lesions and the amount of spores produced in these lesions, as well as increasing the length of the incubation and latent periods (time taken for new lesions to develop and produce a new crop of spores). \n")
                category_add.setText("\t A one- to two-year rotation away from corn and destruction of old corn residues by tillage will be helpful for controlling NCLB. \t Fungicide sprays are recommended for fresh market sweet corn, hybrid seed production, and dent corn fields planted with susceptible hybrids. The spray schedule should start when the first lesions appear on the leaf below the ear on 50% of the plants. Applications made at tasseling or silking (VT/R1) provide the most consistent results in terms of disease control and yield response. Several fungicides are available for use on corn for NCLB control. Read labels for rates and follow application directions which vary with each fungicide product.")
                category_image.setImageResource(R.drawable.crop_lb)
            }
            "Prevention of Corn Common Rust" -> {
                category_method.setText("\t The best management option is growing corn products with higher levels of tolerance to common rust. General plant tolerance reduces the number and size of pustules and the overall severity of infection.")
                category_add.setText("\t Fungicides can effectively control common rust if initial applications are made while there are only a few pustules present per leaf. Use of fungicides is fairly common in sweet corn and seed corn production, but is rarely warranted in field corn because common rust rarely causes economically damaging yield loss in field corn. Scouting each corn field on a regular schedule will help determine if fungicide applications should be considered. If significant levels of common rust are present on the lower leaves prior to silking and cool, humid, or wet weather is likely to occur a fungicide application may be beneficial.")
                category_image.setImageResource(R.drawable.crop_ccr)
            }
            "Prevention of Corn Gray Leaf Spot" -> {
                category_method.setText("\t Management strategies for gray leaf spot include tillage, crop rotation and planting resistant hybrids.")
                category_add.setText("\t Fungicides may be needed to prevent significant loss when plants are infected early and environmental conditions favor disease. Resistance to the fungicide by the gray leaf spot fungus will develop from continued exclusive use of either azoxystrobin, thiophanate methyl, or fluoxastrobin alone. Always alternate any of these fungicides with one of the others. Alternatively, choose products, such as Headway G or Pillar G, which contain 2 active ingredients. Follow directions on product label for use. In general, azoxystrobin, pyraclostrobin, or fluoxastrobin applications will control gray leaf spot for 28 days. The other three fungicides will control the disease for 14 days. Irrigate according to label directions after application of granular products.")
                category_image.setImageResource(R.drawable.crop_gls)
            }
            "Prevention of Corn Mildew" -> {
                category_method.setText("\t A common cause of the infection of downy mildew in sweet corn, or at least that triggers a proliferation of the infection, is excessive moisture. Saturated or flooded soil can cause an infection, and humid conditions contribute to it. To prevent downy mildew, it is important that sweet corn is grown in soil that drains well and in an area that is not prone to flooding.")
                category_add.setText("\t Other ways of managing or preventing sweet corn downy mildew infections is practicing crop rotation and using varieties that are resistant to the fungus. The spores of the fungi that cause these infections are viable for a long time in the soil, so rotating with crops that are not susceptible to infection can help. Also helpful is clearing out plant debris and destroying it to prevent the spread of the spores. If you do see downy mildew in your corn crop, and you catch it early, you can remove affected plants and leaves to prevent spread. You can also try fungicides recommended by your local extension service or nursery. If the infection persists, stop growing corn in that area and put in a non-susceptible plant for a season or two.")
                category_image.setImageResource(R.drawable.crop_m)
            }
            "Prevention of Rice Brown Spot" -> {
                category_method.setText("\t Improving soil fertility is the first step in managing brown spot. To do this:\n" + "\t \t  ● Monitor soil nutrients regularly;\n" + "\t \t  ● Apply required fertilizers;\n" + "\t \t ● For soils that are low in silicon, apply calcium silicate slag before planting.")
                category_add.setText("\t Fertilizers, however, can be costly and may take many cropping seasons before becoming effective. More economical management options include:\n" + "\t \t ● Use resistant varieties. \n" + " \t \t ● Contact your local agriculture office for up-to-date lists of varieties available.\n" + "\t \t ● Use fungicides (e.g., iprodione, propiconazole, azoxystrobin, trifloxystrobin, and carbendazim) as seed treatments.\n" + "\t \t ● Treat seeds with hot water (53−54°C) for 10−12 minutes before planting, to control primary infection at the seedling stage. To increase effectiveness of treatment, pre-soak seeds in cold water for eight hours.")
                category_image.setImageResource(R.drawable.crop_rbs)
            }
            "Prevention of Rice Leaf Blast" -> {
                category_method.setText("\t The primary control option for blast is to plant resistant varieties. Contact your local agriculture office for up-to-date lists of varieties available.")
                category_add.setText("\t Other crop management measures can also be done, such as:\n" + "\t \t ● Adjust planting time. Sow seeds early, when possible, after the onset of the rainy season.\n" + "\t \t ● Split nitrogen fertilizer application in two or more treatments. Excessive use of fertilizer can increase blast intensity.\n" + "\t \t ● Flood the field as often as possible.\n" + "\t \t ● Silicon fertilizers (e.g., calcium silicate) can be applied to soils that are silicon deficient to reduce blast. However, because of its high cost, silicon should be applied efficiently. Cheap sources of silicon, such as straws of rice genotypes with high silicon content, can be an alternative. Care should be taken to ensure that the straw is free from blast as the fungus can survive on rice straw and the use of infected straw as a silicon source can spread the disease further.\n" + "\t \t ● Systemic fungicides like triazoles and strobilurins can be used judiciously for control to control blast. A fungicide application at heading can be effective in controlling the disease.")
                category_image.setImageResource(R.drawable.crop_rb)
            }
            "Prevention of Rice Leaf Blight" -> {
                category_method.setText("\t Planting resistant varieties has been proven to be the most efficient, most reliable, and cheapest way to control bacterial blight.")
                category_add.setText("\t Other disease control options include:\n" + "\t \t ● Use balanced amounts of plant nutrients, especially nitrogen.\n" + "\t \t ● Ensure good drainage of fields (in conventionally flooded crops) and nurseries.\n" + "\t \t ● Keep fields clean. Remove weed hosts and plow under rice stubble, straw, rice ratoons and volunteer seedlings, which can serve as hosts of bacteria.\n" + "\t \t ● Allow fallow fields to dry in order to suppress disease agents in the soil and plant residues.")
                category_image.setImageResource(R.drawable.crop_rlb)
            }
            "Prevention of Rice Tungro" -> {
                category_method.text = ("\t Once a rice plant is infected by tungro, it cannot be cured. Preventive measures are more effective for the control of tungro than direct disease control measures. Using insecticides to control leafhoppers is often not effective, because green leafhoppers continuously move to surrounding fields and spread tungro rapidly in very short feeding times.")
                category_add.text = ("\t The most practical measures at present, include:\n" + "\t \t ● Grow tungro or leafhopper resistant varieties.This is the most economical means of managing the disease. There are tungro-resistant varieties available for the Philippines, Malaysia, Indonesia, India, and Bangladesh.\n" + "\t \t ● Contact your local agriculture office for up-to-date lists of varieties available.\n" + "\t \t ● Practice synchronous planting with surrounding farms.\n" + "\t \t ● Delayed or late planting, relative to the average date in a given area, makes the field susceptible for Tungro. Late-planted fields also pose a risk to early planting in the next season.\n" + "\t \t ● Adjust planting times to when green leafhopper are not in season or abundant, if known\n" + "\t \t ● Plow infected stubbles immediately after harvest to reduce inoculum sources and destroy the eggs and breeding sites of green leaf hopper.")
                category_image.setImageResource(R.drawable.crop_t)
            }
        }

    }
}